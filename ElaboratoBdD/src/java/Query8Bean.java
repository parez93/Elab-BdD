/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Query8Bean {

    private String oggetto;
    private String dataoram;
    private String nomeS;
    private String cogS;
    private String testom;
    private String tipologia;
    private String idM;
    
    
    
     public String getIdM() {
        return idM;
    }

    public void setIdM(String idM) {
        this.idM = idM;
    }
    
    public void setIdM(int idM) {
        this.idM =""+ idM;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

   

    public Query8Bean() {
        this.oggetto = null;
        this.dataoram = null;
        this.nomeS = null;
        this.cogS = null;
        
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public String getDataoram() {
        return dataoram;
    }

    public void setDataoram(String dataoram) {
        this.dataoram = dataoram;
    }

    public String getNomeS() {
        return nomeS;
    }

    public void setNomeS(String nomeS) {
        this.nomeS = nomeS;
    }

    public String getCogS() {
        return cogS;
    }

    public void setCogS(String cogS) {
        this.cogS = cogS;
    }
    
     public String getTestom() {
        return testom;
    }

    public void setTestom(String testom) {
        this.testom = testom;
    }
    
    
    
    
}
