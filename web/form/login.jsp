<%-- 
    Document   : login
    Created on : 23/04/2016, 15:14:31
    Author     : Agente 87
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <!-- SECCION head : Informacion sobre el documento (No mostrada por el navegador)  -->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Administracion de documentos electronicos </title>
    </head>
    
    <!-- 
    Bajo el tags <&codigo&> se introduce codigo Java.
    javax.servlet.jsp.PageContext permite referencia el contexto de la pagina JSP,
    permite acceso centralizado los distintos atributos de la pagina, 
    proporciona funcionalidades genercias. 
    javax.servlet.http.HttpServletRequest permite referenciar el contexto de peticion HTTP
    -->
    <%pageContext.setAttribute("urlDestino", request.getParameter("urlDestino")); %>
    
    
    <!-- Datos mostrados en la pagina HTML -->
    <body>
        <center>
            <h3><b> Ingreso al sistema </b></h3>
        </center>
        <br><br><br><br><br>
        <!--
        Tabla[3;2]
        Usuario :___
        Password:___
        aceptar cancelar
        -->
        <table class="form-block" align="center">
            <tr>
                <th align="right" >Usuario:</th>
                <td> <input type="text" name="usuario"> </td>
            </tr>
            <tr>
                <th align="right" >Clave:</th>
                <td> <input type="password" name="clave"> </td>
            </tr>
            <tr>
                <th>  </th>
                <th> <input type="button" value="Aceptar"> 
                     <input type="button" value="Cancepar"> 
                </th>
            </tr>
            
        </table>
        
    </body>
</html>
