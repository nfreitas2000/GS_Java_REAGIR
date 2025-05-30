package Individuo;

public class ContatoEmergencia{
    private String nomeEmergencia;
    private String relacionamento;
    private String emailEmergencia;
    private String ddiEmergencia;
    private String dddEmergencia;
    private String numCelularEmergencia;

    /*************************************** CONSTRUTORES ***************************************/

    public ContatoEmergencia(){}

    public ContatoEmergencia(String nomeEmergencia, String relacionamento, String emailEmergencia, String ddiEmergencia, String dddEmergencia, String numCelularEmergencia) {
        this.nomeEmergencia = nomeEmergencia;
        this.relacionamento = relacionamento;
        this.emailEmergencia = emailEmergencia;
        this.ddiEmergencia = ddiEmergencia;
        this.dddEmergencia = dddEmergencia;
        this.numCelularEmergencia = numCelularEmergencia;
    }

    /************************************ GETTERS AND SETTERS ***********************************/

    public String getNomeEmergencia() {
        return nomeEmergencia;
    }

    public void setNomeEmergencia(String nomeEmergencia) {
        this.nomeEmergencia = nomeEmergencia;
    }

    public String getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    public String getEmailEmergencia() {
        return emailEmergencia;
    }

    public void setEmailEmergencia(String emailEmergencia) {
        this.emailEmergencia = emailEmergencia;
    }

    public String getDdiEmergencia() {
        return ddiEmergencia;
    }

    public void setDdiEmergencia(String ddiEmergencia) {
        this.ddiEmergencia = ddiEmergencia;
    }

    public String getDddEmergencia() {
        return dddEmergencia;
    }

    public void setDddEmergencia(String dddEmergencia) {
        this.dddEmergencia = dddEmergencia;
    }

    public String getNumCelularEmergencia() {
        return numCelularEmergencia;
    }

    public void setNumCelularEmergencia(String numCelularEmergencia) {
        this.numCelularEmergencia = numCelularEmergencia;
    }

    /***************************************** MÉTODOS ******************************************/

    public String getDadosContatoEmergencia(){
        return "Nome: " + getNomeEmergencia() + "\n" +
                "Relacionamento: " + getRelacionamento() + "\n" +
                "Email: " + getEmailEmergencia() + "\n" +
                "Número do celular: " + "(" + getDdiEmergencia() + ")" + " +" + getDddEmergencia() + " " + getNumCelularEmergencia().substring(0,5) + "-" + getNumCelularEmergencia().substring(5);
    }
}
