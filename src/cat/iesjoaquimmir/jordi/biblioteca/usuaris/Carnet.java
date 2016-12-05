

package cat.iesjoaquimmir.jordi.biblioteca.usuaris;

public enum Carnet {
//<editor-fold defaultstate="collapsed" desc="Atributs">

    P("Premium",3,true),
    N("Normal",1,false);

    
    private final String Missatge;
    private final int Valor;
    private final boolean Permis;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    public String getMissatge() {
        return Missatge;
    }
    public int getValor() {
        return Valor;
    }
    public boolean getPermis() {
        return Permis;
    }
    
    Carnet(String Missatge, int Valor, boolean Permis){
        this.Missatge = Missatge;
        this.Valor = Valor;
        this.Permis = Permis;
    }
//</editor-fold>

}
