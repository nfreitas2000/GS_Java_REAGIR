package Funcionalidades;

import Usuarios.PessoaFisica;
import Usuarios.PessoaJuridica;

import java.util.Scanner;

public class MapearRotas implements InteligenciaArtificial{

    /***************************************** CONSTRUTORES **************************************/

    public MapearRotas() {}

    /***************************************** MÉTODOS ******************************************/

    public void mapearRotas(PessoaFisica pf){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Eu sou a " + InteligenciaArtificial.NOME + ". Estou aqui para te guiar ao centro de evacuação mais próximo, baseado na sua localização:");
            System.out.println(pf.getEndereco().getDadosEndereco());

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Qual rota deseja seguir:");
            System.out.println("0 - Voltar");
            System.out.println("1 - Rota mais rápida (com riscos)");
            System.out.println("2 - Rota mais longa (porém, mais segura)");

            System.out.print("Digite: ");
            int escolha = Integer.parseInt(sc.nextLine());

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    System.out.println("==================================================================================");
                    System.out.println("[Início] → ──┐");
                    System.out.println("             ↓");
                    System.out.println("           [Rua A]");
                    System.out.println("             ↓");
                    System.out.println("           [Rua B]");
                    System.out.println("             ↓");
                    System.out.println("      [Centro de Evacuação]");
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 2:
                    System.out.println("==================================================================================");
                    System.out.println("[Início] → ───────┐");
                    System.out.println("                  ↓");
                    System.out.println("             [Praça Verde]");
                    System.out.println("                  ↓");
                    System.out.println("         [Rua das Árvores]");
                    System.out.println("                  ↓");
                    System.out.println("     [Ponto de Apoio Médico]");
                    System.out.println("                  ↓");
                    System.out.println("       [Centro de Evacuação]");
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }break;
        }
    }
    public void mapearRotas(PessoaJuridica pj){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Eu sou a " + InteligenciaArtificial.NOME + ". Estou aqui para te guiar ao centro de evacuação mais próximo, baseado na sua localização:");
            System.out.println(pj.getEndereco().getDadosEndereco());

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Qual rota deseja seguir:");
            System.out.println("0 - Voltar");
            System.out.println("1 - Rota mais rápida (com riscos)");
            System.out.println("2 - Rota mais longa (porém, mais segura)");

            System.out.print("Digite: ");
            int escolha = Integer.parseInt(sc.nextLine());

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    System.out.println("==================================================================================");
                    System.out.println("[Início] → ──┐");
                    System.out.println("             ↓");
                    System.out.println("           [Rua A]");
                    System.out.println("             ↓");
                    System.out.println("           [Rua B]");
                    System.out.println("             ↓");
                    System.out.println("      [Centro de Evacuação]");
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 2:
                    System.out.println("==================================================================================");
                    System.out.println("[Início] → ───────┐");
                    System.out.println("                  ↓");
                    System.out.println("             [Praça Verde]");
                    System.out.println("                  ↓");
                    System.out.println("         [Rua das Árvores]");
                    System.out.println("                  ↓");
                    System.out.println("     [Ponto de Apoio Médico]");
                    System.out.println("                  ↓");
                    System.out.println("       [Centro de Evacuação]");
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }break;
        }
    }
}
