

package cat.iesjoaquimmir.jordi.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Article;
import cat.iesjoaquimmir.jordi.biblioteca.articles.Categoria;

public class publicacio extends Article {

//<editor-fold defaultstate="collapsed" desc="Atributs">
    private int Numero_Pagines;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public int getNumero_Pagines() {
        return Numero_Pagines;
    }

    private void setNumero_Pagines(int Numero_Pagines) {
        if(Numero_Pagines <= 0){
            throw new NullPointerException("El numero de pagines no pot ser menor o igual a 0.");
        }
        this.Numero_Pagines = Numero_Pagines;
    }
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public publicacio(String Titol, String Autor, Categoria categoria, int Numero_Pagines) {
        super(Titol, Autor, categoria);
        this.setNumero_Pagines(Numero_Pagines);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes Estatics">
        @Override
    public String toString() {
        return String.format("%n%sNum.Pagines: %d", super.toString(), getNumero_Pagines()); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>
//</editor-fold>
    
    

    
}
