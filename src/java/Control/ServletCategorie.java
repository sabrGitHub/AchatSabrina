/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.RequestSQL;
import DAO.RequeteCategorie;
import DAO.RequeteSolde;
import vue.RechercheParCategorie;

/**
 *
 * @author 1795891
 */
public class ServletCategorie extends HttpServlet {

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
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        String genre=request.getParameter("genre");
        String categorie=request.getParameter("categorie");
        String nom_vet=request.getParameter("nom_vetement");
       
        ArrayList mesImages=new ArrayList();
        mesImages=RequeteCategorie.getCategorieListImages(genre, categorie);
        
         
        request.setAttribute("mesImages", mesImages);
        String language="";
        String country="";
        Locale locale;
         Cookie[]cookies=request.getCookies();
        if(cookies!=null)
        {
            for(Cookie cookie:cookies)
            {
                if(cookie.getName().equals("cookie1"))
                {
                     language=cookie.getValue();
                }
                 if(cookie.getName().equals("cookie2"))
                {
                     country=cookie.getValue();
                }
            }
        }
        locale=new Locale(language,country);
        ResourceBundle resourceBundle=ResourceBundle.getBundle("ressources.Internationalisation", locale);
        request.setAttribute("ChPrix", resourceBundle.getString("ChPrix"));
        request.setAttribute("ChNomArticle", resourceBundle.getString("ChNomArticle"));
        request.setAttribute("ChGenre", resourceBundle.getString("ChGenre"));
        request.setAttribute("ChTaille", resourceBundle.getString("ChTaille"));
        
         RequestDispatcher disp=request.getRequestDispatcher("affichageParCategorie.jsp");
         disp.forward(request,response);
         
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
