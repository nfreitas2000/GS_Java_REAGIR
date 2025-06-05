package Funcionalidades;

import java.util.Scanner;

public class ApoioPsicologico implements InteligenciaArtificial{

    public void realizarApoioPsicologico(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Olá, eu sou a " + InteligenciaArtificial.NOME + ". " + "Como posso te ajudar hoje?");
            System.out.println("0 - Sair");
            System.out.println("1 - 'Algumas sugestões: 'Estou me sentindo mal.'");
            System.out.println("2 - 'Perdi tudos meus bens em um desastre.'");

            System.out.print("Digite: ");
            int escolha_IA = Integer.parseInt(sc.nextLine());

            switch (escolha_IA) {
                case 0:
                    break;
                case 1:
                    System.out.println("==================================================================================");
                    System.out.println("Sinto muito por saber que você está passando por um momento difícil. " +
                            "\nLembre-se de que você não está sozinho. Se quiser conversar mais sobre o que está sentindo, " +
                            "\nestou aqui para ouvir. Às vezes, dividir o que sentimos pode aliviar um pouco o peso.");
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 2:
                    System.out.println("==================================================================================");
                    System.out.println("Sinto muito por essa perda. Passar por um desastre e perder tudo é algo " +
                            "\nprofundamente doloroso. Você tem todo o direito de se sentir abalado. Se puder, busque " +
                            "\napoio com pessoas próximas ou profissionais — e saiba que posso te ajudar a encontrar recursos " +
                            "\nou simplesmente estar aqui para conversar.");
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                default:
                    System.out.println("==================================================================================");
                    System.out.println("IA, em desenvolvimento. Escolha uma das opções.");
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
            }break;
        }
    }
}