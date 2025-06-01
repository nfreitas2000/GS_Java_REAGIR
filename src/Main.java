import Funcionalidades.*;
import Individuo.ContatoEmergencia;
import Individuo.ContatoPessoal;
import Individuo.Endereco;
import Usuarios.Conta;
import Usuarios.PessoaFisica;
import Usuarios.PessoaJuridica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //===========================================================================================================

        //INSTÂNCIA DAS CLASSES DE FUNCIONALIDADES

        ApoioPsicologico apoioPsicologico = new ApoioPsicologico();
        CompartilharLocalizacao compartilharLocalizacao = new CompartilharLocalizacao();
        MapearRotas mapearRotas = new MapearRotas();
        GerarRelatorio gerarRelatorio = new GerarRelatorio();

        ConteudosEducativos c1 = new ConteudosEducativos("Como agir durante um alagamento", "Alagamentos", "Evite áreas alagadas, desligue a energia elétrica e procure abrigo em locais elevados. Mantenha documentos e objetos importantes em sacos plásticos.");
        ConteudosEducativos c2 = new ConteudosEducativos("Prevenção contra incêndios residenciais", "Incêndios", "Não sobrecarregue tomadas, mantenha velas longe de objetos inflamáveis e tenha um extintor de incêndio por perto. Em caso de fumaça, mantenha-se próximo ao chão.");
        ConteudosEducativos c3 = new ConteudosEducativos("O que fazer após um terremoto", "Terremotos", "Após o tremor, verifique danos estruturais. Evite elevadores, desligue o gás e saia para um local aberto. Sintonize rádios locais para atualizações.");
        ConteudosEducativos c4 = new ConteudosEducativos();

        RelatarDesastre relatarDesastre = new RelatarDesastre();
        AjudaComunitaria ajudaComunitaria = new AjudaComunitaria(1,2,3,2);

        //===========================================================================================================

        // CRIAÇÃO DE PESSOA FÍSICA GENÉRICA

        Endereco enderecoPessoaFisica = new Endereco("Almeida", "43", "00000001", "Casa");
        ContatoPessoal contatoPessoalPessoaFisica = new ContatoPessoal("pessoaFisica@gmail.com", "+55", "11", "999999999");
        ContatoEmergencia contatoEmergenciaPessoaFisica = new ContatoEmergencia("Katarina", "Mãe", "katarina@gmail.com", "+55", "11", "888888888");


        PessoaFisica pessoaFisica = new PessoaFisica("Eduardo", contatoEmergenciaPessoaFisica, contatoPessoalPessoaFisica, enderecoPessoaFisica, "12345678901", "1231231231", "Masculino",27);


        //===========================================================================================================

        // CRIAÇÃO DE PESSOA JURÍDICA GENÉRICA

        Endereco enderecoPessoaJurica = new Endereco("Av. Paulista", "615", "00000002", "Prédio Comercial");
        ContatoPessoal contatoPessoalPessoaJuridica = new ContatoPessoal("pessoaJuridica@gmail.com", "+55", "11", "111111111");
        ContatoEmergencia contatoEmergenciaPessoaJuridica = new ContatoEmergencia("Leonardo", "Diretor da Empresa", "leonardo@gmail.com", "+55", "11", "222222222");


        PessoaJuridica pessoaJuridica = new PessoaJuridica("FIAP", contatoEmergenciaPessoaJuridica, contatoPessoalPessoaJuridica, enderecoPessoaJurica, "28252381000115", "VSTP Educação S.A", "Educação");

        //===========================================================================================================

        // CRIAÇÃO DE PESSOA NOVA

        Endereco enderecoNovo = new Endereco();
        ContatoPessoal contatoNovo = new ContatoPessoal();
        ContatoEmergencia contatoEmergenciaNovo = new ContatoEmergencia();

        PessoaFisica pessoaNovo = new PessoaFisica(enderecoNovo, contatoNovo, contatoEmergenciaNovo);
        Conta contaNova = new Conta("", "", pessoaNovo);

        //===========================================================================================================


        // IMPLEMENTAÇÕES

        while (true) {

            System.out.println("========================================================");
            System.out.println("Seja bem-vindo ao simulador REAGIR!");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Simular pessoa física");
            System.out.println("2 - Simular pessoa jurídica");
            System.out.println("3 - Simular criação de conta própria");

            System.out.print("Digite: ");
            int escolha = Integer.parseInt(sc.nextLine());

            switch (escolha) {
                case 0:
                    System.out.println("Encerrando o programa . . .");
                    break;
                case 1:
                    while (true) {
                        System.out.println("==================================================================================");
                        System.out.println("Seja bem-vindo(a), " + pessoaFisica.getNome() + "!");
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
                        System.out.println("9 - Relatar desastre extremo");


                        System.out.print("Digite: ");
                        int escolha_pessoaF = Integer.parseInt(sc.nextLine());

                        switch (escolha_pessoaF) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("==================================================================================");
                                compartilharLocalizacao.compartilharLocalizacao(pessoaFisica);
                                continue;
                            case 2:
                                System.out.println("==================================================================================");
                                mapearRotas.mapearRotas(pessoaFisica);
                                continue;
                            case 3:
                                System.out.println("==================================================================================");
                                apoioPsicologico.realizarApoioPsicologicoComeco();
                                continue;
                            case 4:
                                System.out.println("==================================================================================");
                                gerarRelatorio.gerarRelatorio(pessoaFisica);
                                continue;
                            case 5:
                                while (true) {
                                    System.out.println("Seja bem-vindo(a) a aba de conteúdos educativos! Selecione o que você deseja fazer:");
                                    System.out.println("0 - Sair");
                                    System.out.println("1 - Verificar conteúdos");
                                    System.out.println("2 - Escrever um conteúdo");

                                    System.out.print("Digite: ");
                                    int escolha_conteudo = Integer.parseInt(sc.nextLine());

                                    switch (escolha_conteudo) {
                                        case 0:
                                            break;
                                        case 1:
                                            while (true) {
                                                if (c4.getTitulo().equals("")) {
                                                    System.out.println("Escolha qual conteúdo você deseja visualizar:");
                                                    System.out.println("0 - Sair");
                                                    System.out.println("1 - " + c1.getTitulo());
                                                    System.out.println("2 - " + c2.getTitulo());
                                                    System.out.println("3 - " + c3.getTitulo());
                                                } else {
                                                    System.out.println("Escolha qual conteúdo você deseja visualizar:");
                                                    System.out.println("0 - Sair");
                                                    System.out.println("1 - " + c1.getTitulo());
                                                    System.out.println("2 - " + c2.getTitulo());
                                                    System.out.println("3 - " + c3.getTitulo());
                                                    System.out.println("4 - " + c4.getTitulo());
                                                }

                                                System.out.print("Digite: ");
                                                int escolha_visualizar = Integer.parseInt(sc.nextLine());
                                                switch (escolha_visualizar){
                                                    case 0:
                                                        break;
                                                    case 1:
                                                        c1.exibirArtigo();
                                                        continue;
                                                    case 2:
                                                        c2.exibirArtigo();
                                                        continue;
                                                    case 3:
                                                        c3.exibirArtigo();
                                                        continue;
                                                    case 4:
                                                        c4.exibirArtigo();
                                                        continue;
                                                    default:
                                                        System.out.println("Artigo inexistente. Tente novamente.");
                                                }break;
                                            }continue;
                                        case 2:
                                            c4.criarArtigo();
                                            continue;
                                    }break;
                                }continue;
                            case 6:
                                ajudaComunitaria.ajudaComunitaria();
                                continue;
                            case 7:
                                System.out.println("==================================================================================");
                                pessoaFisica.getDadosPessoa();
                                System.out.print("Pressione uma tecla para continuar . . .");
                                sc.nextLine();
                                continue;
                            case 8:
                                System.out.println("==================================================================================");
                                pessoaFisica.alterarDadosPessoa();
                                System.out.print("Pressione uma tecla para continuar . . .");
                                sc.nextLine();
                                continue;
                            case 9:
                                relatarDesastre.criarRelatorio(pessoaFisica);
                                continue;
                            default:
                                System.out.println("==================================================================================");
                                System.out.println("Item selecionado inválido. Tente novamente.");
                                continue;
                        }break;
                    }continue;
                case 2:
                    while (true) {
                        System.out.println("==================================================================================");
                        System.out.println("Seja bem-vindo(a), " + pessoaJuridica.getNome() + "!");
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
                        System.out.println("9 - Relatar desastre extremo");


                        System.out.print("Digite: ");
                        int escolha_pessoaJ = Integer.parseInt(sc.nextLine());

                        switch (escolha_pessoaJ) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("==================================================================================");
                                compartilharLocalizacao.compartilharLocalizacao(pessoaJuridica);
                                continue;
                            case 2:
                                System.out.println("==================================================================================");
                                mapearRotas.mapearRotas(pessoaJuridica);
                                continue;
                            case 3:
                                System.out.println("==================================================================================");
                                apoioPsicologico.realizarApoioPsicologicoComeco();
                                continue;
                            case 4:
                                System.out.println("==================================================================================");
                                gerarRelatorio.gerarRelatorio(pessoaJuridica);
                                continue;
                            case 5:
                                while (true) {
                                    System.out.println("Seja bem-vindo(a) a aba de conteúdos educativos! Selecione o que você deseja fazer:");
                                    System.out.println("0 - Sair");
                                    System.out.println("1 - Verificar conteúdos");
                                    System.out.println("2 - Escrever um conteúdo");

                                    System.out.print("Digite: ");
                                    int escolha_conteudo = Integer.parseInt(sc.nextLine());

                                    switch (escolha_conteudo) {
                                        case 0:
                                            break;
                                        case 1:
                                            while (true) {
                                                if (c4.getTitulo().equals("")) {
                                                    System.out.println("Escolha qual conteúdo você deseja visualizar:");
                                                    System.out.println("0 - Sair");
                                                    System.out.println("1 - " + c1.getTitulo());
                                                    System.out.println("2 - " + c2.getTitulo());
                                                    System.out.println("3 - " + c3.getTitulo());
                                                } else {
                                                    System.out.println("Escolha qual conteúdo você deseja visualizar:");
                                                    System.out.println("0 - Sair");
                                                    System.out.println("1 - " + c1.getTitulo());
                                                    System.out.println("2 - " + c2.getTitulo());
                                                    System.out.println("3 - " + c3.getTitulo());
                                                    System.out.println("4 - " + c4.getTitulo());
                                                }

                                                System.out.print("Digite: ");
                                                int escolha_visualizar = Integer.parseInt(sc.nextLine());
                                                switch (escolha_visualizar){
                                                    case 0:
                                                        break;
                                                    case 1:
                                                        c1.exibirArtigo();
                                                        continue;
                                                    case 2:
                                                        c2.exibirArtigo();
                                                        continue;
                                                    case 3:
                                                        c3.exibirArtigo();
                                                        continue;
                                                    case 4:
                                                        c4.exibirArtigo();
                                                        continue;
                                                    default:
                                                        System.out.println("Artigo inexistente. Tente novamente.");
                                                }break;
                                            }continue;
                                        case 2:
                                            c4.criarArtigo();
                                            continue;
                                    }break;
                                }continue;
                            case 6:
                                ajudaComunitaria.ajudaComunitaria();
                                continue;
                            case 7:
                                System.out.println("==================================================================================");
                                pessoaJuridica.getDadosPessoa();
                                System.out.print("Pressione uma tecla para continuar . . .");
                                sc.nextLine();
                                continue;
                            case 8:
                                System.out.println("==================================================================================");
                                pessoaJuridica.alterarDadosPessoa();
                                System.out.print("Pressione uma tecla para continuar . . .");
                                sc.nextLine();
                                continue;
                            case 9:
                                relatarDesastre.criarRelatorio(pessoaJuridica);
                                continue;
                            default:
                                System.out.println("==================================================================================");
                                System.out.println("Item selecionado inválido. Tente novamente.");
                                continue;
                        }break;
                    }continue;
                case 3:
                    while (true) {
                        System.out.println("Deseja realizar:");
                        System.out.println("1 - Login [Realizar apenas se tiver cadastro]");
                        System.out.println("2 - Cadastro");

                        System.out.print("Digite: ");
                        int escolha_entrada = Integer.parseInt(sc.nextLine());

                        if (escolha_entrada == 1) {
                            if (contaNova.realizarLogin()) {
                                break;
                            }
                        } else if (escolha_entrada == 2) {

                            pessoaNovo.criarPessoaFisica();
                            System.out.println("Muito bem! Agora vamos criar a sua conta");
                            contaNova.criarLogin();

                        } else {
                            System.out.println("Escolha inválida. Tente novamente.");
                        }
                    }
                    while (true) {
                        System.out.println("==================================================================================");
                        System.out.println("Seja bem-vindo(a), " + contaNova.getPf().getNome() + "!");
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
                        System.out.println("9 - Relatar desastre extremo");


                        System.out.print("Digite: ");
                        int escolha_pessoaC = Integer.parseInt(sc.nextLine());

                        switch (escolha_pessoaC) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("==================================================================================");
                                compartilharLocalizacao.compartilharLocalizacao(pessoaNovo);
                                continue;
                            case 2:
                                System.out.println("==================================================================================");
                                mapearRotas.mapearRotas(pessoaNovo);
                                continue;
                            case 3:
                                System.out.println("==================================================================================");
                                apoioPsicologico.realizarApoioPsicologicoComeco();
                                continue;
                            case 4:
                                System.out.println("==================================================================================");
                                gerarRelatorio.gerarRelatorio(pessoaNovo);
                                continue;
                            case 5:
                                while (true) {
                                    System.out.println("Seja bem-vindo(a) a aba de conteúdos educativos! Selecione o que você deseja fazer:");
                                    System.out.println("0 - Sair");
                                    System.out.println("1 - Verificar conteúdos");
                                    System.out.println("2 - Escrever um conteúdo");

                                    System.out.print("Digite: ");
                                    int escolha_conteudo = Integer.parseInt(sc.nextLine());

                                    switch (escolha_conteudo) {
                                        case 0:
                                            break;
                                        case 1:
                                            while (true) {
                                                if (c4.getTitulo().equals("")) {
                                                    System.out.println("Escolha qual conteúdo você deseja visualizar:");
                                                    System.out.println("0 - Sair");
                                                    System.out.println("1 - " + c1.getTitulo());
                                                    System.out.println("2 - " + c2.getTitulo());
                                                    System.out.println("3 - " + c3.getTitulo());
                                                } else {
                                                    System.out.println("Escolha qual conteúdo você deseja visualizar:");
                                                    System.out.println("0 - Sair");
                                                    System.out.println("1 - " + c1.getTitulo());
                                                    System.out.println("2 - " + c2.getTitulo());
                                                    System.out.println("3 - " + c3.getTitulo());
                                                    System.out.println("4 - " + c4.getTitulo());
                                                }

                                                System.out.print("Digite: ");
                                                int escolha_visualizar = Integer.parseInt(sc.nextLine());
                                                switch (escolha_visualizar){
                                                    case 0:
                                                        break;
                                                    case 1:
                                                        c1.exibirArtigo();
                                                        continue;
                                                    case 2:
                                                        c2.exibirArtigo();
                                                        continue;
                                                    case 3:
                                                        c3.exibirArtigo();
                                                        continue;
                                                    case 4:
                                                        c4.exibirArtigo();
                                                        continue;
                                                    default:
                                                        System.out.println("Artigo inexistente. Tente novamente.");
                                                }break;
                                            }continue;
                                        case 2:
                                            c4.criarArtigo();
                                            continue;
                                    }break;
                                }continue;
                            case 6:
                                ajudaComunitaria.ajudaComunitaria();
                                continue;
                            case 7:
                                System.out.println("==================================================================================");
                                contaNova.getPf().getDadosPessoa();
                                System.out.print("Pressione uma tecla para continuar . . .");
                                sc.nextLine();
                                continue;
                            case 8:
                                System.out.println("==================================================================================");
                                contaNova.getPf().alterarDadosPessoa();
                                System.out.print("Pressione uma tecla para continuar . . .");
                                sc.nextLine();
                                continue;
                            case 9:
                                relatarDesastre.criarRelatorio(pessoaJuridica);
                                continue;
                            default:
                                System.out.println("==================================================================================");
                                System.out.println("Item selecionado inválido. Tente novamente.");
                                continue;
                        }break;
                    }continue;
                default:
                    System.out.println("==================================================================================");
                    System.out.println("Item digitado inválido. Tente novamente.");
                    continue;
            } break;
        }
    }
}