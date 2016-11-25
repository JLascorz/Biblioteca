

package cat.iesjoaquimmir.jordi.biblioteca.articles.multimedia;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Categoria;

public class discCompacte extends multimedia{
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String ismn;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getIsmn() {
        return ismn;
    }

    private void setIsmn(String ismn) {
        if(ismn == null){
            throw new NullPointerException("El Ismn no pot ser null");
        }
        this.ismn = ismn;
    }
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public discCompacte(String Titol, String Autor, Categoria categoria, int Durada, String ismn) {
        super(Titol, Autor, categoria, Durada);
        this.setIsmn(ismn);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes Estatics">
        @Override
            public String toString() {
                return String.format("CD: %n"
                        + "---------------"
                        + "%s%nISMN: %s %n", super.toString(), getIsmn()); //To change body of generated methods, choose Tools | Templates.
            }
    //</editor-fold>
//</editor-fold>
}
