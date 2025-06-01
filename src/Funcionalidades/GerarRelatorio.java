package Funcionalidades;

import Usuarios.PessoaFisica;
import Usuarios.PessoaJuridica;

import java.util.Scanner;

public class GerarRelatorio implements InteligenciaArtificial{
    private String data;
    private String hora;

    /***************************************** CONSTRUTORES **************************************/

    public GerarRelatorio(){}

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

    public void gerarRelatorio(PessoaFisica pf){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Olá, eu sou a " + InteligenciaArtificial.NOME + ". Aqui, posso gerar um relatório sobre desastres recém ocorridos perto \n" +
                    "da sua região (" + pf.getEndereco().getRua() + ", " + pf.getEndereco().getNumero() + ").");
            System.out.println("Selecione um desastre que deseja saber sobre informações: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Alagamentos");
            System.out.println("2 - Incendios");
            System.out.println("3 - Deslizamentos");
            System.out.println("4 - Terremotos");

            System.out.print("Digite: ");
            int escolha = Integer.parseInt(sc.nextLine());

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    System.out.println("==================================================================================");
                    System.out.println("Alerta de Alagamento: Nas últimas 48 horas, foram registrados alagamentos na região informada. ");
                    System.out.println("Evite transitar por ruas com acúmulo de água e procure rotas alternativas.");

                    setData("31/05/2025");
                    setHora("19:05");

                    System.out.println("Data do relatório: " + getData());
                    System.out.println("Hora do relatório: " + getHora());
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 2:
                    System.out.println("==================================================================================");
                    System.out.println("Atenção: Focos de incêndio foram detectados próximos à sua região. ");
                    System.out.println("Evite áreas de vegetação seca e mantenha janelas fechadas para evitar a inalação de fumaça.");

                    setData("31/05/2025");
                    setHora("19:05");

                    System.out.println("Data do relatório: " + getData());
                    System.out.println("Hora do relatório: " + getHora());
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 3:
                    System.out.println("==================================================================================");
                    System.out.println("Risco de Deslizamento: Chuvas intensas aumentaram o risco de deslizamentos nas áreas próximas. ");
                    System.out.println("Se você estiver em zona de morro ou encosta, considere evacuar preventivamente.");

                    setData("31/05/2025");
                    setHora("19:05");

                    System.out.println("Data do relatório: " + getData());
                    System.out.println("Hora do relatório: " + getHora());
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 4:
                    System.out.println("==================================================================================");
                    System.out.println("Tremor Registrado: Um leve terremoto foi sentido nas proximidades.");
                    System.out.println("Ainda que sem danos estruturais reportados, verifique rachaduras em paredes e evite elevadores.");

                    setData("31/05/2025");
                    setHora("19:05");

                    System.out.println("Data do relatório: " + getData());
                    System.out.println("Hora do relatório: " + getHora());
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
            }break;
        }
    }
    public void gerarRelatorio(PessoaJuridica pj){
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("==================================================================================");
            System.out.println("Olá, eu sou a " + InteligenciaArtificial.NOME + ". Aqui, posso gerar um relatório sobre desastres recém ocorridos perto da sua região (" + pj.getEndereco().getRua() + ", " + pj.getEndereco().getNumero() + ").");
            System.out.println("Selecione um desastre que deseja saber sobre informações: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Alagamentos");
            System.out.println("2 - Incendios");
            System.out.println("3 - Deslizamentos");
            System.out.println("4 - Terremotos");

            System.out.print("Digite: ");
            int escolha = Integer.parseInt(sc.nextLine());

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    System.out.println("==================================================================================");
                    System.out.println("Alerta de Alagamento: Nas últimas 48 horas, foram registrados alagamentos na região informada. ");
                    System.out.println("Evite transitar por ruas com acúmulo de água e procure rotas alternativas.");

                    setData("31/05/2025");
                    setHora("19:05");

                    System.out.println("Data do relatório: " + getData());
                    System.out.println("Hora do relatório: " + getHora());
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 2:System.out.println("==================================================================================");
                    System.out.println("Atenção: Focos de incêndio foram detectados próximos à sua região. ");
                    System.out.println("Evite áreas de vegetação seca e mantenha janelas fechadas para evitar a inalação de fumaça.");

                    setData("31/05/2025");
                    setHora("19:05");

                    System.out.println("Data do relatório: " + getData());
                    System.out.println("Hora do relatório: " + getHora());
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 3:
                    System.out.println("==================================================================================");
                    System.out.println("Risco de Deslizamento: Chuvas intensas aumentaram o risco de deslizamentos nas áreas próximas. ");
                    System.out.println("Se você estiver em zona de morro ou encosta, considere evacuar preventivamente.");

                    setData("31/05/2025");
                    setHora("19:05");

                    System.out.println("Data do relatório: " + getData());
                    System.out.println("Hora do relatório: " + getHora());
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 4:
                    System.out.println("==================================================================================");
                    System.out.println("Tremor Registrado: Um leve terremoto foi sentido nas proximidades.");
                    System.out.println("Ainda que sem danos estruturais reportados, verifique rachaduras em paredes e evite elevadores.");

                    setData("31/05/2025");
                    setHora("19:05");

                    System.out.println("Data do relatório: " + getData());
                    System.out.println("Hora do relatório: " + getHora());
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
            }break;
        }
    }
}
