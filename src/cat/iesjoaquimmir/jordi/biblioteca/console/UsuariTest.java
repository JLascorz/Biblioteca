

package cat.iesjoaquimmir.jordi.biblioteca.console;
import cat.iesjoaquimmir.jordi.biblioteca.articles.Article;
import cat.iesjoaquimmir.jordi.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.jordi.biblioteca.articles.multimedia.discCompacte;
import cat.iesjoaquimmir.jordi.biblioteca.articles.multimedia.discVersatilDigital;
import cat.iesjoaquimmir.jordi.biblioteca.articles.publicacio.llibre;
import cat.iesjoaquimmir.jordi.biblioteca.articles.publicacio.revista;
import cat.iesjoaquimmir.jordi.biblioteca.usuaris.Carnet;
import cat.iesjoaquimmir.jordi.biblioteca.usuaris.Usuari;
import cat.iesjoaquimmir.jordi.biblioteca.usuaris.UsuariAdult;
import cat.iesjoaquimmir.jordi.biblioteca.usuaris.UsuariMenorEdat;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariTest {
    public static ArrayList<Usuari> usuaris = new ArrayList<>();
    
    public static void main(String[] args) {
       String cat;
        int numMenu = 0;
        int numSubMenu = 0;
        int continuar = 0;
        int contSubMenu = 0;
        //Usuari
        String nom;
        String primerCognom;
        String segonCognom;
        ArrayList<Article> articles = new ArrayList<>();
        
        //Tutor
        String nomTutor;
        String pcTutor;
        String scTutor;
        String permis;
        Carnet carnet;
        String dni;
        
        int numUsu = 0;
        
        
        
        //ARTICLES
        llibre lib = new llibre("Ulises", "James Joyce", Categoria.ADULT, 456, "940943322");
        articles.add(lib);
        revista rev = new revista("Patufet", "Ed. Infantil", Categoria.INFANTIL, 87, "80002122");
        articles.add(rev);
        discCompacte cd = new discCompacte("Mis grandes éxitos", "Luis Miguel", Categoria.INFANTIL, 65, "04900009");
        articles.add(cd);
        discVersatilDigital dvd = new discVersatilDigital("Bamby", "Walt Disney", Categoria.JUVENIL, 89, "90843089");
        articles.add(dvd);
        
        Scanner input = new Scanner(System.in);
        do{
            do{        
                System.out.printf("%nQue vols fer: %n"
                        + "[1] Crear nou Usuari [Menor Edat]. %n"
                        + "[2] Crear nou Usuari [Mayor Edat]. %n"
                        + "Escogeix: ");
                numMenu = input.nextInt();
           }while(numMenu < 1 || numMenu > 2);
            switch (numMenu) {
                //<editor-fold defaultstate="collapsed" desc="MENOR DE EDAT">
                case 1:
                    //<editor-fold defaultstate="collapsed" desc="Menor">
                    //Nom
                    System.out.printf("%nNom: ");
                    nom = input.next();
                    //PrimerCognom
                    System.out.printf("%nPrimer Cognom: ");
                    primerCognom = input.next();
                    //SegonCognom
                    System.out.printf("%nSegon Cognom: ");
                    segonCognom = input.next();
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc="Tutor">
                    //Nom
                    System.out.printf("%nNom Tutor: ");
                    nomTutor = input.next();
                    //PrimerCognom
                    System.out.printf("%nPrimer Cognom Tutor: ");
                    pcTutor = input.next();
                    //SegonCognom
                    System.out.printf("%nSegon Cognom Tutor: ");
                    scTutor = input.next();
                    //DNI
                    System.out.printf("%nDNI Tutor: ");
                    dni = input.next();
                    //Carnet
                    System.out.printf("%nCarnet [P/N]: ");
                    permis = input.next();
                    
                    if(permis.equals("P")){
                    UsuariAdult tutor = new UsuariAdult(nomTutor, pcTutor, scTutor, dni, Carnet.P);
                    //usuaris.add(tutor);
                    UsuariMenorEdat usuME = new UsuariMenorEdat(nom, primerCognom, segonCognom, tutor);
                    //hashCode(usuME);
                    usuaris.add(usuME);
                    }else if(permis.equals("N")){
                    UsuariAdult tutor = new UsuariAdult(nomTutor, pcTutor, scTutor, dni, Carnet.N);
                    //usuaris.add(tutor);
                    UsuariMenorEdat usuME = new UsuariMenorEdat(nom, primerCognom, segonCognom, tutor);
                    //hashCode(usuME);
                    usuaris.add(usuME);
                    }
                    
                    numUsu = usuaris.size() -1 ;
                    System.out.println(numUsu);
                do{
                    do{        
                        System.out.printf("%nQue vols agafar: %n"
                                + "[1] Llibre (ADULT). %n"
                                + "[2] Revista (INFANTIL). %n"
                                + "[3] CD (INFANTIL).  %n"
                                + "[4] DVD (JUVENIL).  %n"
                                + "--------BORRAR-------- %n"
                                + "[5] Llibre (ADULT). %n"
                                + "[6] Revista (INFANTIL). %n"
                                + "[7] CD (ADULT).  %n"
                                + "[8] DVD (JUVENIL).  %n"
                                + "Escogeix: ");
                        numSubMenu = input.nextInt();
                    }while(numSubMenu < 1 || numSubMenu > 8);
                    switch(numSubMenu){
                        //<editor-fold defaultstate="collapsed" desc="Llibre">
                        case 1:
                           usuaris.get(numUsu).agafaArticle(articles.get(0));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="Revista">
                        case 2:
                            usuaris.get(numUsu).agafaArticle(articles.get(1));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="CD">
                        case 3:
                            usuaris.get(numUsu).agafaArticle(articles.get(2));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="DVD">
                        case 4:
                            usuaris.get(numUsu).agafaArticle(articles.get(3));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="BorrarLlibre">
                        case 5:
                           usuaris.get(numUsu).retornaArticle(articles.get(0));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="BorrarRevista">
                        case 6:
                            usuaris.get(numUsu).retornaArticle(articles.get(1));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="BorrarCD">
                        case 7:
                            usuaris.get(numUsu).retornaArticle(articles.get(2));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="BorrarDVD">
                        case 8:
                            usuaris.get(numUsu).retornaArticle(articles.get(3));
                        break;
                        //</editor-fold>
                        
                    }
                    System.out.printf("Añadir mas articulos? (SI -> 1 | NO -> 0)");
                    contSubMenu = input.nextInt();
                }while(contSubMenu != 0);
                    //</editor-fold>
                break;
                //</editor-fold>
                //<editor-fold defaultstate="collapsed" desc="MAYOR DE EDAT">
                case 2:
                    //Nom
                    System.out.printf("%nNom: ");
                    nom = input.next();
                    //PrimerCognom
                    System.out.printf("%nPrimer Cognom: ");
                    primerCognom = input.next();
                    //SegonCognom
                    System.out.printf("%nSegon Cognom: ");
                    segonCognom = input.next();
                    //DNI
                    System.out.printf("%nDNI: ");
                    dni = input.next();
                    //Carnet
                    System.out.printf("%nCarnet [P/N]: ");
                    permis = input.next();
                    if(permis.equals("P")){
                    UsuariAdult adult = new UsuariAdult(nom, primerCognom, segonCognom, dni, Carnet.P);
                    hashEqual(adult);
                    //usuaris.add(adult);
                    }else if(permis.equals("N")){
                    UsuariAdult adult = new UsuariAdult(nom, primerCognom, segonCognom, dni, Carnet.N);
                    hashEqual(adult);
                    //usuaris.add(adult);
                    }
                    
                    numUsu = usuaris.size() -1 ;
                    
                do{
                    do{        
                        System.out.printf("%nQue vols agafar: %n"
                                + "[1] Llibre (ADULT). %n"
                                + "[2] Revista (INFANTIL). %n"
                                + "[3] CD (INFANTIL).  %n"
                                + "[4] DVD (JUVENIL).  %n"
                                + "--------BORRAR-------- %n"
                                + "[5] Llibre (ADULT). %n"
                                + "[6] Revista (INFANTIL). %n"
                                + "[7] CD (ADULT).  %n"
                                + "[8] DVD (JUVENIL).  %n"
                                + "Escogeix: ");
                        numSubMenu = input.nextInt();
                    }while(numSubMenu < 1 || numSubMenu > 8);
                    switch(numSubMenu){
                        //<editor-fold defaultstate="collapsed" desc="Llibre">
                        case 1:
                           usuaris.get(0).agafaArticle(articles.get(0));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="Revista">
                        case 2:
                            usuaris.get(numUsu).agafaArticle(articles.get(1));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="CD">
                        case 3:
                            usuaris.get(numUsu).agafaArticle(articles.get(2));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="DVD">
                        case 4:
                            usuaris.get(numUsu).agafaArticle(articles.get(3));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="BorrarLlibre">
                        case 5:
                           usuaris.get(numUsu).retornaArticle(articles.get(0));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="BorrarRevista">
                        case 6:
                            usuaris.get(numUsu).retornaArticle(articles.get(1));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="BorrarCD">
                        case 7:
                            usuaris.get(numUsu).retornaArticle(articles.get(2));
                        break;
                        //</editor-fold>
                        //<editor-fold defaultstate="collapsed" desc="BorrarDVD">
                        case 8:
                            usuaris.get(numUsu).retornaArticle(articles.get(3));
                        break;
                        //</editor-fold>
                        
                    }
                    System.out.printf("Añadir mas articulos? (SI -> 1 | NO -> 0)");
                    contSubMenu = input.nextInt();
                }while(contSubMenu != 0);
                    
                break;
                //</editor-fold>
            }
    System.out.printf("Crear otro usuario? (SI -> 1 | NO -> 0)");
    continuar = input.nextInt();
    }while(continuar != 0); 
        for (Usuari u : usuaris) System.out.println(u);
        //for (Article a : articles) System.out.println(a);
    }   
    
    public static void hashEqual(Usuari usu){
        
        for (int i = 0; i < usuaris.size(); i++) {
            
            if( usuaris.get(i).equals(usu) == true && usuaris.get(i).hashCode() == usu.hashCode()){
                System.out.println("Hola");
                usuaris.add(usu);
            }
        }
        
    }
    
    
}

