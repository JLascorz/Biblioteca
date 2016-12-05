

package cat.iesjoaquimmir.jordi.biblioteca.usuaris;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Article;
import java.util.ArrayList;

public class UsuariMenorEdat extends Usuari{
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private UsuariAdult tutor;
    private Boolean permis;
    private Boolean prem;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public UsuariAdult getTutor() {
        return tutor;
    }

    private void setTutor(UsuariAdult tutor) {
        if(tutor == null){
            throw new NullPointerException("El Tutor no pot ser null");
        }
        this.tutor = tutor;
    }

    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
     public UsuariMenorEdat(String nom, String primer_cognom, String segon_cognom, UsuariAdult tutor) {
        super(nom, primer_cognom, segon_cognom);
        this.setTutor(tutor);
    }
    //</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="Metodes d'Objectes">
     
     @Override
      public boolean isAdult(){
          return false;
      }

    @Override
    public String toString() {
        return String.format("%s %n", super.toString()); //To change body of generated methods, choose Tools | Templates.
    }
    //</editor-fold>     
//</editor-fold>

    @Override
    public int isPremium() {
        return this.getTutor().getCarnet().getValor(); //To change body of generated methods, choose Tools | Templates.
    }
}