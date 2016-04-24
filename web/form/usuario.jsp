<%-- 
    Document   : usuario
    Created on : 24/04/2016, 11:48:37
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
    
    <body>
        
        <center>
            <h3><b> Gestion de Usuario </b></h3>
        </center>    
        <br><br><br><br><br>
       
        <table class="form-block" align="center">
            <tbody>
                <tr>
                    <th align="right" >Usuario:</th>
                    <td> <input type="text" name="usuario"> </td>
                </tr>
                <tr>
                    <th align="right" >Clave:</th>
                    <td> <input type="password" name="clave"> </td>
                </tr>
                <tr>
                    <th align="right" >Confirmar clave:</th>
                    <td> <input type="password" name="confirma_clave"> </td>
                </tr>
                <tr>
                    <th align="right" >Oficina:</th>
                    <td> <input type="text" name="oficina"> </td>
                </tr>
                <tr>
                    <th align="right" >Activo:</th>
                    <td> <select name="activo">
                            <option>Si</option>
                            <option>No</option>
                        </select> </td>
                </tr>
            </tbody>
        </table>

        
        
    </body>
</html>
