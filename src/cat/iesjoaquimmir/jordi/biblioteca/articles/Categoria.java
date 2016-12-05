

package cat.iesjoaquimmir.jordi.biblioteca.articles;

public enum Categoria {
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
         
    //</editor-fold>
//</editor-fold>
    INFANTIL("INFANTIL",false),
    JUVENIL("JUVENIL",false),
    ADULT("ADULT",true);
    
    private final String Missatge;
    private final boolean comp;
    
    public String getMissatge(){
        return Missatge;
    }

    public boolean getComp() {
        return comp;
    }
      
    Categoria(String Missatge, boolean comp){
        this.Missatge = Missatge;
        this.comp = comp;
    }

    
}
