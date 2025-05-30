package Individuo;

public class ContatoPessoal {
    private String email;
    private String ddi;
    private String ddd;
    private String numCelular;

    /*************************************** CONSTRUTORES ***************************************/

    ContatoPessoal(){}

    public ContatoPessoal(String email, String ddi, String ddd, String numCelular) {
        this.email = email;
        this.ddi = ddi;
        this.ddd = ddd;
        this.numCelular = numCelular;
    }

    /************************************ GETTERS AND SETTERS ***********************************/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    /***************************************** MÉTODOS ******************************************/

    public String getDadosContato(){
        return "Email: " + getEmail() + "\n" +
                "Número do celular: " + "(" + getDdi() + ")" + " +" + getDdd() + " " + getNumCelular().substring(0,5) + "-" + getNumCelular().substring(5);
    }
}
