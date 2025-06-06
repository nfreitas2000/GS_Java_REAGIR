package Funcionalidades;

import Usuarios.PessoaFisica;
import Usuarios.PessoaJuridica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RelatarDesastre {
    private String desastre;
    private String autor;
    private String localizacao;
    private LocalDate dia;
    private LocalTime hora;
    private String relato;

    //Instanciação do objeto formatador da data e hora
    //Em suma, formatoDia e formatoHora carregam como deve ser a formatação, e ao utilizar o metodo .format(), tendo um deles como parametro, o atributo do tipo LocalDate ou LocalTime será exibido no formato deles

    DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

    /***************************************** CONSTRUTORES **************************************/

    public RelatarDesastre(){}

    /************************************ GETTERS AND SETTERS ***********************************/

    public String getRelato() {
        return relato;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    public String getDesastre() {
        return desastre;
    }

    public void setDesastre(String desastre) {
        this.desastre = desastre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    /***************************************** MÉTODOS ******************************************/

    public void Relatorio() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================================================");
        System.out.println("Os dados foram enviados para nossa central:");
        System.out.println("Autor -------------------");
        System.out.println(getAutor());
        System.out.println("Localização -------------------");
        System.out.println(getLocalizacao());

        System.out.println("Data -------------------");
        //PROCESSO DE FORMATAÇÃO DA DATA
        //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
        //depois basta printar esse objeto

        String dataFormatada = getDia().format(formatoDia);
        System.out.println(dataFormatada);

        System.out.println("Hora -------------------");
        //PROCESSO DE FORMATAÇÃO DA HORA
        //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
        //depois basta printar esse objeto

        String horaFormatada = getHora().format(formatoHora);
        System.out.println(horaFormatada);

        System.out.println("Desastre -------------------");
        System.out.println(getDesastre());
        System.out.println("Relato -------------------");
        System.out.println(getRelato());
        System.out.println("==================================================================================");
        System.out.print("Pressione uma tecla para continuar . . .");
        sc.nextLine();
    }

    public void criarRelatorio(PessoaFisica pf){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==================================================================================");
            System.out.println("Selecione o tipo do desastre:");
            System.out.println("0 - Sair");
            System.out.println("1 - Alagamento");
            System.out.println("2 - Incendio");
            System.out.println("3 - Deslizamento");
            System.out.println("4 - Terremoto");
            System.out.println("5 - Outros");

            System.out.print("Digite: ");
            int desastre = Integer.parseInt(sc.nextLine());

            if (desastre == 0) {
                break;
            } else if (desastre == 1) {
                setDesastre("Alagamento");
            } else if (desastre == 2) {
            setDesastre("Incêndio");
            } else if (desastre == 3) {
                setDesastre("Deslizamento");
            } else if (desastre == 4) {
                setDesastre("Terremoto");
            } else {
                setDesastre("Outros");
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Agora, digite o seu relato: ");
            String relatorio = sc.nextLine();
            setRelato(relatorio);

            setAutor(pf.getNome());
            setDia(LocalDate.now());
            setHora(LocalTime.now());
            setLocalizacao(pf.getEndereco().getDadosEndereco());

            Relatorio();
        }
    }
    public void criarRelatorio(PessoaJuridica pj){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==================================================================================");
            System.out.println("Selecione o tipo do desastre:");
            System.out.println("0 - Sair");
            System.out.println("1 - Alagamento");
            System.out.println("2 - Incendio");
            System.out.println("3 - Deslizamento");
            System.out.println("4 - Terremoto");
            System.out.println("5 - Outros");

            System.out.print("Digite: ");
            int desastre = Integer.parseInt(sc.nextLine());

            if (desastre == 0) {
                break;
            } else if (desastre == 1) {
                setDesastre("Alagamento");
            } else if (desastre == 2) {
                setDesastre("Incêndio");
            } else if (desastre == 3) {
                setDesastre("Deslizamento");
            } else if (desastre == 4) {
                setDesastre("Terremoto");
            } else {
                setDesastre("Outros");
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Agora, digite o seu relato: ");
            String relatorio = sc.nextLine();
            setRelato(relatorio);

            setAutor(pj.getNome());
            setDia(LocalDate.now());
            setHora(LocalTime.now());
            setLocalizacao(pj.getEndereco().getDadosEndereco());

            Relatorio();
        }
    }
}