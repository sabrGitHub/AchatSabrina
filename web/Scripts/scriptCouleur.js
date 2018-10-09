/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function afficheBlanc(x)
{
    numImg=x;
    var xmlhttp =new XMLHttpRequest();
    var url ="ServletAffichageParCouleur?couleurB=blanc"+
            "&genre="+document.getElementById("genre").value+"&categorie="+document.getElementById("categorie").value
     +"&couleurR="+"&couleurN=";
    xmlhttp.onreadystatechange=getDataB;
    xmlhttp.open("GET",url,true);
    xmlhttp.send();

}

function afficheRouge(x)
{
    numImg=x;
    var xmlhttp =new XMLHttpRequest();
    var url ="ServletAffichageParCouleur?couleurR=rouge"+
            "&genre="+document.getElementById("genre").value+"&categorie="+document.getElementById("categorie").value
     +"&couleurB="+"&couleurN=";
    xmlhttp.onreadystatechange=getDataR;
    xmlhttp.open("GET",url,true);
    xmlhttp.send();

}
function afficheNoir(x)
{   numImg=x;
    var xmlhttp =new XMLHttpRequest();
    var url ="ServletAffichageParCouleur?couleurN=noir"+
            "&genre="+document.getElementById("genre").value+"&categorie="+document.getElementById("categorie").value
    +"&couleurR="+"&couleurB=";
    xmlhttp.onreadystatechange=getDataN;
    xmlhttp.open("GET",url,true);
    xmlhttp.send();

}


function getDataB()
{
    
               alert('bonjour'+document.getElementById("afficheImg"+numImg).src);
   if(this.readyState==4 && this.status==200)
    {
        console.log(this.responseText);
        var obj=JSON.parse(this.responseText);
          document.getElementById("afficheImg"+numImg).src=obj.image;
      }
}

function getDataR()
{
   
               alert('bonjour'+document.getElementById("afficheImg"+numImg).src);
   if(this.readyState==4 && this.status==200)
    {
        console.log(this.responseText);
        var obj=JSON.parse(this.responseText);
          document.getElementById("afficheImg"+numImg).src=obj.image;
      }
}

function getDataN()
{
    
               alert('bonjour'+document.getElementById("afficheImg"+numImg).src);
   if(this.readyState==4 && this.status==200)
    {
        console.log(this.responseText);
        var obj=JSON.parse(this.responseText);
          document.getElementById("afficheImg"+numImg).src=obj.image;
      }
  }
    
