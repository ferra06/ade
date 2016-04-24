/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ade.beans;

/**
 *
 * @author Agente 87
 */
public class Usuario {
    
    private String user;
    private String pass;
    private byte activo;
    private Oficina oficina;

    public Usuario() {
    }

    public Usuario(String user, String pass, byte activo, Oficina oficina) {
        this.user = user;
        this.pass = pass;
        this.activo = activo;
        this.oficina = oficina;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public byte getActivo() {
        return activo;
    }

    public void setActivo(byte activo) {
        this.activo = activo;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + ", pass=" + pass + ", activo=" + activo + ", oficina=" + oficina + '}';
    }
    
}
