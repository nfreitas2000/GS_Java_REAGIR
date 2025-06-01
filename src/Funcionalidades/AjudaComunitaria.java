package Funcionalidades;

import java.util.Scanner;

public class AjudaComunitaria {
    private int alimentos;
    private int vestimentas;
    private int primeirosSocorros;
    private int higiene;
    private boolean retirada;

    /***************************************** CONSTRUTORES **************************************/

    public AjudaComunitaria(int alimentos, int vestimentas, int primeirosSocorros, int higiene){
        this.alimentos = alimentos;
        this.vestimentas = vestimentas;
        this.primeirosSocorros = primeirosSocorros;
        this.higiene = higiene;
    }

    public AjudaComunitaria(){}

    /************************************ GETTERS AND SETTERS ***********************************/

    public boolean isRetirada() {
        return retirada;
    }

    public void setRetirada(boolean retirada) {
        this.retirada = retirada;
    }

    public int getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(int alimentos) {
        this.alimentos = alimentos;
    }

    public int getVestimentas() {
        return vestimentas;
    }

    public void setVestimentas(int vestimentas) {
        this.vestimentas = vestimentas;
    }

    public int getPrimeirosSocorros() {
        return primeirosSocorros;
    }

    public void setPrimeirosSocorros(int primeirosSocorros) {
        this.primeirosSocorros = primeirosSocorros;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    /***************************************** MÉTODOS ******************************************/

    public void ajudaComunitaria(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==================================================================================");
            System.out.println("Seja bem-vindo(a) a central de ajuda comunitária!");
            System.out.println("Aqui, pessoas que usam o aplicativo podem ajudar umas as outras com doações.");
            System.out.println("O que você deseja fazer:");
            System.out.println("0 - Sair");
            System.out.println("1 - Visualizar armazém ");
            System.out.println("2 - Retirar itens");
            System.out.println("3 - Realizar doação");

            System.out.print("Digite: ");
            int escolha = Integer.parseInt(sc.nextLine());

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    visualizarArmazem();
                    System.out.print("Pressione uma tecla para continuar . . .");
                    sc.nextLine();
                    continue;
                case 2:
                    setRetirada(true);
                    calcularItens(retirada);
                    continue;
                case 3:
                    setRetirada(false);
                    calcularItens(retirada);
                    continue;
                default:
                    System.out.println("Escolha inválida. Tente novamente");
                    continue;
            }break;
        }
    }

    public void visualizarArmazem(){
        System.out.println("==================================================================================");
        System.out.println("Existem essa quantia de itens no nosso armazém:");
        System.out.println("1 - Alimentos - " + getAlimentos());
        System.out.println("2 - Vestimentas - " + getVestimentas());
        System.out.println("3 - Primeiros socorros - " + getPrimeirosSocorros());
        System.out.println("4 - Higiene - " + getHigiene());
        System.out.println("----------------------------------------------------------------------------------");
    }

    public void calcularItens(boolean retirada){
        Scanner sc = new Scanner(System.in);

        while (true) {
            visualizarArmazem();
            if (retirada) {

                System.out.println("0 - Sair");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.print("Digite o item que você deseja retirar: ");
                int item = Integer.parseInt(sc.nextLine());

                if (item == 0) {
                    break;
                } else if (item >= 5) {
                    System.out.println("==================================================================================");
                    System.out.println("Item não encontrado no armazém. Tente novamente.");
                    continue;
                }
                System.out.print("Digite a quantidade que vai ser retirada: ");

                int qnt = Integer.parseInt(sc.nextLine());

                switch (item) {
                    case 1:
                        if (qnt > getAlimentos() || qnt < 0) {
                            System.out.println("==================================================================================");
                            System.out.println("Não foi possivel retirar. Quantidade superior a presente no armazém ou negativa.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        } else {
                            setAlimentos(getAlimentos() - qnt);
                            System.out.println("==================================================================================");
                            System.out.println("Item retirado com sucesso! Faça bom proveito.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        }
                        continue;
                    case 2:
                        if (qnt > getVestimentas() || qnt < 0) {
                            System.out.println("==================================================================================");
                            System.out.println("Não foi possivel retirar. Quantidade superior a presente no armazém ou negativa.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        } else {
                            setVestimentas(getVestimentas() - qnt);
                            System.out.println("==================================================================================");
                            System.out.println("Item retirado com sucesso! Faça bom proveito.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        }
                        continue;
                    case 3:
                        if (qnt > getPrimeirosSocorros() || qnt < 0) {
                            System.out.println("==================================================================================");
                            System.out.println("Não foi possivel retirar. Quantidade superior a presente no armazém ou negativa.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        } else {
                            setPrimeirosSocorros(getPrimeirosSocorros() - qnt);
                            System.out.println("==================================================================================");
                            System.out.println("Item retirado com sucesso! Faça bom proveito.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        }
                        continue;
                    case 4:
                        if (qnt > getHigiene() || qnt < 0) {
                            System.out.println("==================================================================================");
                            System.out.println("Não foi possivel retirar. Quantidade superior a presente no armazém ou negativa.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                            continue;
                        } else {
                            setHigiene(getHigiene() - qnt);
                            System.out.println("==================================================================================");
                            System.out.println("Item retirado com sucesso! Faça bom proveito.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                            continue;
                        }
                }
            } else {
                System.out.println("0 - Sair");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.print("Digite o item que você deseja adicionar: ");
                int item = Integer.parseInt(sc.nextLine());

                if (item == 0) {
                    break;
                } else if (item >= 5) {
                    System.out.println("==================================================================================");
                    System.out.println("Item não encontrado no armazém. Tente novamente.");
                    continue;
                }
                System.out.print("Digite a quantidade que vai ser adicionada: ");

                int qnt = Integer.parseInt(sc.nextLine());

                switch (item) {
                    case 1:
                        if (qnt > 1000 || qnt < 0) {
                            System.out.println("==================================================================================");
                            System.out.println("Não foi possivel adicionar. A quantidade excede o limite do armazém ou é negativa.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        } else {
                            setAlimentos(getAlimentos() + qnt);
                            System.out.println("==================================================================================");
                            System.out.println("Item adicionado com sucesso! Muito obrigado pela sua ajuda a comunidade.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        }
                        continue;
                    case 2:
                        if (qnt > 1000 || qnt < 0) {
                            System.out.println("==================================================================================");
                            System.out.println("Não foi possivel adicionar. A quantidade excede o limite do armazém ou é negativa..");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        } else {
                            setVestimentas(getVestimentas() + qnt);
                            System.out.println("==================================================================================");
                            System.out.println("Item adicionado com sucesso! Muito obrigado pela sua ajuda a comunidade.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        }
                        continue;
                    case 3:
                        if (qnt > 1000 || qnt < 0) {
                            System.out.println("==================================================================================");
                            System.out.println("Não foi possivel adicionar. A quantidade excede o limite do armazém ou é negativa.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        } else {
                            setPrimeirosSocorros(getPrimeirosSocorros() + qnt);
                            System.out.println("==================================================================================");
                            System.out.println("Item adicionado com sucesso! Muito obrigado pela sua ajuda a comunidade.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                        }
                        continue;
                    case 4:
                        if (qnt > 1000 || qnt < 0) {
                            System.out.println("==================================================================================");
                            System.out.println("Não foi possivel adicionar. A quantidade excede o limite do armazém ou é negativa..");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                            continue;
                        } else {
                            setHigiene(getHigiene() + qnt);
                            System.out.println("==================================================================================");
                            System.out.println("Item adicionado com sucesso! Muito obrigado pela sua ajuda a comunidade.");
                            System.out.println("==================================================================================");
                            System.out.print("Pressione uma tecla para continuar . . .");
                            sc.nextLine();
                            continue;
                        }
                }
            }
            break;
        }
    }
}
