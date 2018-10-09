<%-- 
    Document   : CreationSession
    Created on : 2018-08-29, 08:25:13
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
        <link href="CSS/styleConn.css" rel="stylesheet" type="text/css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Fenetre creation de connexion</title>
    </head>
    <body>
        
        <jsp:include page="menu.jsp"  />
        <!DOCTYPE html>

<div class="row">
  <div class="col-75">
    <div class="container">
      <form name="formConn" action="ServletConnexion">
      
        <div class="row">
          <div class="col-50">
            <h3>Créer une session</h3>
            <label for="user"><i class="fa fa-user"></i> Nom Utilisateur: </label>
            <input type="text"  name="user" placeholder="John M. Doe">
            <label for="addre"><i class="fa fa-address-card-o"></i> Adresse: </label>
            <input type="text"  name="adresse" placeholder="num  rue ville">
            <label for="email"><i class="fa fa-envelope"></i> Email</label>
            <input type="text"  name="email" placeholder="john@example.com">
            <label for="pwd"><i class="fa fa-key"></i> Mot de passe </label>
            <input type="password"  name="pwd" placeholder="max 20 caract"><br/>
            <input type="submit" value="Enregister">
           
             <input type="hidden" name="action" value="creer" />

        
                     </div>

                </div>
             </form>
 
        </div>
    </div>
</div>
      

</body>
</html>
