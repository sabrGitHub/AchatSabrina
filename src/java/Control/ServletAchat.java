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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Article;
import model.ListArticle;
import util.CalculAchat;
import util.VerificationDoublon;

/**
 *
 * @author 1795891
 */
public class ServletAchat extends HttpServlet {

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
   //  response.setContentType("text/html;charset=UTF-8");
     HttpSession session=request.getSession();
          
         if(session==null){
              response.sendRedirect("http://localhost:82/error.html");
         }
         
         ListArticle monPanier= (ListArticle) session.getAttribute("monPanier");
         if(monPanier==null){
             monPanier=new ListArticle();
            session.setAttribute("monPanier",monPanier);
         }
         
         //recuperer la langue preferer par les cookies 
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
        
        
        
        
         
         String action=request.getParameter("action");
        // String action2=request.getParameter("action2");
         if(!action.equals("PAYE")){
             if(action.equals("ADD")){

             String id=request.getParameter("id");
             String nomArticle=request.getParameter("nomArticle");
             int   quantite=Integer.parseInt(request.getParameter("qte"));
             double  prix=Double.parseDouble(request.getParameter("prix"));
             
             Article ar=new Article(id,nomArticle,quantite,prix);
           
             VerificationDoublon.verifierDoublon(monPanier,ar);
             
          
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
        
            session.setAttribute("monPanier",monPanier);
            ServletContext sc = getServletContext();
            RequestDispatcher disp = sc.getRequestDispatcher("/magasin.jsp");
            disp.forward(request,response);
            }
             else if(action.equals("CHECKOUT")){
                 
            double total=CalculAchat.CalculerTotal(monPanier);
             session.setAttribute("total",total);
             //session.setAttribute("monPanier",monPanier);
             ServletContext sc = getServletContext();
             
                //ressources Bundle
             ResourceBundle resourceBundle=ResourceBundle.getBundle("ressources.Internationalisation", locale);
        request.setAttribute("Chconnexion", resourceBundle.getString("Chconnexion"));
        request.setAttribute("Chuser", resourceBundle.getString("Chuser"));
        request.setAttribute("Chpsw", resourceBundle.getString("Chpsw"));
        request.setAttribute("ChCree", resourceBundle.getString("ChCree"));
                
        
             RequestDispatcher disp = sc.getRequestDispatcher("/Connexion.jsp");
            disp.forward(request,response);
            // session.invalidate();
         
         }
         
         }else
            if(action.equals("PAYE")){
                String nomImage=request.getParameter("image");
            double total=CalculAchat.CalculerTotal(monPanier);
             session.setAttribute("total",total);
             
               //ressources Bundle
                 ResourceBundle resourceBundle=ResourceBundle.getBundle("ressources.Internationalisation", locale);
                request.setAttribute("ChnomUser", resourceBundle.getString("ChnomUser"));
                request.setAttribute("ChEmail", resourceBundle.getString("ChEmail"));
                request.setAttribute("Chadresse", resourceBundle.getString("Chadresse"));
                request.setAttribute("Chville", resourceBundle.getString("Chville"));
                request.setAttribute("Chprovaince", resourceBundle.getString("Chprovaince"));
                request.setAttribute("Chcarte", resourceBundle.getString("Chcarte"));
                request.setAttribute("Chnomcarte", resourceBundle.getString("Chnomcarte"));
                request.setAttribute("Chnumcarte", resourceBundle.getString("Chnumcarte"));
                request.setAttribute("ChmEX", resourceBundle.getString("ChmEX"));
                request.setAttribute("ChaEx", resourceBundle.getString("ChaEx"));
                request.setAttribute("Chfacture", resourceBundle.getString("Chfacture"));
             ServletContext sc = getServletContext();
             RequestDispatcher disp = sc.getRequestDispatcher("/payement.jsp");
            disp.forward(request,response);
                  //session.invalidate();
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
