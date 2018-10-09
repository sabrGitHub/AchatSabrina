/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import model.Article;
import model.ListArticle;

/**
 *
 * @author 1795891
 */
public class VerificationDoublon {
 public static ListArticle  verifierDoublon(ListArticle list,Article ar){
     ListArticle monPanier=new ListArticle();
     boolean trouver=false;

           if(list==null){
               list=new ListArticle();
                 list.ajouterArticle(ar);
                 monPanier=list;  
             }else{
                 for(int i=0;i<list.size();i++){
                     //on recupere les données 
                     Article article=(Article)list.get(i);
                     if(article.getNomArticle().equals(ar.getNomArticle())){
                         article.setQuantite(article.getQuantite()+ar.getQuantite());
                         list.set(i, article);
                         trouver=true;
                         monPanier=list;
                     }
                 }
                 if(!trouver){
                     list.ajouterArticle(ar);
                 }
             }
    
    return monPanier;
    }
}
