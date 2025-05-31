package Funcionalidades;

import Usuarios.PessoaFisica;
import Usuarios.PessoaJuridica;

import java.util.Scanner;

public class CompartilharLocalizacao {
    private String data;
    private String hora;

    /***************************************** CONSTRUTORES **************************************/

    public CompartilharLocalizacao(){}

    /************************************ GETTERS AND SETTERS ***********************************/

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    /***************************************** MÉTODOS ******************************************/

    public void compartilharLocalizacao(PessoaFisica pf){
        Scanner sc = new Scanner(System.in);

        System.out.println("Tem certeza que deseja compartilhar sua localização para membros de sua rede?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        System.out.print("Digite: ");
        int escolha = Integer.parseInt(sc.nextLine());

        if (escolha == 1) {
            System.out.println("==================================================================================");
            System.out.println("A localização atual (" + pf.getEndereco().getRua() + ", " + pf.getEndereco().getNumero() + ") foi compartilhada com membros de sua rede, que incluem: ");
            System.out.println(pf.getContatoEmergencia().getNomeEmergencia() + " (" +  pf.getContatoEmergencia().getRelacionamento() + ")");

            setData("31/05/2025");
            setHora("00:52");

            System.out.println("Data de compartilhamento: " + getData());
            System.out.println("Hora de compartilhamento: " + getHora());

            System.out.println("==================================================================================");
            System.out.print("Pressione uma tecla para continuar . . .");
            sc.nextLine();
        } else if (escolha == 2) {
            System.out.println("==================================================================================");
            System.out.println("Compartilhamento cancelado!");
            System.out.println("==================================================================================");
            System.out.print("Pressione uma tecla para continuar . . .");
            sc.nextLine();
        } else {
            System.out.println("==================================================================================");
            System.out.println("Opção inválida.");
            System.out.println("==================================================================================");
            System.out.print("Pressione uma tecla para continuar . . .");
            sc.nextLine();
        }
    }

    public void compartilharLocalizacao(PessoaJuridica pj){
        Scanner sc = new Scanner(System.in);

        System.out.println("Tem certeza que deseja compartilhar sua localização para membros de sua rede?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        System.out.print("Digite: ");
        int escolha = Integer.parseInt(sc.nextLine());

        if (escolha == 1) {
            System.out.println("==================================================================================");
            System.out.println("A localização atual (" + pj.getEndereco().getRua() + ", " + pj.getEndereco().getNumero() + ") foi compartilhada com membros de sua rede, que incluem: ");
            System.out.println(pj.getContatoEmergencia().getNomeEmergencia() + " (" +  pj.getContatoEmergencia().getRelacionamento() + ")");

            setData("31/05/2025");
            setHora("00:52");

            System.out.println("Data de compartilhamento: " + getData());
            System.out.println("Hora de compartilhamento: " + getHora());

            System.out.println("==================================================================================");
            System.out.print("Pressione uma tecla para continuar . . .");
            sc.nextLine();
        } else if (escolha == 2) {
            System.out.println("==================================================================================");
            System.out.println("Compartilhamento cancelado!");
            System.out.println("==================================================================================");
            System.out.print("Pressione uma tecla para continuar . . .");
            sc.nextLine();
        } else {
            System.out.println("==================================================================================");
            System.out.println("Opção inválida.");
            System.out.println("==================================================================================");
            System.out.print("Pressione uma tecla para continuar . . .");
            sc.nextLine();
        }
    }
}
