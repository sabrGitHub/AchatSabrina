<%-- 
    Document   : magasin
    Created on : 2018-08-17, 08:36:37
    Author     : 1795891
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Liste des articles au magasin</title>
        
        
        

    </head>
    <body>
        
        
        <div > 
        
        <jsp:include page="menu.jsp"  />
        </div>
    <div class="row">

       <div class="w3-container">

        <div class="w3-bar w3-light-grey">
          <div class="w3-dropdown-hover">
            <button  style="width:400px" class="w3-bar-item w3-button w3-mobile">${Cfemme}</button>
            <div class="w3-dropdown-content w3-bar-block w3-card-4"  style="width: 400px">
              <a href="ServletCategorie?genre=F&categorie=jupe&action=nonSolde" class="w3-bar-item w3-button"  >${Cjupe}</a>
              <a href="ServletCategorie?genre=F&categorie=robe&action=nonSolde" class="w3-bar-item w3-button">${Crobe}</a>
              <a href="ServletCategorie?genre=F&categorie=pantalon&action=nonSolde" class="w3-bar-item w3-button">${CpentatonF}</a>
            </div>
          </div>

            <div class="w3-dropdown-hover">
            <button style="width:400px" class="w3-bar-item w3-button w3-mobile">${Chomme}</button>
            <div class="w3-dropdown-content w3-bar-block w3-card-4"  style="width: 400px">
              <a href="ServletCategorie?genre=H&categorie=pantalon" class="w3-bar-item w3-button">${CpentalonH}</a>
              <a href="ServletCategorie?genre=H&categorie=chemise" class="w3-bar-item w3-button">${Cchemise}</a>
              <a href="ServletCategorie?genre=H&categorie=cravate" class="w3-bar-item w3-button">${Ccravate}</a>
            </div>
          </div>
             <div class="w3-dropdown-hover">
            <button style="width:400px" class="w3-bar-item w3-button w3-mobile">${Csolde}</button>
            <div class="w3-dropdown-content w3-bar-block w3-card-4" style="width: 400px">
              <a href="ServletCategorie?genre=H&nom_vetement=vet_solde&action=solde" class="w3-bar-item w3-button">${Clui}</a>
              <a href="ServletCategorie?genre=F&nom_vetement=vet_solde&action=solde" class="w3-bar-item w3-button">${Celle}</a>
            </div>
          </div>
        </div>
      </div>
   </div>
                      
       

         
               
                
    </body>
</html>
