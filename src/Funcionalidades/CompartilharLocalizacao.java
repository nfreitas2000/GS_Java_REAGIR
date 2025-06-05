package Funcionalidades;

import Usuarios.PessoaFisica;
import Usuarios.PessoaJuridica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CompartilharLocalizacao {
    private LocalDate data;
    private LocalTime hora;

    //Instanciação do objeto formatador da data e hora
    //Em suma, formatoDia e formatoHora carregam como deve ser a formatação, e ao utilizar o metodo .format(), tendo um deles como parametro, o atributo do tipo LocalDate ou LocalTime será exibido no formato deles

    DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

    /***************************************** CONSTRUTORES **************************************/

    public CompartilharLocalizacao(){}

    /************************************ GETTERS AND SETTERS ***********************************/

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
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

            //PROCESSO DE FORMATAÇÃO DA DATA
            //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
            //depois basta printar esse objeto

            //PROCESSO DE FORMATAÇÃO DA HORA
            //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
            //depois basta printar esse objeto

            setData(LocalDate.now());
            setHora(LocalTime.now());
            String dataFormatada = getData().format(formatoDia);
            String horaFormatada = getHora().format(formatoHora);

            System.out.println("Data de compartilhamento: " + dataFormatada);
            System.out.println("Hora de compartilhamento: " + horaFormatada);

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

            //PROCESSO DE FORMATAÇÃO DA DATA
            //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
            //depois basta printar esse objeto

            //PROCESSO DE FORMATAÇÃO DA HORA
            //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
            //depois basta printar esse objeto

            setData(LocalDate.now());
            setHora(LocalTime.now());
            String dataFormatada = getData().format(formatoDia);
            String horaFormatada = getHora().format(formatoHora);

            System.out.println("Data de compartilhamento: " + dataFormatada);
            System.out.println("Hora de compartilhamento: " + horaFormatada);

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