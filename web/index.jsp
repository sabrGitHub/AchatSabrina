<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 2018-09-14, 09:52:24
    Author     : 1795891
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
          <style>
  body { 
      background-image:  url("images/fonEcran.jpg") ;
   
  }
 
  .center {
    position: absolute;
    left: 0;
    top: 30%;
    width: 100%;
    text-align: center;
    font-size: 18px;
}
h3 {
    color: whitesmoke;
}
  
  </style>
    </head>
    <body>
      
    
        <div class="row">
             <div class="col-sm-1">
              </div>
            <div class="center">  
           <div class="col-sm-4">
               <h3>choose your prefert language  </h3>
           <a href ="ServletLocal?language=en_US"> <img src="images/usa.jpg" class="img-circle" alt="Anglais " width="250" height="200"> </a>
           </div>
              <div class="col-sm-1">
              </div>
            <div class="col-sm-4">
                
                <h3>Choisir votre langue préférer </h3>
                 <a href ="ServletLocal?language=fr_CA"> <img src="images/canada.jpg" class="img-circle" alt="Francais " width="250" height="200"> </a>
            </div>
             <div class="col-sm-1">
              </div>
     </div>
    </div>
    </body>
</html>
