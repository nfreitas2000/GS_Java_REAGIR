package Funcionalidades;

import java.util.Scanner;

public class ConteudosEducativos {
    private String titulo = "";
    private String assunto = "";
    private String conteudo = "";

    /***************************************** CONSTRUTORES **************************************/

    public ConteudosEducativos(String titulo, String assunto, String conteudo){
        this.titulo = titulo;
        this.assunto = assunto;
        this.conteudo = conteudo;
    }

    public ConteudosEducativos(){}

    /************************************ GETTERS AND SETTERS ***********************************/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /***************************************** MÉTODOS ******************************************/

    public void exibirArtigo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================================================");
        System.out.println("Título: " + getTitulo());
        System.out.println("Assunto: "  + getAssunto());
        System.out.println("Conteúdo -------------------------------------------------------------------------");
        System.out.println(getConteudo());
        System.out.println("==================================================================================");
        System.out.print("Pressione uma tecla para continuar . . .");
        sc.nextLine();
    }

    public void criarArtigo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================================================");
        System.out.println("Vamos criar um artigo!");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Primeiro, crie um título para seu artigo: ");
        setTitulo(sc.nextLine());
        System.out.print("Agora, escreva sobre o que se trata seu artigo: ");
        setAssunto(sc.nextLine());
        System.out.println("Por fim, escreva o conteúdo que será apresentado por ele: ");
        setConteudo(sc.nextLine());
        System.out.println("==================================================================================");
        System.out.println("Artigo criado e publicado! (Olhe a opção 4 de 'Verificar conteúdos')");
        System.out.println("==================================================================================");
        System.out.print("Pressione uma tecla para continuar . . .");
        sc.nextLine();

    }
}