/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.util.ArrayList;
import model.Article;

/**
 *
 * @author 1795891
 */
public class RechercheParCategorie {
    public static ArrayList chercherImages(String nomArticle){
        ArrayList mesImages=new ArrayList();
        
        
             if(nomArticle.equals("pantalon")){
             for(int i=1;i<25;i++){
                 Article ar=new Article ();
                 ar.setImage("images/img"+i+".jpg");
                 ar.setNomArticle("pantalon"+i);
                 mesImages.add(ar);
             }
         }else
                 if(nomArticle.equals("robe")){
             for(int i=25;i<49;i++){
                 Article ar=new Article ();
                 ar.setImage("images/img"+i+".jpg");
                 ar.setNomArticle("robe"+i);
                 mesImages.add(ar);

             }
         }else
          if(nomArticle.equals("jupe")){
             
             for(int i=49;i<73;i++){
                  Article ar=new Article ();
                ar.setImage("images/img"+i+".jpg");
                ar.setNomArticle("jupe"+i);
                 mesImages.add(ar);

             }
             
       
    }
     return mesImages;
}
}
