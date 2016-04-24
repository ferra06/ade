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
public class Tema {
    
    private String codigo;
    private String nombre;
    private byte activo;
    private String obeservaciones;

    public Tema() {
    }

    public Tema(String codigo, String nombre, byte activo, String obeservaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.activo = activo;
        this.obeservaciones = obeservaciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getActivo() {
        return activo;
    }

    public void setActivo(byte activo) {
        this.activo = activo;
    }

    public String getObeservaciones() {
        return obeservaciones;
    }

    public void setObeservaciones(String obeservaciones) {
        this.obeservaciones = obeservaciones;
    }

    @Override
    public String toString() {
        return "Tema{" + "codigo=" + codigo + ", nombre=" + nombre + ", activo=" + activo + ", obeservaciones=" + obeservaciones + '}';
    }

}
