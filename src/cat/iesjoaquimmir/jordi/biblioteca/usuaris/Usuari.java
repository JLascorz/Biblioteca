

package cat.iesjoaquimmir.jordi.biblioteca.usuaris;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Article;
import cat.iesjoaquimmir.jordi.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.jordi.biblioteca.articles.publicacio.llibre;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Usuari {
//<editor-fold defaultstate="collapsed" desc="Atributs">
        private String nom;
        private Carnet carnet;
        private String primer_cognom;
        private String segon_cognom;
        public boolean conte;
        public boolean permis;
        private ArrayList<Article> articles;
        private int i=0;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNom() {
        return nom;
    }
    
    private void setNom(String nom) {
        if(nom == null){
            throw new NullPointerException("El Nom no pot ser null");
        }
        this.nom = nom;
    }
    
    public String getPrimer_cognom() {
        return primer_cognom;
    }

    private void setPrimer_Cognom(String primer_cognom) {
        if(primer_cognom == null){
            throw new NullPointerException("El Primer Cognom no pot ser null");
        }
        this.primer_cognom = primer_cognom;
    }
    
    public String getSegon_cognom() {
        return segon_cognom;
    }

    private void setSegon_Cognom(String segon_cognom) {
        if(segon_cognom == null){
            throw new NullPointerException("El Segon Cognom no pot ser null");
        }
        this.segon_cognom = segon_cognom;
    }
    
    public ArrayList<Article> getArticles() {
        return articles;
    }
    
    public void setArticles(ArrayList<Article> articles) {
        if(articles == null){
            throw new NullPointerException("El Article no pot ser null");
        }
        this.articles = articles;
    }

    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    private Usuari(String nom, String primer_cognom, String segon_cognom, ArrayList<Article> articles) {
        this.setNom(nom);
        this.setPrimer_Cognom(primer_cognom);
        this.setSegon_Cognom(segon_cognom);
        this.setArticles(articles);
    }
    
    public Usuari(String nom, String primer_cognom, String segon_cognom) {
        this(nom, primer_cognom, segon_cognom, new ArrayList<Article>());
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes d'Objectes">
//    public abstract boolean isPremium();
    public abstract boolean isAdult();
    public abstract int isPremium();
    
    public boolean teArticle(Article a){
        
            if(this.getArticles().contains(a)){
                return true;
            }else{
                return false;
            }
       // return conte;
    }
    
    public boolean potAgafarArticle(Article a){
         if(this.getArticles().size()<=isPremium()){
            permis=true;
         }else{
            permis=false;
         }
        return permis;
     }
     
    public void agafaArticle(Article a){
        if(potAgafarArticle(a)==true){
            if(teArticle(a)==false){
                if(isAdult()==true){
                    this.articles.add(a);

                }else if(isAdult()==false){
                    if (a.getCategoria().getComp() == false) {
                        this.articles.add(a);
                    }
                }
            }
        }else{
            throw new NullPointerException("Eh te has pasado de articulos.");
        }
    }
    
    public void retornaArticle(Article a){
        if(articles.contains(a)){
            articles.remove(a);
        }
    }
    
    @Override
    public boolean equals(Object o){

        if(this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        Usuari usu = (Usuari) o;
        if(nom != usu.nom){
            return false;
        }
        if(primer_cognom == null || !primer_cognom.equals(usu.primer_cognom)){
            return false;
        }
        if (segon_cognom != usu.segon_cognom && (segon_cognom == null || !segon_cognom.equals(usu.segon_cognom))){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nom);
        hash = 79 * hash + Objects.hashCode(this.primer_cognom);
        hash = 79 * hash + Objects.hashCode(this.segon_cognom);
        return hash;
    }
     
    @Override
    public String toString() {
        return String.format("%nUSUARI%n"
                + "----------%n"
                + "Nom: %s %n"
                + "PC: %s %n"
                + "SC: %s %n"
                + "Articles: %s %n", getNom(), getPrimer_cognom(), getSegon_cognom(), getArticles().toString()); //To change body of generated methods, choose Tools | Templates.
    }
    //</editor-fold>  
//</editor-fold>

}
