package Funcionalidades;

import java.util.Scanner;

public class ApoioPsicologico implements InteligenciaArtificial{

    public void realizarApoioPsicologicoComeco(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Eu sou a " + InteligenciaArtificial.NOME + "." + "Como posso te ajudar hoje?");
            System.out.println("0 - Sair");
            System.out.println("1 - 'Algumas sugestões: 'Estou me sentindo mal.'");
            System.out.println("2 - 'Perdi tudos meus bens em um desastre.'");

            System.out.println("Digite: ");
            int escolha_IA = Integer.parseInt(sc.nextLine());

            switch (escolha_IA) {
                case 0:
                    break;
                case 1:
                    System.out.println("Sinto muito por saber que você está passando por um momento difícil. Lembre-se de que você não está sozinho. Se quiser conversar mais sobre o que está sentindo, estou aqui para ouvir. Às vezes, dividir o que sentimos pode aliviar um pouco o peso.\n");
                case 2:
                    System.out.println("Sinto muito por essa perda. Passar por um desastre e perder tudo é algo profundamente doloroso. Você tem todo o direito de se sentir abalado. Se puder, busque apoio com pessoas próximas ou profissionais — e saiba que posso te ajudar a encontrar recursos ou simplesmente estar aqui para conversar.\n");
                default:
                    System.out.println("IA, em desenvolvimento. Escolha uma das opções.");
            }
        }
    }
}
