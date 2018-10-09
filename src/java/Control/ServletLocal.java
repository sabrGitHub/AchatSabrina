/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1795891
 */
public class ServletLocal extends HttpServlet {

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
        String[] pLanguage=request.getParameter("language").split("_");
        String language=pLanguage[0];
        String country=pLanguage[1];
        Cookie cookie1=new Cookie ("language",language);
        Cookie cookie2=new Cookie ("country",country);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        Locale locale=new Locale(language,country);
       
        request.setAttribute("country",locale.getDisplayCountry());
        ResourceBundle resourceBundle=ResourceBundle.getBundle("ressources.Internationalisation", locale);
        request.setAttribute("Macceuil", resourceBundle.getString("Macceuil"));
        request.setAttribute("Mcontact", resourceBundle.getString("Mcontact"));
        request.setAttribute("Mlocalisation", resourceBundle.getString("Mlocalisation"));
        request.setAttribute("MmonCompte", resourceBundle.getString("MmonCompte"));
        request.setAttribute("MchercherArticle", resourceBundle.getString("MchercherArticle"));
        request.setAttribute("Mrechercher", resourceBundle.getString("Mrechercher"));
        request.setAttribute("Cfemme", resourceBundle.getString("Cfemme"));
        request.setAttribute("Cjupe", resourceBundle.getString("Cjupe"));
        request.setAttribute("CpentatonF", resourceBundle.getString("CpentatonF"));
        request.setAttribute("Crobe", resourceBundle.getString("Crobe"));
        request.setAttribute("Chomme", resourceBundle.getString("Chomme"));
        request.setAttribute("Cchemise", resourceBundle.getString("Cchemise"));
        request.setAttribute("CpentalonH", resourceBundle.getString("CpentalonH"));
        request.setAttribute("Ccravate", resourceBundle.getString("Ccravate"));
        request.setAttribute("Csolde", resourceBundle.getString("Csolde"));
        request.setAttribute("Clui", resourceBundle.getString("Clui"));
        request.setAttribute("Celle", resourceBundle.getString("Celle"));
        
        
        request.getRequestDispatcher("magasin.jsp").forward(request, response);
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
