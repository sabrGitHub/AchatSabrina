<%-- 
    Document   : menu
    Created on : 2018-08-24, 09:54:08
    Author     : 1795891
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="CSS/StyleMenu.css" rel="stylesheet" type="text/css"/>
        
        
        
        
         <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Menu des page </title>
    </head>
	<body>

		

           
<!------ Include the above in your HEAD tag ---------->

<nav class="navbar navbar-expand-sm bg-info navbar-dark">
    
        <a href="magasin.jsp" class="navbar-brand">${Macceuil}</a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <a href="contact.jsp" class="nav-item active nav-link">${Mcontact}</a>
                <a href="localisation.jsp" class="nav-item active nav-link">${Mlocalisation}</a>
                <a href="Connexion.jsp" class="nav item active nav-link">${MmonCompte}</a>

               
            </ul>

            <form action="#" class="form-inline my-2 mylg-0">
                
                <input type="search" name="buscar" id="buscar" class="form-control mr-sm-2" placeholder=${MchercherArticle} aria-label="Buscar">
                
                <button class="btn-info" type="submit">${Mrechercher}</button>
                <input type="image" name="image"  src="${nomImage}" alt=""  />
              
            </form>
            <br/>
            <a href="Connexion.jsp"> <img src="images/sac.jpg" alt="" width="50" height="50"/> </a>
        </div>
    </nav>

<div class="jumbotron text-center"   >
                    <img src="images/logo.PNG" alt="" height="100" width=200"/><br/>
                    <h3>Choisissez votre look chez nous!</h3> 
			
                        <img src="images/tendanceFemme.jpg" alt="" height="300" width=600"/>
                        <img src="images/tendanceHomme.jpg" alt="" height="300" width=600"/>
                        
		</div>
            
            
    </body>
</html>
