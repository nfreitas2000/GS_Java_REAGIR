package Individuo;

public abstract class Pessoa {
    protected String nome;
    protected ContatoEmergencia contatoEmergencia;
    protected ContatoPessoal contato;
    protected Endereco endereco;

    /*************************************** CONSTRUTORES ***************************************/

    public Pessoa(String nome, ContatoEmergencia contatoEmergencia, ContatoPessoal contato, Endereco endereco) {
        this.nome = nome;
        this.contatoEmergencia = contatoEmergencia;
        this.contato = contato;
        this.endereco = endereco;
    }

    /************************************ GETTERS AND SETTERS ***********************************/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContatoEmergencia getContatoEmergencia() {
        return contatoEmergencia;
    }

    public void setContatoEmergencia(ContatoEmergencia contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }

    public ContatoPessoal getContato() {
        return contato;
    }

    public void setContato(ContatoPessoal contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /***************************************** MÉTODOS ******************************************/

    public abstract void getDadosPessoa();

    public abstract void alterarDadosPessoa();

}
