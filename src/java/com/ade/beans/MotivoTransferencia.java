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
public class MotivoTransferencia {
    
    private String nombre;
    private byte activo;
    private int tipo;

    public MotivoTransferencia() {
    }

    public MotivoTransferencia(String nombre, byte activo, int tipo) {
        this.nombre = nombre;
        this.activo = activo;
        this.tipo = tipo;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "MotivoTransferencia{" + "nombre=" + nombre + ", activo=" + activo + ", tipo=" + tipo + '}';
    }

}
