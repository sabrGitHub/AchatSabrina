/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import model.Article;
import model.ListArticle;

/**
 *
 * @author 1795891
 */
public class CalculAchat {
    
    public static double CalculerTotal(ListArticle list){
        double total=0;
        for(Article ar:list){
        total+=(ar.getPrix()*ar.getQuantite());
        }
        return total;
    }
    
    public static ListArticle recupererPanier(ListArticle list){
        ListArticle monPanier =new ListArticle();
        monPanier=list;
        return monPanier;
    }
    
}
