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
import model.Client;
import model.ConnexionBDD;

/**
 *
 * @author 1795891
 */
public class RequeteConnexion {
    
    
     public static void InsertSession(String user,String adresse,String email,String pwd){
        Connection con=ConnexionBDD.getConnection();
        if(con!=null){
        try{
            PreparedStatement sql1;
            sql1=con.prepareStatement("INSERT INTO client_site values(id_con.nextval,?,?,?,?)");
            sql1.setString(1, user);
            sql1.setString(2, adresse);
            sql1.setString(3, email);
            sql1.setString(4, pwd);
            sql1.executeUpdate();
        
        
        }
        catch(SQLException e){
            System.out.println("erreur dans la requete ");
            e.printStackTrace();
        }finally{
            ConnexionBDD.closeConnection(con);
        }
        
                
    }
    }
     //recuper les utilisateur sur la base de donnée
     
         public static Client verifierUser(String user ,String pwd){
        Client client =null;
        Connection con=ConnexionBDD.getConnection();
        if(con!=null){
        ResultSet rs=null;
        try{
             PreparedStatement sql1;
             sql1=con.prepareStatement("SELECT utilisateur FROM client_site where utilisateur=? and motPasse = ? ");
             sql1.setString(1, user);
             sql1.setString(2, pwd);
             
             rs=sql1.executeQuery();
        
            
            while(rs.next()){
            client=new Client();
            client.setUtilisateur(rs.getString("utilisateur"));
        }
          
        
        }
        catch(SQLException e){
            System.out.println("erreur dans la requete ");
            e.printStackTrace();
        }finally{
            try{
        rs.close();
            }catch(SQLException e){
                System.out.println("pas de fermeture de result set et/ou statement");
                e.printStackTrace();
            }
            ConnexionBDD.closeConnection(con);
        }
        
                
    }
      return client ; 
    } 
    }

