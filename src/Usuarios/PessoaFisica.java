package Usuarios;

import Individuo.ContatoPessoal;
import Individuo.ContatoEmergencia;
import Individuo.Endereco;
import Individuo.Pessoa;

import java.util.Scanner;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;
    private String sexo;
    private int idade;

    /*************************************** CONSTRUTORES ***************************************/

    public PessoaFisica(String nome, ContatoEmergencia contatoEmergencia, ContatoPessoal contato, Endereco endereco, String cpf, String rg, String sexo, int idade) {
        super(nome, contatoEmergencia, contato, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.idade = idade;
    }

    public PessoaFisica(){}

    public PessoaFisica(Endereco endereco, ContatoPessoal contato, ContatoEmergencia contatoEmergencia){
        this.endereco = endereco;
        this.contato = contato;
        this.contatoEmergencia = contatoEmergencia;
    }

    /************************************ GETTERS AND SETTERS ***********************************/

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /***************************************** MÉTODOS ******************************************/
    @Override
    public void getDadosPessoa() {
        System.out.println("Dados Pessoais -------------------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + getCpf().substring(0, 3) + "." + getCpf().substring(3, 6) + "." + getCpf().substring(6, 9) + "-" + getCpf().substring(9) );
        System.out.println("RG: " + getRg().substring(0,2) + "." + getRg().substring(2,5) + "." + getRg().substring(5,8) + "-" + getRg().substring(8));
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade: " + getIdade() + " anos" + "\n");
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
        System.out.println("1 - Dados Pessoais");
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
                    System.out.println("1 - Nome");
                    System.out.println("2 - CPF");
                    System.out.println("3 - RG");
                    System.out.println("4 - Sexo");
                    System.out.println("5 - Idade");

                    System.out.print("Digite: ");
                    int alterar_pessoal = Integer.parseInt(sc.nextLine());

                    switch (alterar_pessoal) {
                        case 0:
                            break;
                        case 1:
                            System.out.print("Digite o seu nome: ");
                            setNome(sc.nextLine());
                            System.out.println("===========================================================================");
                            System.out.println("Nome atualizado!");
                            break;
                        case 2:
                            System.out.print("Digite seu CPF (apenas números): ");
                            String cpfDigitado = sc.nextLine();
                            System.out.println("===========================================================================");
                            if (cpfDigitado.length() == 11) {
                                setCpf(cpfDigitado);
                                System.out.println("CPF atualizado!");
                            } else {
                                System.out.println("CPF inválido. Tente novamente.");
                                continue;
                            }
                            break;
                        case 3:
                            System.out.print("Digite o número do seu RG (Ex. 999999999): ");
                            String rgDigitado = sc.nextLine();

                            if (rgDigitado.length() != 9) {
                                System.out.println("RG digitado inválido. Tente novamente.");
                                continue;
                            } else {
                                setRg(rgDigitado);
                                System.out.println("RG atualizado!");
                                break;
                            }
                        case 4:
                            System.out.print("Digite seu sexo (Masculino ou feminino): ");
                            String sexoDigitado = sc.nextLine();

                            sexoDigitado = sexoDigitado.toUpperCase();

                            if (sexoDigitado.equals("MASCULINO")) {
                                setSexo("Masculino");
                                System.out.println("Sexo atualizado!");
                                break;
                            } else if (sexoDigitado.equals("FEMININO")) {
                                setSexo("Feminino");
                                System.out.println("Sexo atualizado!");
                                break;
                            } else {
                                System.out.println("Sexo digitado inválido. Certifique-se de que escreveu 'Masculino' ou 'Feminino'");
                                continue;
                            }
                        case 5:
                            System.out.print("Digite quantos anos você tem: ");
                            int idadeDigitada = Integer.parseInt(sc.nextLine());
                            System.out.println("===========================================================================");
                            if (idadeDigitada > 120 || idadeDigitada < 0) {
                                System.out.println("Idade inválida. Tente novamente.");
                                continue;
                            } else {
                                setIdade(idadeDigitada);
                            }
                            break;
                        default:
                            System.out.println("Valor digitado inválido. Tente novamente.");
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
                            System.out.println("Qual o país de origem do número?");
                            System.out.println("1 - Brasil (+55)");
                            System.out.println("2 - Portugal (+351)");

                            System.out.print("Digite: ");
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
                        System.out.print("Digite o nome completo do contato de emergência: ");
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
                            System.out.print("Digite o número de telefone do contato de emergencia: ");
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

    public void criarPessoaFisica(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Para começarmos, vamos identificar quem é você!");
        System.out.println("Preencha o seguinte cadastro:");

        System.out.print("Nome: ");
        setNome(sc.nextLine());
        while (true) {
            System.out.print("Digite seu CPF (apenas números): ");
            String cpfDigitado = sc.nextLine();
            if (cpfDigitado.length() == 11) {
                setCpf(cpfDigitado);
            } else {
                System.out.println("CPF inválido. Tente novamente.");
                continue;
            }
            break;
        }
        while (true) {
            System.out.print("RG (Ex. 999999999): ");
            String rgDigitado = sc.nextLine();

            if (rgDigitado.length() == 9) {
                System.out.println("RG digitado inválido. Tente novamente.");
                continue;
            } else {
                setRg(rgDigitado);
                System.out.println("RG atualizado!");
            }
            break;
        }
        while (true) {
            System.out.print("Digite seu sexo (Masculino ou feminino): ");
            String sexoDigitado = sc.nextLine();

            sexoDigitado = sexoDigitado.toUpperCase();

            if (sexoDigitado.equals("MASCULINO")) {
                setSexo("Masculino");
                System.out.println("Sexo atualizado!");
            } else if (sexoDigitado.equals("FEMININO")) {
                setSexo("Feminino");
                System.out.println("Sexo atualizado!");
            } else {
                System.out.println("Sexo digitado inválido. Certifique-se de que escreveu 'Masculino' ou 'Feminino'");
                continue;
            }
            break;
        }
        while (true) {
            System.out.print("Digite quantos anos você tem: ");
            int idadeDigitada = Integer.parseInt(sc.nextLine());
            if (idadeDigitada > 120 || idadeDigitada < 0) {
                System.out.println("Idade inválida. Tente novamente.");
                continue;
            } else {
                setIdade(idadeDigitada);
            }
            break;
        }
        System.out.println("Ótimo! Agora preencha as informações do seu endereço:");
        System.out.print("Digite a sua rua: ");
        String ruaDigitada = sc.nextLine();
        endereco.setRua(ruaDigitada);
        System.out.print("Digite o número da sua moradia: ");
        endereco.setNumero(sc.nextLine());
        while (true) {
            System.out.print("Digite o seu CEP (apenas números [Ex. XXXXXXXX]): ");
            String cepDigitado = sc.nextLine();

            if (cepDigitado.length() == 8) {
                endereco.setCep(cepDigitado);
            } else {
                System.out.println("CEP inválido. Tente novamente");
                continue;
            }
        break;
        }
        System.out.print("Digite o complemento: ");
        endereco.setComplemento(sc.nextLine());
        System.out.println("Agora vamos preencher alguns dados de contato seus:");
        while (true) {
            System.out.println("Qual o país de origem do número?");
            System.out.println("1 - Brasil (+55)");
            System.out.println("2 - Portugal (+351)");

            System.out.print("Digite: ");
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
        while (true) {
            System.out.print("Digite seu email: ");
            String emailDigitado = sc.nextLine();
            System.out.println("===========================================================================");
            if (emailDigitado.contains("@")) {
                contato.setEmail(emailDigitado);
                break;
            } else {
                System.out.println("E-mail inválido. Tenha certeza que contém '@'.");
            }
        }
        System.out.println("Agora vamos preencher alguns dados de contato para uma emergência:");
        System.out.print("Digite o nome completo do contato de emergência: ");
        String nomeDigitado = sc.nextLine();

        contatoEmergencia.setNomeEmergencia(nomeDigitado);
        System.out.print("Digite o relacionamento da pessoa (Ex. Mãe, Pai, Irmão): ");
        contatoEmergencia.setRelacionamento(sc.nextLine());
        while (true) {
            System.out.println("Qual o país de origem do número do contato de emergência?");
            System.out.println("1 - Brasil (+55)");
            System.out.println("2 - Portugal (+351)");

            System.out.print("Digite: ");
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
            System.out.print("Digite o DDD do telefone de emergência: ");
            String dddDigitado = sc.nextLine();

            if (dddDigitado.length() > 3) {
                System.out.println("DDD digitado inválido! Tente novamente");
            } else {
                contatoEmergencia.setDddEmergencia(dddDigitado);
                break;
            }
        }
        while (true) {
            System.out.print("Digite o número de telefone do contato de emergência: ");
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
        System.out.print("Digite o email do contato de emergência: ");
        String emailDigitado = sc.nextLine();
        System.out.println("===========================================================================");
        if (emailDigitado.contains("@")) {
            contatoEmergencia.setEmailEmergencia(emailDigitado);
        } else {
            System.out.println("E-mail inválido. Tenha certeza que contém '@'.");
        }
    }
}
