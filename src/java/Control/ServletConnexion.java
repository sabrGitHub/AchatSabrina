/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Client;
import model.ListArticle;
import DAO.RequeteConnexion;
import util.CalculAchat;

/**
 *
 * @author 1795891
 */
public class ServletConnexion extends HttpServlet {

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
        HttpSession session=request.getSession();
        ListArticle monPanier= (ListArticle) session.getAttribute("monPanier");
        String user=request.getParameter("user");
        String adresse=request.getParameter("adresse");
        String email=request.getParameter("email");
        String pwd=request.getParameter("pwd");
        String action=request.getParameter("action");
        try
        {
        if(action.equals("creer")){
        RequeteConnexion.InsertSession(user, adresse, email, pwd);
        Client client= RequeteConnexion.verifierUser(user, pwd);
            System.out.println("le client est "+client.getUtilisateur());
        session.setAttribute("client", client);
            ServletContext sc = getServletContext();
            RequestDispatcher disp = sc.getRequestDispatcher("/checkOut.jsp");
            disp.forward(request,response);
            
        }
        else if(action.equals("connecter")){
           Client client= RequeteConnexion.verifierUser(user, pwd);
           if(client!=null){
            double total=CalculAchat.CalculerTotal(monPanier);
             session.setAttribute("total",total);
           session.setAttribute("client", client);
            System.out.println("le client "+client.getUtilisateur());
           ServletContext sc = getServletContext();
           RequestDispatcher disp = sc.getRequestDispatcher("/checkOut.jsp");
            disp.forward(request,response);
           }else{
               
           
            System.out.println("le client "+client.getUtilisateur());
           }
        }
        }catch(Exception e){
            RequestDispatcher disp = request.getRequestDispatcher("/ErreurConnexion.jsp");
            disp.forward(request,response);
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
