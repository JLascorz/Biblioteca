/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.jordi.biblioteca.usuaris;

import cat.iesjoaquimmir.jordi.biblioteca.articles.Article;
import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public interface inUsuari {
      String getNom();
      String getPrimer_Cognom();
      String getSegon_Cognom();
      
    @Override
        public String toString();
    
}
