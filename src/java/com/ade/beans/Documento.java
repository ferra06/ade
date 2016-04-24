/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ade.beans;

import java.util.Date;

/**
 *
 * @author Agente 87
 */
public class Documento {
    
    private String asunto;
    private Date fechaCreacion;
    private int fojas;
    private String detalle;
    private String nombreIniciador;
    private String domicilioIniciador;
    private Oficina oficina;
    private Usuario usuario;
    private TipoDeDocumento tipoDeDocumento;
    private Tema tema;

    public Documento() {
    }

    public Documento(String asunto, Date fechaCreacion, int fojas, String detalle, String nombreIniciador, String domicilioIniciador, Oficina oficina, Usuario usuario, TipoDeDocumento tipoDeDocumento, Tema tema) {
        this.asunto = asunto;
        this.fechaCreacion = fechaCreacion;
        this.fojas = fojas;
        this.detalle = detalle;
        this.nombreIniciador = nombreIniciador;
        this.domicilioIniciador = domicilioIniciador;
        this.oficina = oficina;
        this.usuario = usuario;
        this.tipoDeDocumento = tipoDeDocumento;
        this.tema = tema;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getFojas() {
        return fojas;
    }

    public void setFojas(int fojas) {
        this.fojas = fojas;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getNombreIniciador() {
        return nombreIniciador;
    }

    public void setNombreIniciador(String nombreIniciador) {
        this.nombreIniciador = nombreIniciador;
    }

    public String getDomicilioIniciador() {
        return domicilioIniciador;
    }

    public void setDomicilioIniciador(String domicilioIniciador) {
        this.domicilioIniciador = domicilioIniciador;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Documento{" + "asunto=" + asunto + ", fechaCreacion=" + fechaCreacion + ", fojas=" + fojas + ", detalle=" + detalle + ", nombreIniciador=" + nombreIniciador + ", domicilioIniciador=" + domicilioIniciador + ", oficina=" + oficina + ", usuario=" + usuario + ", tipoDeDocumento=" + tipoDeDocumento + ", tema=" + tema + '}';
    }
    
}
