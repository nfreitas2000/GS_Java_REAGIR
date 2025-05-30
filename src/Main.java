import Individuo.ContatoEmergencia;
import Individuo.ContatoPessoal;
import Individuo.Endereco;
import Usuarios.PessoaFisica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //===========================================================================================================

        // CRIAÇÃO DE PESSOA FÍSICA GENÉRICA

        Endereco enderecoPessoaFisica = new Endereco("Rua Almeida", "43", "00000001", "Casa");
        ContatoPessoal contatoPessoalPessoaFisica = new ContatoPessoal("pessoaFisica@gmail.com", "+55", "11", "999999999");
        ContatoEmergencia contatoEmergenciaPessoaFisica = new ContatoEmergencia("Katarina", "Mãe", "katarina@gmail.com", "+55", "11", "888888888");


        PessoaFisica pessoaFisica = new PessoaFisica("Eduardo", contatoEmergenciaPessoaFisica, contatoPessoalPessoaFisica, enderecoPessoaFisica, "12345678901", "1231231231", "Masculino",27);

        //===========================================================================================================

        // IMPLEMENTAÇÕES

        while (true){

            System.out.println("========================================================");
            System.out.println("Seja bem-vindo ao simulador REAGIR!");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Simular pessoa física");

            System.out.print("Digite: ");
            int escolha = Integer.parseInt(sc.nextLine());

            switch (escolha){
                case 0:
                    System.out.println("Encerrando o programa . . .");
                    break;
                case 1:
                    while (true){

                        System.out.println("Seja bem-vindo, " + pessoaFisica.getNome() + "!");
                        System.out.println("O que deseja realizar?");
                        System.out.println("0 - Sair");
                        System.out.println("1 - Compartilhar localização");
                        System.out.println("2 - Mapear rotas para o centro de evacuação mais próximo");
                        System.out.println("3 - Receber apoio psicológico");
                        System.out.println("4 - Gerar relatórios de desastres extremos na minha região");
                        System.out.println("5 - Exibir conteúdos educativos");
                        System.out.println("6 - Exibir menu de ajuda comunitária");
                        System.out.println("7 - Exibir meus dados");
                        System.out.println("8 - Alterar meus dados");


                        System.out.print("Digite: ");
                        int escolha_pessoaF = Integer.parseInt(sc.nextLine());

                        switch (escolha_pessoaF){
                            case 0:
                                break;
                            case 7:
                                pessoaFisica.getDadosPessoa();
                                System.out.print("Pressione uma tecla para continuar . . .");
                                sc.nextLine();
                                continue;
                            case 8:
                                pessoaFisica.alterarDadosPessoa();
                                System.out.print("Pressione uma tecla para continuar . . .");
                                sc.nextLine();
                                continue;
                            default:
                                System.out.println("Item selecionado inválido. Tente novamente.");
                        }
                    }
                default:
                    System.out.println("Item digitado inválido. Tente novamente.");
                    continue;
            }break;
        }
    }
}
