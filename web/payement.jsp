<%-- 
    Document   : payement
    Created on : 2018-09-12, 13:28:33
    Author     : 1795891
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" import="java.util.*,model.Article" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="CSS/stylePaye.css" rel="stylesheet" type="text/css"/>
            
    </head>
    <body>
<div > 
        
        <jsp:include page="menu.jsp"  />
        </div>
<div class="row">
  <div class="col-75">
    <div class="container">
      <form name="formPay" action="FacturePDF">
      
        <div class="row">
          <div class="col-50">
            <label for="fname"><i class="fa fa-user"></i> ${ChnomUser}:</label>
            <input type="text" id="fname" name="firstname" placeholder="John M. Doe">
            <label for="email"><i class="fa fa-envelope"></i>${ChEmail}:</label>
            <input type="text" id="email" name="email" placeholder="john@example.com">
            <label for="adr"><i class="fa fa-address-card-o"></i>${Chadresse}:</label>
            <input type="text" id="adr" name="address" placeholder="10555 Avenue de Bois de Boulogne">
            <label for="city"><i class="fa fa-institution"></i> ${Chville}:</label>
            <input type="text" id="city" name="city" placeholder="Montreal">

            <div class="row">
              <div class="col-50">
                <label for="state">${Chprovaince}:</label>
                <input type="text" id="state" name="state" placeholder="Qc">
              </div>
            </div>
          </div>

          <div class="col-50">
            <h3>Payment</h3>
            <label for="fname">${Chcarte}:</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
            <label for="cname">${Chnomcarte}:</label>
            <input type="text" id="cname" name="cardname" placeholder="John More Doe">
            <label for="ccnum">${Chnumcarte} :</label>
            <input type="text" id="ccnum" name="cardnumber" placeholder="514-111-1111">
            <label for="expmonth">${ChmEX}: </label>
            <input type="text" id="expmonth" name="expmonth" placeholder="Septembre">
            <div class="row">
              <div class="col-50">
                <label for="expyear">${ChaEx}:</label>
                <input type="text" id="expyear" name="expyear" placeholder="2018">
              </div>
              <div class="col-50">
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" placeholder="111">
              </div>
            </div>
          </div>
          
        </div>
        <input type="submit"  value="${Chfacture}" class="btn">
      </form>
    </div>
  </div>
  <div class="col-25">
    <div class="container">
        <h4>Cart <span class="price" style="color:black"><i class="fa fa-shopping-cart"></i>${monPanier.size()} </span></h4>
          <c:forEach var="pan" items="${monPanier}">
                <p><a href="#">${pan.nomArticle}</a> <span class="price">${pan.prix}</span></p>
          </c:forEach>
      
      <hr>
      <p>Total <span class="price" style="color:black"><b>${total}</b></span></p>
    </div>
  </div>
</div>
    </body>
</html>
