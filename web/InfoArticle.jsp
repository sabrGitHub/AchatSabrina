<%-- 
    Document   : InfoArticle
    Created on : 2018-08-17, 12:20:06
    Author     : 1795891
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
             <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>Infos Article</title>
    </head>
    <body>
        
        <br/><br/><br/><br/><br/><br/><br/><br/>
        <div>
            <form  action="ServletAchat" method="POST">
           <table class="table table-condensed">
                <tr>
                   <td rowspan="10"><input type="image" name="image"  src="${NomImage}" value="${NomImage}" alt="" width="400" height="=350" /></td>
                    <td>
                        
                        <input type="hidden" name="id" value="${id}" />
                        <tr><td>${ChNomArticle}: <input type="text" name="nomArticle" value="${nomArticle}" /></td> </tr>
                        <tr><td>${ChPrix}:<input type="text" name="prix" value="${prix}"/></td> </tr>
                        
                        <tr><td><b>${ChQuantite} :</b><input type="number" name="qte" SIZE="3" value=1></td> </tr>
                    </td>
                </tr>
                
            </table>
                        
            
            <input type="hidden" name="action" value="ADD" />
            
            <input type="submit"  value="Ajouter a mon sac" class="btn">
            <a href="checkOut.jsp">CheckOut</a>
        </form>
         
                         
        </div>
    <div class="row">
    <div class="container">          
            <jsp:include page="monSac.jsp"  />
    </div>
    </div>
    </body>
</html>
