/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Article;
import DAO.RequeteCouleur;

/**
 *
 * @author 1795891
 */
public class ServletAffichageParCouleur extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json");
      
        String genre=request.getParameter("genre");
        String categorie=request.getParameter("categorie");
        String couleurB=request.getParameter("couleurB");
        String couleurR=request.getParameter("couleurR");
        String couleurN=request.getParameter("couleurN");
        
        if(couleurB.equals("") &&couleurR.equals("") ){
             Article article=RequeteCouleur.getCouleurListImages(genre, categorie, couleurN);
             Map<String,String>couleurVet=new HashMap<String,String>();
        couleurVet.put("image",article.getImage());
        System.out.println("LA PHOTOE EST NOIR"+article.getImage());
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        String json=gson.toJson(couleurVet);
        response.getWriter().write(json);
        }
        else
           if(couleurN.equals("") &&couleurR.equals("") ){
             Article article=RequeteCouleur.getCouleurListImages(genre, categorie, couleurB);
             Map<String,String>couleurVet=new HashMap<String,String>();
        couleurVet.put("image",article.getImage());
        System.out.println("LA PHOTOE EST blanc"+article.getImage());
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        String json=gson.toJson(couleurVet);
        response.getWriter().write(json);
        }
       else
           
              if(couleurB.equals("") &&couleurN.equals("") ){
             Article article=RequeteCouleur.getCouleurListImages(genre, categorie, couleurR);
             Map<String,String>couleurVet=new HashMap<String,String>();
        couleurVet.put("image",article.getImage());
        System.out.println("LA PHOTOE EST ROUGE"+article.getImage());
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        String json=gson.toJson(couleurVet);
        response.getWriter().write(json);
        }
            
       

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
