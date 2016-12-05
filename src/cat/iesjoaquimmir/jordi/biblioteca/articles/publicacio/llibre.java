

package cat.iesjoaquimmir.jordi.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Categoria;

public class llibre extends publicacio {
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String isbn;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getIsbn() {
        return isbn;
    }

    private void setIsbn(String isbn) {
        if(isbn == null){
            throw new NullPointerException("El Isbn no pot ser null");
        }
        this.isbn = isbn;
    }
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public llibre(String Titol, String Autor, Categoria categoria, int Numero_Pagines, String isbn) {
        super(Titol, Autor, categoria, Numero_Pagines);
        this.setIsbn(isbn);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes Estatics">
        @Override
            public String toString() {
                return String.format("%nLlibre: %n"
                        + "---------------"
                        + "%s%nISBN: %s %n", super.toString(), getIsbn()); //To change body of generated methods, choose Tools | Templates.
            }
    //</editor-fold>
//</editor-fold>

}
