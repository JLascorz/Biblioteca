

package cat.iesjoaquimmir.jordi.biblioteca.articles.multimedia;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Categoria;

public class discVersatilDigital extends multimedia {
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String isan;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getIsan() {
        return isan;
    }

    private void setIsan(String isan) {
        if(isan == null){
            throw new NullPointerException("El isan no pot ser null");
        }
        this.isan = isan;
    }
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public discVersatilDigital(String Titol, String Autor, Categoria categoria, int Durada, String isan) {
        super(Titol, Autor, categoria, Durada);
        this.setIsan(isan);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes Estatics">
        @Override
            public String toString() {
                return String.format("%nDVD: %n"
                        + "---------------"
                        + "%s%nISAN: %s %n", super.toString(), getIsan()); //To change body of generated methods, choose Tools | Templates.
            }
    //</editor-fold>
//</editor-fold>
}

