<%-- 
    Document   : cambiarClave
    Created on : 23/04/2016, 16:10:56
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
    
    <!-- Datos mostrados en la pagina HTML -->
    <body>
        <center>
            <h3><b> Cambiar clave </b></h3>
        </center>
        <br><br><br><br><br>
        
        <table class="form-block" align="center">
            <tr>
                <th align="right"> Usuario: </th>
                <td> <input type="text" name="usuario" readonly="true">  </td>
            </tr>
            
            <tr>
                <th align="right"> Clave anterior: </th>
                <td> <input type="password" name="clave_anterior">  </td>
            </tr>
            
            <tr>
                <th align="right"> Clave nueva: </th>
                <td> <input type="password" name="clave_nueva">  </td>
            </tr>
            
            <tr>
                <th align="right"> Confirmar clave: </th>
                <td> <input type="password" name="clave_confirma">  </td>
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
