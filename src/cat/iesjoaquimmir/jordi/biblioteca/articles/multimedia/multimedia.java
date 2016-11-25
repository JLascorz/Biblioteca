

package cat.iesjoaquimmir.jordi.biblioteca.articles.multimedia;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Article;
import cat.iesjoaquimmir.jordi.biblioteca.articles.Categoria;

public class multimedia extends Article {

//<editor-fold defaultstate="collapsed" desc="Atributs">
    private int Durada;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public int getDurada() {
        return Durada;
    }

    private void setDurada(int Durada) {
        if(Durada <= 0){
            throw new NullPointerException("La durada no pot ser menor o igual a 0 minuts.");
        }
        this.Durada = Durada;
    }
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public multimedia(String Titol, String Autor, Categoria categoria, int Durada) {
        super(Titol, Autor, categoria);
        this.setDurada(Durada);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes Estatics">
        @Override
    public String toString() {
        return String.format("%n%sDurada: %d", super.toString(), getDurada()); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>
//</editor-fold>


}