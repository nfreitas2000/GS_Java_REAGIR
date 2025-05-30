package Individuo;

public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String complemento;


    /***************************************** CONSTRUTORES **************************************/

    Endereco(){}

    public Endereco(String rua, String numero, String cep, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
    }

    /***************************************** GETTERS AND SETTERS *******************************/

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /***************************************** MÉTODOS *******************************************/

    public String getDadosEndereco(){
        return "Rua: " + getRua() + "\n" +
                "Número: " + getNumero() + "\n" +
                "CEP: " + getCep().substring(0, 5) + "-" + getCep().substring(5) + "\n" +
                "Complemento: " + getComplemento();
    }
}

