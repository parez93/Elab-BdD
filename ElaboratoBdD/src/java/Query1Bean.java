/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Query1Bean {
    
    
    private String nomeCl;
    private String facolta;
    private String tipoCl;
    private int    nStudenti;

    public Query1Bean() {
        this.nomeCl = null;
        this.facolta = null;
        this.tipoCl = null;
        this.nStudenti =0;
    }

    public String getNomeCl() {
        return nomeCl;
    }

    public void setNomeCl(String nomeCl) {
        this.nomeCl = nomeCl;
    }

    public String getFacolta() {
        return facolta;
    }

    public void setFacolta(String facolta) {
        this.facolta = facolta;
    }

    public String getTipoCl() {
        return tipoCl;
    }

    public void setTipoCl(String tipoCl) {
        this.tipoCl = tipoCl;
    }

    public int getnStudenti() {
        return nStudenti;
    }

    public void setnStudenti(int nStudenti) {
        this.nStudenti = nStudenti;
    }
                  
}
