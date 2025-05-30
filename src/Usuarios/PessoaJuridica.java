package Usuarios;

import Individuo.ContatoEmergencia;
import Individuo.ContatoPessoal;
import Individuo.Endereco;
import Individuo.Pessoa;

import java.util.Scanner;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;
    private String atividade;

    /*************************************** CONSTRUTORES ***************************************/

    public PessoaJuridica(String nome, ContatoEmergencia contatoEmergencia, ContatoPessoal contato, Endereco endereco, String cnpj, String razaoSocial, String atividade) {
        super(nome, contatoEmergencia, contato, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.atividade = atividade;
    }

    /************************************ GETTERS AND SETTERS ***********************************/

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    /***************************************** MÉTODOS ******************************************/
    @Override
    public void getDadosPessoa() {
        System.out.println("========================================================");
        System.out.println("Dados Pessoais -------------------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("CNPJ: " + getCnpj().substring(0,2) + "." + getCnpj().substring(2,5) + "." + getCnpj().substring(5,8) + "/" + getCnpj().substring(8,12) + "-" + getCnpj().substring(12));
        System.out.println("Razão Social: " + getRazaoSocial());
        System.out.println("Atividade: " + getAtividade() + "\n");
        System.out.println("Dados de Endereço -------------------");
        System.out.println(endereco.getDadosEndereco() + "\n");
        System.out.println("Dados de Contato Pessoal -------------------");
        System.out.println(contato.getDadosContato() + "\n");
        System.out.println("Dados de Contato de Emergência -------------------");
        System.out.println(contatoEmergencia.getDadosContatoEmergencia() + "\n") ;
        System.out.println("========================================================");

    }

    @Override
    public void alterarDadosPessoa() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tipo de dado você alterar?");
        System.out.println("0 - Voltar");
        System.out.println("1 - Dados Empresariais");
        System.out.println("2 - Dados de Endereço ");
        System.out.println("3 - Contato Pessoal");
        System.out.println("4 - Contato de Emergência");

        System.out.print("Digite: ");

        int troca = Integer.parseInt(sc.nextLine());

        switch (troca) {
            case 0:
                break;
            case 1:
                while (true) {
                    System.out.println("Qual dos itens você deseja alterar?");
                    System.out.println("0 - Voltar");
                    System.out.println("1 - Nome Fantasia");
                    System.out.println("2 - CNPJ");
                    System.out.println("3 - Razão Social");
                    System.out.println("4 - Atividade realizada pela empresa");

                    System.out.print("Digite: ");
                    int alterar_pessoal = Integer.parseInt(sc.nextLine());

                    switch (alterar_pessoal) {
                        case 0:
                            break;
                        case 1:
                            System.out.print("Digite o nome fantasia do empresa: ");
                            setNome(sc.nextLine());
                            System.out.println("===========================================================================");
                            System.out.println("Nome fantasia atualizado!");
                            break;
                        case 2:
                            System.out.print("Digite o CNPJ da empresa (Ex. XXYYYZZZNNNNVV): ");
                            String cnpjDigitado = sc.nextLine();
                            System.out.println("===========================================================================");
                            if (cnpjDigitado.length() == 14) {
                                setCnpj(cnpjDigitado);
                                System.out.println("CNPJ atualizado!");
                            } else {
                                System.out.println("CNPJ inválido. Tente novamente.");
                                continue;
                            }
                            break;
                        case 3:
                            System.out.print("Digite a razão social da empresa: ");
                            setRazaoSocial(sc.nextLine());
                            System.out.println("===========================================================================");
                            System.out.println("Razão Social atualizada!");
                            break;
                        case 4:
                            System.out.print("Digite a atividade realizada pela empresa: ");
                            setAtividade(sc.nextLine());
                            System.out.println("===========================================================================");
                            System.out.println("Atividade atualizada!");
                            break;
                    }
                    break;
                }
                break;
            case 2:
                while (true) {
                    System.out.println("Qual dos itens você deseja alterar?");
                    System.out.println("0 - Voltar");
                    System.out.println("1 - Rua");
                    System.out.println("2 - Número");
                    System.out.println("3 - CEP");
                    System.out.println("4 - Complemento");

                    System.out.print("Digite: ");
                    int alterar_endereco = Integer.parseInt(sc.nextLine());

                    switch (alterar_endereco) {
                        case 0:
                            break;
                        case 1:
                            System.out.print("Digite o nome da sua rua: ");
                            String ruaDigitada = sc.nextLine();
                            System.out.println("===========================================================================");
                            endereco.setRua(ruaDigitada);
                            System.out.println("Rua atualizada!");
                            break;
                        case 2:
                            System.out.print("Digite o número da sua moradia: ");
                            String numeroDigitado = sc.nextLine();
                            System.out.println("===========================================================================");
                            endereco.setNumero(numeroDigitado);
                            System.out.println("Número atualizado!");
                            break;
                        case 3:
                            System.out.print("Digite o seu CEP (apenas números [Ex. XXXXXXXX]): ");
                            String cepDigitado = sc.nextLine();
                            System.out.println("===========================================================================");
                            if (cepDigitado.length() == 8) {
                                endereco.setCep(cepDigitado);
                                System.out.println("CEP atualizado!");
                            } else {
                                System.out.println("CEP inválido. Tente novamente");
                                continue;
                            }
                            break;
                        case 4:
                            System.out.print("Digite o complemento: ");
                            String complementoDigita = sc.nextLine();
                            System.out.println("===========================================================================");
                            endereco.setComplemento(complementoDigita);
                            System.out.println("Complemento atualizado!");
                            break;
                        default:
                            System.out.println("===========================================================================");
                            System.out.println("Item não reconhecido. Tente novamente.");
                            break;
                    }
                    break;
                }break;
            case 3:
                System.out.println("Qual dos itens você deseja alterar?");
                System.out.println("0 - Voltar");
                System.out.println("1 - Telefone");
                System.out.println("2 - E-mail");

                System.out.print("Digite: ");
                int alterar_contato = Integer.parseInt(sc.nextLine());

                switch (alterar_contato) {
                    case 0:
                        break;
                    case 1:
                        while (true) {
                            System.out.print("Qual o país de origem do número?");
                            System.out.println("1 - Brasil (+55)");
                            System.out.println("2 - Portugal (+351)");

                            System.out.println("Digite: ");
                            int ddiDigitado = Integer.parseInt(sc.nextLine());

                            if (ddiDigitado == 1) {
                                contato.setDdi("+55");
                                break;
                            } else if (ddiDigitado == 2) {
                                contato.setDdi("+351");
                                break;
                            } else {
                                System.out.println("País inválido! Tente novamente.");
                            }
                        }
                        while (true){
                            System.out.print("Digite o DDD do seu número: ");
                            String dddDigitado = sc.nextLine();

                            if (dddDigitado.length() > 3) {
                                System.out.println("DDD digitado inválido! Tente novamente");
                            } else {
                                contato.setDdd(dddDigitado);
                                break;
                            }
                        }
                        while (true) {
                            System.out.print("Digite o número do seu telefone: ");
                            String telefoneDigitado = sc.nextLine();

                            telefoneDigitado = telefoneDigitado.trim();
                            telefoneDigitado = telefoneDigitado.replace("-", "");

                            if (telefoneDigitado.length() != 9) {
                                System.out.println("Número inválido! Tente novamente");
                            } else {
                                contato.setCelular(telefoneDigitado);
                                break;
                            }
                        }
                        System.out.println("===========================================================================");
                        System.out.println("Telefone atualizado com sucesso!");
                        break;
                    case 2:
                        System.out.print("Digite seu email: ");
                        String emailDigitado = sc.nextLine();
                        System.out.println("===========================================================================");
                        if (emailDigitado.contains("@")) {
                            contato.setEmail(emailDigitado);
                            System.out.println("E-mail atualizado.");
                        } else {
                            System.out.println("E-mail inválido. Tenha certeza que contém '@'.");
                        }
                        break;
                    default:
                        System.out.println("Item não reconhecido. Tente novamente.");
                        break;
                }
                break;
            case 4:
                System.out.println("Qual dos itens você deseja alterar?");
                System.out.println("0 - Voltar");
                System.out.println("1 - Nome do contato de emergência");
                System.out.println("2 - Relacionamento do contato de emergência");
                System.out.println("3 - Telefone do contato de emergência");
                System.out.println("4 - E-mail do contato de emergência");

                System.out.print("Digite: ");
                int alterar_contato_emergencia = Integer.parseInt(sc.nextLine());

                switch (alterar_contato_emergencia) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Digite o seu nome: ");
                        String nomeDigitado = sc.nextLine();

                        contatoEmergencia.setNomeEmergencia(nomeDigitado);
                        System.out.println("===========================================================================");
                        System.out.println("Nome atualizado!");
                        break;
                    case 2:
                        System.out.print("Digite o relacionamento da pessoa (Ex. Mãe, Pai, Irmão): ");
                        contatoEmergencia.setRelacionamento(sc.nextLine());
                        System.out.println("===========================================================================");
                        System.out.println("Relacionamento atualizado!");
                        break;
                    case 3:
                        while (true) {
                            System.out.println("Qual o país de origem do número do contato de emergência?");
                            System.out.println("1 - Brasil (+55)");
                            System.out.println("2 - Portugal (+351)");

                            int ddiDigitado = Integer.parseInt(sc.nextLine());

                            if (ddiDigitado == 1) {
                                contatoEmergencia.setDdiEmergencia("+55");
                                break;
                            } else if (ddiDigitado == 2) {
                                contatoEmergencia.setDdiEmergencia("+351");
                                break;
                            } else {
                                System.out.println("País inválido! Tente novamente.");
                            }
                        }
                        while (true){
                            System.out.print("Digite o DDD do telefone de emergência:");
                            String dddDigitado = sc.nextLine();

                            if (dddDigitado.length() > 3) {
                                System.out.println("DDD digitado inválido! Tente novamente");
                            } else {
                                contatoEmergencia.setDddEmergencia(dddDigitado);
                                break;
                            }
                        }
                        while (true) {
                            System.out.print("Digite o número do seu telefone: ");
                            String telefoneDigitado = sc.nextLine();

                            telefoneDigitado = telefoneDigitado.trim();
                            telefoneDigitado = telefoneDigitado.replace("-", "");

                            if (telefoneDigitado.length() != 9) {
                                System.out.println("Número inválido! Tente novamente");
                            } else {
                                contatoEmergencia.setNumCelularEmergencia(telefoneDigitado);
                                break;
                            }
                        }
                        System.out.println("===========================================================================");
                        System.out.println("Telefone atualizado com sucesso!");
                        break;
                    case 4:
                        System.out.print("Digite o email do contato de emergência: ");
                        String emailDigitado = sc.nextLine();
                        System.out.println("===========================================================================");
                        if (emailDigitado.contains("@")) {
                            contatoEmergencia.setEmailEmergencia(emailDigitado);
                            System.out.println("E-mail atualizado.");
                        } else {
                            System.out.println("E-mail inválido. Tenha certeza que contém '@'.");
                        }
                        break;
                    default:
                        System.out.println("Item não reconhecido. Tente novamente.");
                        break;
                }
                break;
        }

    }
}
