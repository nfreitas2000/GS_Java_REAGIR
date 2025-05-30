package Usuarios;

import java.util.Scanner;

public class Conta {
    private PessoaJuridica pj;
    private PessoaFisica pf;
    private String usuario;
    private String senha;


    /*************************************** CONSTRUTORES ***************************************/

    Conta(String usuario, String senha, PessoaJuridica pj){
        this.usuario = usuario;
        this.senha = senha;
        this.pj = pj;
    }

    public Conta(String usuario, String senha, PessoaFisica pf){
        this.usuario = usuario;
        this.senha = senha;
        this.pf = pf;
    }

    Conta(){}

    /************************************ GETTERS AND SETTERS ***********************************/

    public PessoaJuridica getPj() {
        return pj;
    }

    public void setPj(PessoaJuridica pj) {
        this.pj = pj;
    }

    public PessoaFisica getPf() {
        return pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /***************************************** MÉTODOS ******************************************/

    public void criarLogin(){
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================================================");
        System.out.print("Primeiro de tudo, digite qual será seu novo usuário: ");
        setUsuario(sc.nextLine());
        System.out.print("Muito bem! Agora digite sua senha: ");
        setSenha(sc.nextLine());
        System.out.println("Muito bom! Sua conta foi criada, agora basta entrar no nosso sistema!");
        System.out.println("===========================================================================");
    }

    public boolean realizarLogin(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o usuário: ");
            String usuarioDigitado = sc.nextLine();
            System.out.print("Digite a senha: ");
            String senhaDigitada = sc.nextLine();

            if (verificadorLogin(usuarioDigitado, senhaDigitada)) {
                System.out.println("===========================================================================");
                System.out.println("Acesso liberado!");
                System.out.println("===========================================================================");
                return true;
            } else if ((!verificadorLogin(usuarioDigitado, senhaDigitada))){
                System.out.println("===========================================================================");
                System.out.println("Acesso negado!");
                System.out.println("===========================================================================");
                return false;

            }
        }
    }
    public boolean verificadorLogin(String user, String senha){
        if (user.equals(getUsuario()) && (senha.equals(getSenha())))
            return true;
        else {
            return false;
        }
    }
}
