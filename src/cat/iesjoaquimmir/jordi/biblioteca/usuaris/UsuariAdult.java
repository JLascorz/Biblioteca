

package cat.iesjoaquimmir.jordi.biblioteca.usuaris;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Article;
import java.util.ArrayList;

public class UsuariAdult extends Usuari{
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private Carnet carnet;
    private String DNI;
    private Boolean prem;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getDNI() {
        return DNI;
    }

    private void setDNI(String DNI) {
        if(DNI == null){
            throw new NullPointerException("El DNI no pot ser null");
        }
        this.DNI = DNI;
    }
    
    public Carnet getCarnet() {
        return carnet;
    }
    
    public void setCarnet(Carnet carnet) {
        if(carnet == null){
            throw new NullPointerException("El carnet no pot ser null");
        }
        this.carnet = carnet;
    }
    
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
     public UsuariAdult(String nom, String primer_cognom, String segon_cognom, String DNI, Carnet carnet) {
        super(nom, primer_cognom, segon_cognom);
        this.setDNI(DNI);
        this.setCarnet(carnet);
    }
     
    //</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="Metodes d'Objectes">
     
      @Override
      public boolean isAdult(){
          return true;
      }
     
    @Override
    public String toString() {
        return String.format("%s"
                + "DNI: %s %n"
                + "Carnet: %s %n", super.toString(), getDNI(), getCarnet().getMissatge()); //To change body of generated methods, choose Tools | Templates.
    }
    //</editor-fold>
//</editor-fold>

    @Override
    public int isPremium() {
       return this.getCarnet().getValor();
    }

}
