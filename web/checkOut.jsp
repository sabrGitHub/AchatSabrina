<%-- 
    Document   : checkOut
    Created on : 2018-08-17, 08:35:56
    Author     : 1795891
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" import="java.util.*,model.Article" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>CheckOut</title>
    </head>
    <body>
        <div > 
        
        <jsp:include page="menu.jsp"  />
        </div>
        <h2>Bonjour ${client.utilisateur}</h2>
        <h1>Voici les article que voius aver choisi chez nous </h1>
        
           <c:if test="${monPanier.size()!=null}">
            <table class="table table-condensed">
                <tr>
                    <td>id</td>
                    <td>nomArticle</td>
                    <td>quantite</td>
                    <td>prix</td>
                    <td>Total:</td>
                    
                </tr>
                <c:forEach var="pan" items="${monPanier}">
                    <tr>
                        <td>${pan.id}  </td>
                        <td>${pan.nomArticle} </td>
                        <td>${pan.quantite} </td>
                        <td>${pan.prix}<td>
                        <td>${total}</td>
                    </tr>
                </c:forEach>
            </table>
            
        </c:if>
    
        <form name="payForm" action="ServletAchat" method="POST">
    
    <input type="submit" name="paye" value="Payer vos articles">
    <input type="hidden" name="action" value="PAYE">
  </form>
         <a href="magasin.jsp">Continuer a magaziner</a>
         
    </body>
</html>
