

package cat.iesjoaquimmir.jordi.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Categoria;

public class revista extends publicacio {
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String issn;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getIssn() {
        return issn;
    }

    private void setIssn(String issn) {
        if(issn == null){
            throw new NullPointerException("El Issn no pot ser null");
        }
        this.issn = issn;
    }
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public revista(String Titol, String Autor, Categoria categoria, int Numero_Pagines, String issn) {
        super(Titol, Autor, categoria, Numero_Pagines);
        this.setIssn(issn);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes Estatics">
        @Override
            public String toString() {
                return String.format("Revista: %n"
                        + "---------------"
                        + "%s%nISSN: %s %n", super.toString(), getIssn()); //To change body of generated methods, choose Tools | Templates.
            }
    //</editor-fold>
//</editor-fold>
}
