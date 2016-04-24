<%-- 
    Document   : oficina
    Created on : 24/04/2016, 11:29:44
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
            <h3><b> Gestion de Oficina </b></h3>
        </center>
        <br><br><br><br><br>
        
        <!--
        Tabla con Nombre y campos para ingresar oficina al sistema
        -->
        <table class="form-block" align="center">
            <tr>
                <th align="right" >Codigo:</th>
                <td> <input type="text" name="codigo"> </td>
            </tr>
            
            <tr>
                <th align="right" >Nombre:</th>
                <td> <input type="text" name="nombre"> </td>
            </tr>
            
            <tr>
                <th align="right" >Observaciones:</th>
                <td> <input type="text" name="observaciones"> </td>
            </tr>
            
            <tr>
                <th align="right" >Oficina Superior:</th>
                <td> <input type="text" name="oficina_superior"> </td>
            </tr>
            
            <tr>
                <th align="right" >Genera documentos:</th>
                <td> <select name="genera">
                        <option>Si</option>
                        <option>No</option>
                    </select> 
                </td>
            </tr>
            
            <tr>
                <th align="right" >Transfiere documentos:</th>
                <td> <select name="transfiere">
                        <option>Si</option>
                        <option>No</option>
                    </select> 
                </td>
            </tr>
            
            <tr>
                <th align="right" >Tiene archivo:</th>
                <td> <select name="archivo">
                        <option>Si</option>
                        <option>No</option>
                    </select> 
                </td>
            </tr>
            
            <tr>
                <th align="right" >Oficina Activa:</th>
                <td> <select name="activa">
                        <option>Si</option>
                        <option>No</option>
                    </select> 
                </td>
            </tr>
            
            <tr>
                <th </th>
                <td> 
                    <input type="submit" value="aceptar" />
                    <input type="submit" value="cancelar" />
                </td>
            </tr>
           
            
        </table>
    </body>
</html>
