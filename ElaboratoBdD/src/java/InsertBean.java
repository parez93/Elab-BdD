/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gianluca
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class InsertBean {

  private String output;
  private String testo;
  private String oggetto;
  private String tipologia;
  private String matricola;
  private String dataOra;
  private DataSource dataSource;

    public String getDataOra() {
        return dataOra;
    }

    public void setDataOra(String dataOra) {
        this.dataOra = dataOra;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }
  

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

  public void submit() {
    // handle form submission
    output = "You submitted: " + oggetto+ " "+testo +" "+tipologia+"-"+matricola+"-";
  }
  



  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

}