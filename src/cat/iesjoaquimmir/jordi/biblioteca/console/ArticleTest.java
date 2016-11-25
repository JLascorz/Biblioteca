

package cat.iesjoaquimmir.jordi.biblioteca.console;
import cat.iesjoaquimmir.jordi.biblioteca.articles.Article;
import cat.iesjoaquimmir.jordi.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.jordi.biblioteca.articles.multimedia.multimedia;
import cat.iesjoaquimmir.jordi.biblioteca.articles.multimedia.discCompacte;
import cat.iesjoaquimmir.jordi.biblioteca.articles.multimedia.discVersatilDigital;
import cat.iesjoaquimmir.jordi.biblioteca.articles.publicacio.publicacio;
import cat.iesjoaquimmir.jordi.biblioteca.articles.publicacio.llibre;
import cat.iesjoaquimmir.jordi.biblioteca.articles.publicacio.revista;
import java.util.ArrayList;
import java.util.Scanner;

public class ArticleTest {
//<editor-fold defaultstate="collapsed" desc="Menu">
    public static void main(String[] args) {
        String cat;
        int numMenu = 0;
        String titol;
        String autor;
        Categoria categoria;
        int durada;
        int num_paginas;
        int continuar = 0;
        
        Scanner input = new Scanner(System.in);
        ArrayList<Article> articles = new ArrayList<>();
        do{
            do{        
                System.out.printf("%nQue vols agafar: %n"
                        + "[1] Llibre %n"
                        + "[2] Revista %n"
                        + "[3] Disc Compacte / CD %n"
                        + "[4] Disc Versatil Digital / DVD %n"
                        + "Escogeix: ");
                numMenu = input.nextInt();
           }while(numMenu < 1 || numMenu > 4);
            switch (numMenu) {
                case 1:
                    //LLIBRE
                    String isbn;
                    //Titol
                    System.out.printf("%nTitol del llibre: ");
                    titol = input.next();
                    //Autor
                    System.out.printf("%nAutor del llibre: ");
                    autor = input.next();
                    //Numero de Pagines
                    System.out.printf("%nNumero de pagines del llibre: ");
                    num_paginas = input.nextInt();
                    //isbn
                    System.out.printf("ISBN del llibre: ");
                    isbn = input.next();
                    //Categoria
                    System.out.printf("%nCategoria del llibre[INTANTIL / JUVENIL / ADULT]: ");
                    cat = input.next();
                    if(cat.equals("INFANTIL")){
                        llibre artLib = new llibre(titol, autor, Categoria.INFANTIL, num_paginas, isbn);
                        articles.add(artLib);
                    }else if(cat.equals("JUVENIL")){
                        llibre artLib = new llibre(titol, autor, Categoria.JUVENIL, num_paginas, isbn);
                        articles.add(artLib);
                    }else if(cat.equals("ADULT")){
                        llibre artLib = new llibre(titol, autor, Categoria.ADULT, num_paginas, isbn);
                        articles.add(artLib);
                    }
                    //System.out.printf("%n %s %n", articles.get(0).toString());
                    break;
                case 2:
                    //REVISTA
                    String issn;
                    //Titol
                    System.out.printf("%nTitol de la Revista: ");
                    titol = input.next();
                    //Autor
                    System.out.printf("%nAutor de la Revista: ");
                    autor = input.next();
                    //Numero de Pagines
                    System.out.printf("%nNumero de pagines de la Revista: ");
                    num_paginas = input.nextInt();
                    //issn
                    System.out.printf("ISSN de la Revista: ");
                    issn = input.next();
                    //Categoria
                    System.out.printf("%nCategoria de la Revista[INTANTIL / JUVENIL / ADULT]: ");
                    cat = input.next();
                    if(cat.equals("INFANTIL")){
                        revista artRev = new revista(titol, autor, Categoria.INFANTIL, num_paginas, issn);
                        articles.add(artRev);
                    }else if(cat.equals("JUVENIL")){
                        revista artRev = new revista(titol, autor, Categoria.JUVENIL, num_paginas, issn);
                        articles.add(artRev);
                    }else if(cat.equals("ADULT")){
                        revista artRev = new revista(titol, autor, Categoria.ADULT, num_paginas, issn);
                        articles.add(artRev);
                    }
                    //System.out.printf("%n %s %n", articles.get(1).toString());
                    break;
                case 3:
                    //DISC COMPACTE
                    String ismn;
                    //Titol
                    System.out.printf("%nTitol del CD: ");
                    titol = input.next();
                    //Autor
                    System.out.printf("%nAutor del CD: ");
                    autor = input.next();
                    //Numero de Pagines
                    System.out.printf("%nDurada del CD: ");
                    durada = input.nextInt();
                    //ismn
                    System.out.printf("ISMN del CD: ");
                    ismn = input.next();
                    //Categoria
                    System.out.printf("%nCategoria del CD[INTANTIL / JUVENIL / ADULT]: ");
                    cat = input.next();
                    if(cat.equals("INFANTIL")){
                        discCompacte artCD = new discCompacte(titol, autor, Categoria.INFANTIL, durada, ismn);
                        articles.add(artCD);
                    }else if(cat.equals("JUVENIL")){
                        discCompacte artCD = new discCompacte(titol, autor, Categoria.JUVENIL, durada, ismn);
                        articles.add(artCD);
                    }else if(cat.equals("ADULT")){
                        discCompacte artCD = new discCompacte(titol, autor, Categoria.ADULT, durada, ismn);
                        articles.add(artCD);
                    }   
                    //System.out.printf("%n %s %n", articles.get(2).toString());
                    break;
                case 4:
                    //DISC VERSATIL DIGITAL
                    String isan;
                    //Titol
                    System.out.printf("%nTitol del DVD: ");
                    titol = input.next();
                    //Autor
                    System.out.printf("%nAutor del DVD: ");
                    autor = input.next();
                    //Numero de Pagines
                    System.out.printf("%nDurada del DVD: ");
                    durada = input.nextInt();
                    //isan
                    System.out.printf("ISAN del DVD: ");
                    isan = input.next();
                    //Categoria
                    System.out.printf("%nCategoria del DVD[INTANTIL / JUVENIL / ADULT]: ");
                    cat = input.next();
                    if(cat.equals("INFANTIL")){
                        discVersatilDigital artDVD = new discVersatilDigital(titol, autor, Categoria.INFANTIL, durada, isan);
                        articles.add(artDVD);
                    }else if(cat.equals("JUVENIL")){
                        discVersatilDigital artDVD = new discVersatilDigital(titol, autor, Categoria.JUVENIL, durada, isan);
                        articles.add(artDVD);
                    }else if(cat.equals("ADULT")){
                        discVersatilDigital artDVD = new discVersatilDigital(titol, autor, Categoria.ADULT, durada, isan);
                        articles.add(artDVD);
                    }   
                    //System.out.printf("%n %s %n", articles.get(3).toString());
                    break;
            }
       System.out.printf("Quieres seguir? (SI -> 1 | NO -> 0)");
       continuar = input.nextInt();
       }while(continuar != 0);
//       for(int i=0;i<articles.size();++i){
//           System.out.printf("\n%s " , articles.get(i));
//       }
       for (Article a : articles) System.out.println(a);
       
       System.out.printf("");
        
 /*       
        
        
        

        do{        
        System.out.printf("Que vols agafar: %n"
                + "[1] Llibre %n"
                + "[2] Revista %n"
                + "[3] Disc Compacte / CD %n"
                + "[4] Disc Versatil Digital / DVD %n"
                + "Escogeix: ");
        numMenu = input.nextInt();
        }while(numMenu < 1 || numMenu > 4);
        switch(numMenu){
            case 1:
               Llibre();
               main(args);
           break;

           case 2:
               Revista();
               main(args);
           break;

           case 3:      
               DiscCompacte();
               main(args);
           break;

           case 4:
               DiscVersatilDigital();
               main(args);
           break;
        }
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Funcions">
    public static void Llibre(){
        Scanner input = new Scanner(System.in);
        String titol;
        System.out.printf("%nDigam una mida del costat: ");
            //titol = input.nextDouble();
        
    }
    public static void Revista(){
        
    }
    public static void DiscCompacte(){
        
    }
    public static void DiscVersatilDigital(){
        
    }
//</editor-fold>
*/
}

        
   private static void showList(ArrayList<Article> articles){
       for(int i=0;i<articles.size();++i){
           System.out.printf("\nElement %d: %s " , i+1, articles.get(i));
       }
       System.out.printf("\n--------------\n");
       System.out.printf("");
   }
}