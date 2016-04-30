/*
 * Representa los datos del formulario de validacion de usuario
 * login.jsp
 *
 */
package com.ade.action.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author 8)
 */
public class LoginForm extends org.apache.struts.action.ActionForm {

    private String usuario;
    private String password;
    private String passwordrep;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordrep() {
        return passwordrep;
    }

    public void setPasswordrep(String passwordrep) {
        this.passwordrep = passwordrep;
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if (getUsuario()== null || getUsuario().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        if (getPassword()== null || getPassword().length() < 1) {
            errors.add("name", new ActionMessage("error.password.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        return errors;
    }
}
