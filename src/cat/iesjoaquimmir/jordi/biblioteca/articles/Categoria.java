

package cat.iesjoaquimmir.jordi.biblioteca.articles;

public enum Categoria {
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
         
    //</editor-fold>
//</editor-fold>
    INFANTIL("INFANTIL"),
    JUVENIL("JUVENIL"),
    ADULT("ADULT");
    
    private final String Missatge;
    
    Categoria(String Missatge){
        this.Missatge = Missatge;
    }
    
    public String getMissatge(){
        return Missatge;
    }
    
}
