<%-- 
    Document   : affichageParCategorie
    Created on : 2018-08-20, 15:42:22
    Author     : 1795891
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link href="CSS/StyleMenu.css" rel="stylesheet" type="text/css"/>
        <script src="Scripts/scriptCouleur.js" type="text/javascript"></script>
        <title>categorie de vetement</title>
    </head>
    <body>
        
        <table>
            <tr>
            <c:set var="count" value="0"></c:set>
                <c:forEach var="img" items="${mesImages}" varStatus="loop">
                    
                    
                    <c:if test="${count>=3}">
                             <tr>
                                 
                         <c:set var="count" value="0"></c:set>
                    </c:if>
                          <c:set var="count" value="${count+1}"></c:set>
                        <td>
                           <form  action="ServletInfoArticle" >
                              <input type="image" name="image" id="afficheImg${loop.index}"  src="${img.image}" alt="" value="${img.image}" width="400" height="600" /><br/>
                              id:<input type="text" name="id" value="${img.id}"/><br/>
                              ${ChPrix}:<input type="text" name="prix" value="${img.prix}"/><br/>
                              ${ChNomArticle}:<input type="text" name="nomArticle" value="${img.nomArticle}"/><br/>
                              ${ChGenre}:<input type="text" name="nomArticle" value="${img.genre}"/><br/>
                              ${ChTaille}:<input type="text" name="taille" value="xl"/><br/>
                              <input type="hidden" id="genre" value="${img.genre}">
                            <input type="hidden" id="categorie"  value="${img.nomArticle}">
                            <input type="hidden" name="NomImage" value="${img.image}">
                           </form>
                             
                              <input type="image" name="image" src="images/blanc.png" alt="" width="30" height="30" onclick="afficheBlanc(${loop.index}) " />
                              <input type="image" name="image" src="images/rouge.jpg" alt="" width="30" height="30" onclick="afficheRouge(${loop.index})" />
                              <input type="image" name="image" src="images/noir.jpg" alt="" width="30" height="30" onclick="afficheNoir(${loop.index})" /><br/>
                              
                        </td>
                   
                
                </c:forEach>
                        </tr>
        </table>
            
    </body>
</html>
