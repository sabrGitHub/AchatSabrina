/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 1795891
 */
public class RequestSQL {
    public static ArrayList getListImages(){
        ArrayList listImages= new ArrayList();
        Connection con=ConnexionBDD.getConnection();
        if(con!=null){
        ResultSet rs=null;
        Statement statement=null;
        try{
            String sql1="SELECT image FROM vetements";
            statement=con.createStatement();
            rs=statement.executeQuery(sql1);
        
            Article ar;
            while(rs.next()){
            ar=new Article();
            ar.setImage(rs.getString("image"));
            listImages.add(ar);
        }
        
        }
        catch(SQLException e){
            System.out.println("erreur dans la requete ");
            e.printStackTrace();
        }finally{
            try{
        rs.close();
        statement.close();
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
