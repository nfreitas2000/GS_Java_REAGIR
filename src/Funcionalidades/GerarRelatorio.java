package Funcionalidades;

import Usuarios.PessoaFisica;
import Usuarios.PessoaJuridica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GerarRelatorio implements InteligenciaArtificial{
    private LocalDate data;
    private LocalTime hora;

    //Instanciação do objeto formatador da data e hora
    //Em suma, formatoDia e formatoHora carregam como deve ser a formatação, e ao utilizar o metodo .format(), tendo um deles como parametro, o atributo do tipo LocalDate ou LocalTime será exibido no formato deles

    DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

    /***************************************** CONSTRUTORES **************************************/

    public GerarRelatorio(){}

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

                    //PROCESSO DE FORMATAÇÃO DA DATA
                    //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
                    //depois basta printar esse objeto

                    //PROCESSO DE FORMATAÇÃO DA HORA
                    //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
                    //depois basta printar esse objeto

                    setData(LocalDate.now());
                    setHora(LocalTime.now());
                    String dataFormatadaAlagamento = getData().format(formatoDia);
                    String horaFormatadaAlagamento = getHora().format(formatoHora);

                    System.out.println("Data do relatório: " + dataFormatadaAlagamento);
                    System.out.println("Hora do relatório: " + horaFormatadaAlagamento);
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 2:
                    System.out.println("==================================================================================");
                    System.out.println("Atenção: Focos de incêndio foram detectados próximos à sua região. ");
                    System.out.println("Evite áreas de vegetação seca e mantenha janelas fechadas para evitar a inalação de fumaça.");

                    //PROCESSO DE FORMATAÇÃO DA DATA
                    //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
                    //depois basta printar esse objeto

                    //PROCESSO DE FORMATAÇÃO DA HORA
                    //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
                    //depois basta printar esse objeto

                    setData(LocalDate.now());
                    setHora(LocalTime.now());
                    String dataFormatadaIncendio = getData().format(formatoDia);
                    String horaFormatadaIncendio = getHora().format(formatoHora);

                    System.out.println("Data do relatório: " + dataFormatadaIncendio);
                    System.out.println("Hora do relatório: " + horaFormatadaIncendio);
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 3:
                    System.out.println("==================================================================================");
                    System.out.println("Risco de Deslizamento: Chuvas intensas aumentaram o risco de deslizamentos nas áreas próximas. ");
                    System.out.println("Se você estiver em zona de morro ou encosta, considere evacuar preventivamente.");

                    //PROCESSO DE FORMATAÇÃO DA DATA
                    //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
                    //depois basta printar esse objeto

                    //PROCESSO DE FORMATAÇÃO DA HORA
                    //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
                    //depois basta printar esse objeto

                    setData(LocalDate.now());
                    setHora(LocalTime.now());
                    String dataFormatadaDeslizamento = getData().format(formatoDia);
                    String horaFormatadaDeslizamento = getHora().format(formatoHora);

                    System.out.println("Data do relatório: " + dataFormatadaDeslizamento);
                    System.out.println("Hora do relatório: " + horaFormatadaDeslizamento);
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 4:
                    System.out.println("==================================================================================");
                    System.out.println("Tremor Registrado: Um leve terremoto foi sentido nas proximidades.");
                    System.out.println("Ainda que sem danos estruturais reportados, verifique rachaduras em paredes e evite elevadores.");

                    //PROCESSO DE FORMATAÇÃO DA DATA
                    //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
                    //depois basta printar esse objeto

                    //PROCESSO DE FORMATAÇÃO DA HORA
                    //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
                    //depois basta printar esse objeto

                    setData(LocalDate.now());
                    setHora(LocalTime.now());
                    String dataFormatadaTerremoto = getData().format(formatoDia);
                    String horaFormatadaTerremoto = getHora().format(formatoHora);

                    System.out.println("Data do relatório: " + dataFormatadaTerremoto);
                    System.out.println("Hora do relatório: " + horaFormatadaTerremoto);
                    System.out.println("==================================================================================");
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

                    //PROCESSO DE FORMATAÇÃO DA DATA
                    //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
                    //depois basta printar esse objeto

                    //PROCESSO DE FORMATAÇÃO DA HORA
                    //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
                    //depois basta printar esse objeto

                    setData(LocalDate.now());
                    setHora(LocalTime.now());
                    String dataFormatadaAlagamento = getData().format(formatoDia);
                    String horaFormatadaAlagamento = getHora().format(formatoHora);

                    System.out.println("Data do relatório: " + dataFormatadaAlagamento);
                    System.out.println("Hora do relatório: " + horaFormatadaAlagamento);
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 2:System.out.println("==================================================================================");
                    System.out.println("Atenção: Focos de incêndio foram detectados próximos à sua região. ");
                    System.out.println("Evite áreas de vegetação seca e mantenha janelas fechadas para evitar a inalação de fumaça.");

                    //PROCESSO DE FORMATAÇÃO DA DATA
                    //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
                    //depois basta printar esse objeto

                    //PROCESSO DE FORMATAÇÃO DA HORA
                    //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
                    //depois basta printar esse objeto

                    setData(LocalDate.now());
                    setHora(LocalTime.now());
                    String dataFormatadaIncendio = getData().format(formatoDia);
                    String horaFormatadaIncendio = getHora().format(formatoHora);

                    System.out.println("Data do relatório: " + dataFormatadaIncendio);
                    System.out.println("Hora do relatório: " + horaFormatadaIncendio);
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 3:
                    System.out.println("==================================================================================");
                    System.out.println("Risco de Deslizamento: Chuvas intensas aumentaram o risco de deslizamentos nas áreas próximas. ");
                    System.out.println("Se você estiver em zona de morro ou encosta, considere evacuar preventivamente.");

                    //PROCESSO DE FORMATAÇÃO DA DATA
                    //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
                    //depois basta printar esse objeto

                    //PROCESSO DE FORMATAÇÃO DA HORA
                    //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
                    //depois basta printar esse objeto

                    setData(LocalDate.now());
                    setHora(LocalTime.now());
                    String dataFormatadaDeslizamento = getData().format(formatoDia);
                    String horaFormatadaDeslizamento = getHora().format(formatoHora);

                    System.out.println("Data do relatório: " + dataFormatadaDeslizamento);
                    System.out.println("Hora do relatório: " + horaFormatadaDeslizamento);
                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 4:
                    System.out.println("==================================================================================");
                    System.out.println("Tremor Registrado: Um leve terremoto foi sentido nas proximidades.");
                    System.out.println("Ainda que sem danos estruturais reportados, verifique rachaduras em paredes e evite elevadores.");

                    //PROCESSO DE FORMATAÇÃO DA DATA
                    //Instancia um objeto String que vai armazenar o valor da Data (adquirido pelo getData) já formatado
                    //depois basta printar esse objeto

                    //PROCESSO DE FORMATAÇÃO DA HORA
                    //Instancia um objeto String que vai armazenar o valor da hora (adquirido pelo getHora) já formatado
                    //depois basta printar esse objeto

                    setData(LocalDate.now());
                    setHora(LocalTime.now());
                    String dataFormatadaTerremoto = getData().format(formatoDia);
                    String horaFormatadaTerremoto = getHora().format(formatoHora);

                    System.out.println("Data do relatório: " + dataFormatadaTerremoto);
                    System.out.println("Hora do relatório: " + horaFormatadaTerremoto);

                    System.out.println("==================================================================================");
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
            }break;
        }
    }
}