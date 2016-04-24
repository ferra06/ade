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
public class Transferencia {
    
    private Date fecha;
    private int fojas;
    private byte aceptada;
    private Date recepcion;
    private Documento documennto;
    private MotivoTransferencia motivoTransferencia;
    private Oficina oficinaOrigen;
    private Oficina oficinaDestino;
    private Usuario usuario;

    public Transferencia() {
    }

    public Transferencia(Date fecha, int fojas, byte aceptada, Date recepcion, Documento documennto, MotivoTransferencia motivoTransferencia, Oficina oficinaOrigen, Oficina oficinaDestino, Usuario usuario) {
        this.fecha = fecha;
        this.fojas = fojas;
        this.aceptada = aceptada;
        this.recepcion = recepcion;
        this.documennto = documennto;
        this.motivoTransferencia = motivoTransferencia;
        this.oficinaOrigen = oficinaOrigen;
        this.oficinaDestino = oficinaDestino;
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getFojas() {
        return fojas;
    }

    public void setFojas(int fojas) {
        this.fojas = fojas;
    }

    public byte getAceptada() {
        return aceptada;
    }

    public void setAceptada(byte aceptada) {
        this.aceptada = aceptada;
    }

    public Date getRecepcion() {
        return recepcion;
    }

    public void setRecepcion(Date recepcion) {
        this.recepcion = recepcion;
    }

    public Documento getDocumennto() {
        return documennto;
    }

    public void setDocumennto(Documento documennto) {
        this.documennto = documennto;
    }

    public MotivoTransferencia getMotivoTransferencia() {
        return motivoTransferencia;
    }

    public void setMotivoTransferencia(MotivoTransferencia motivoTransferencia) {
        this.motivoTransferencia = motivoTransferencia;
    }

    public Oficina getOficinaOrigen() {
        return oficinaOrigen;
    }

    public void setOficinaOrigen(Oficina oficinaOrigen) {
        this.oficinaOrigen = oficinaOrigen;
    }

    public Oficina getOficinaDestino() {
        return oficinaDestino;
    }

    public void setOficinaDestino(Oficina oficinaDestino) {
        this.oficinaDestino = oficinaDestino;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Transferencia{" + "fecha=" + fecha + ", fojas=" + fojas + ", aceptada=" + aceptada + ", recepcion=" + recepcion + ", documennto=" + documennto + ", motivoTransferencia=" + motivoTransferencia + ", oficinaOrigen=" + oficinaOrigen + ", oficinaDestino=" + oficinaDestino + ", usuario=" + usuario + '}';
    }

}
