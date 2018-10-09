/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Article;
import model.ConnexionBDD;

/**
 *
 * @author 1795891
 */
public class RequeteSolde {
    
    public static ArrayList getSoldList(String genre,String nom_vet){
        ArrayList listImages= new ArrayList();
        Connection con=ConnexionBDD.getConnection();
        if(con!=null){
        ResultSet rs=null;
        Statement statement=null;
        try{
            PreparedStatement sql1;
            sql1=con.prepareStatement("SELECT id_vetement,nom_vetement,prix,image,genre,description\n" +
                                        "FROM vetements \n" +
                                        "Where genre=? and nom_vetement=?");
            sql1.setString(1, genre);
            sql1.setString(2, nom_vet);
            //statement=con.createStatement();
            rs=sql1.executeQuery();
        
            Article ar;
            while(rs.next()){
            ar=new Article();
            ar.setId(rs.getString("id_vetement"));
            ar.setNomArticle(rs.getString("nom_vetement"));
            ar.setPrix(Double.parseDouble(rs.getString("prix")));
            ar.setImage(rs.getString("image"));
            ar.setGenre(rs.getString("genre"));
            ar.setDescription(rs.getString("description"));
            listImages.add(ar);
        }
        
        }
        catch(SQLException e){
            System.out.println("erreur dans la requete ");
            e.printStackTrace();
        }finally{
            try{
        rs.close();
       // statement.close();
            }catch(SQLException e){
                System.out.println("pas de fermeture de result set et/ou statement");
                e.printStackTrace();
            }
            ConnexionBDD.closeConnection(con);
        }
        
                
    }
      return listImages; 
    }
    
}
