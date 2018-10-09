/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1795891
 */
public class ConnexionBDD {
    
    public static Connection   getConnection(){
        String url="jdbc:oracle:thin:@144.217.163.57:1521:XE";
        String user="OOP";
        String pwd="ooppw";
        
        Connection con=null;
        try  {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con=DriverManager.getConnection(url,user,pwd);
             }
            catch(SQLException e)
            {
                System.out.println("Connexion Impossible");
                e.printStackTrace();
                
            }
        return con;
    }
    
    public static void closeConnection (Connection con)
    {
        if(con!=null){
            try{
            con.close();
            }catch(SQLException e){
                System.out.println("Pas de fermeture de connexion");
                e.printStackTrace();
            }
        }
    }
}
