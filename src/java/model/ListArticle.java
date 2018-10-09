/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 1795891
 */
public class ListArticle extends ArrayList<Article>{
    ListArticle list;
    
    
    public ListArticle getListArticle(){
        this.add(new Article ("ar1","accesoire",1,30));
        this.add(new Article ("ar2","chassure",1,52));
        this.add(new Article ("ar5","robe",1,12));
        
        return this;
    }
    public  void ajouterArticle(Article a){
      
        this.add(a);
     
    }
    
   
    
    public void afficherArticle(){
        for(Article ar:this){
            System.out.println(" id  "+ar.getId()+ " Nom "+ar.getNomArticle()+"  quantite  "+ar.getQuantite()+"  prix "+ar.getPrix());
        }
    }
}
