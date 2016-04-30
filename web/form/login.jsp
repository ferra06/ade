<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Ingreso al sistema</title>
    </head>

    <%pageContext.setAttribute("urlDestino", request.getParameter("urlDestino"));%>

    <body topmargin="60"  bottommargin="50">

        <center><a href="${pageContext.request.contextPath}/" style="text-decoration: none">
                <h2 >ADMINISTRACI&Oacute;N DE DOCUMENTOS ELECTR&Oacute;NICOS</h2></a>
        </center>
        <hr>

        <center>
            <img src="${pageContext.request.contextPath}/images/java_logo.png" width="100" height="130">
        </center>


        <div id="ctr" align="center">
            <div class="login"> 
                <div class="login-form">
                    <h3 >Ingreso al sistema</h3>

                    <!-- TAG de Struts: Define un Form (Asociado a Action y ActionForm)-->
                    <html:form action="usuariosAction" >
                        
                        <!-- TAG de Struts: Propiedad no visible para el usuario -->
                        <html:hidden property="urlDestino" value="${urlDestino}" />

                        <table class="form-block" align="center">
                            <tr>
                                <th align="right" >Usuario:</th>
                                <td>
                                    <!-- TAG de Struts: Campo de texto - Asociado a login.name -->
                                    <html:text property="name"/>
                                    <html:errors property="name"/>
                                    </td>
                            </tr>
                            <tr>
                                <th align="right" >Clave:</th>
                                <td>
                                    <!-- TAG de Struts: Campo de pass - Asociado a login.password -->
                                    <html:password property="password" maxlength="15"/>
                                    <html:errors property="password"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" align="center">
                                    <html:submit  value="Ingresar" styleClass="buttonBlue"/>
                                </td>
                            </tr>
                        </table>
                    </html:form>


                </div>
            </div>
        </div>
        <div align="center">	
            <html:errors/>
        </div>
        <br>
        <hr>    
    </body>

</html>

