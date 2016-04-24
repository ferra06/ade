/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ade.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Agente 87
 */
public class UsuariosAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String ERROR = "error";
    private static final String LOGIN = "login";
    private static final String CAMBIAR_CLAVE = "cambiar";
    

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        System.out.println("LoginAction recibio una peticion desde el cliente. ");
        
        // return mapping.findForward(SUCCESS);
        
        return mapping.findForward(CAMBIAR_CLAVE);
    }
}
