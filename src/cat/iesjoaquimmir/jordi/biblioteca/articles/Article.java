/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.jordi.biblioteca.articles;

/**
 *
 * @author Jordi Lascorz
 */
public abstract class Article implements inArticle {

//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String Titol;
    private String Autor;
    private Categoria categoria;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getTitol() {
        return Titol;
    }
    private void setTitol(String Titol){
        if(Titol == null){
            throw new NullPointerException("El Titol no pot ser null");
        }
        this.Titol = Titol;
    }
    
    public String getAutor() {
        return Autor;
    }
    private void setAutor(String Autor){
        if(Autor == null){
            throw new NullPointerException("El Autor no pot ser null");
        }
        this.Autor = Autor;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    private void setCategoria(Categoria categoria){
        if(categoria == null){
            throw new NullPointerException("La categoria no pot ser null");
        }
        this.categoria = categoria;
    }
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Article(String Titol, String Autor, Categoria categoria){
            this.setTitol(Titol);
            this.setAutor(Autor);
            this.setCategoria(categoria);
        }
    //</editor-fold>
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes Estatics">
    @Override
    public String toString() {
        return String.format("Titol: %s %n"
                + "Autor: %s %n"
                + "Categoria: %s %n", getTitol(), getAutor(), getCategoria().getMissatge()); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>

}
