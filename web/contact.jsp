<%-- 
    Document   : localisation
    Created on : 2018-09-12, 11:09:20
    Author     : 1795891
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
  
        <link href="bootstrap.css" type="text/css" rel="stylesheet" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="bootstrap.js"></script>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
        
        <link href="CSS/Style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div > 
        
        <jsp:include page="menu.jsp"  />
        </div>
         <div class="container">
            

        <div class="row">
            <div class="col-sm-12">
            <h3>Nous joindre</h3>
            <hr style="color:black;">
            </div>
            <div class="row">
                    <div class="col-sm-6">
                            <p>10555, avenue de Bois-de-Boulogne</br> Montréal (Québec)  H4N 1L4</br>
                            Email: shopstyle@gmail.com</br>
                            Téléphone: 514-889-7555</br>composer le 1 pour information</br>
                            Fax: 514-889-7666</p>

                    </div>
            <div class="col-sm-6">
                    <p>Heures d'ouverture</br>
                    Du lundi au mercredi, de 9h à 18h</br>
                    Du vendredi au jeudi, de 9h à 21h</br>
                    Samedi et dimanche, de 10h à 17h<p>
            </div>
            </div>
        </div>
        </br>
        <div class="row">
            <div class="col-sm-12">
            <h3>Contactez-nous</h3>
            <div class="row">
            <div class="col-sm-3">
            </div>
            <div class="col-sm-6">

            <hr style="color:black;">
                            Votre nom complet : <input type="text" id="nom" class="form-control"/><br/>
                            Votre courriel : <input type="text" id="mail" class="form-control"/><br/>
                            Votre téléphone : <input type="number" id="tel" class="form-control"/><br/>
                            Votre message : </br>
                            <textarea id="txtMessage" rows="10" cols="50" class="form-control" /></textarea><br/>
                            <button class="btn btn-success" type="submit" onclick="vider()">Envoyer</button>
            </div>
            <div class="col-sm-4">
            </div>
            </div>	
            </div>
        </div>
    </body>
</html>
