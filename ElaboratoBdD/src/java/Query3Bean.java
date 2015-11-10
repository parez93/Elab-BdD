/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Query3Bean {
    
    // query elenco stundenti 
    private  String mat;
    private  String cognome;
    private  String nome;
    private  String uniProv; // univerista provenienza
    private  String STP;// stato povenienza

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUniProv() {
        return uniProv;
    }

    public void setUniProv(String uniProv) {
        this.uniProv = uniProv;
    }

    public String getSTP() {
        return STP;
    }

    public void setSTP(String STP) {
        this.STP = STP;
    }

    public Query3Bean() {
        this.mat = null;
        this.cognome =null;
        this.nome = null;
        this.uniProv = null;
        this.STP = null;
    }
    
    
    
}
