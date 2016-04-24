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
public class TipoDeDocumento {
    
    private String articulo;
    private String caratula;
    private String codigo;
    private String nombre;
    private String ELIdentificador;
    private String ELNumerador;

    public TipoDeDocumento() {
    }

    public TipoDeDocumento(String articulo, String caratula, String codigo, String nombre, String ELIdentificador, String ELNumerador) {
        this.articulo = articulo;
        this.caratula = caratula;
        this.codigo = codigo;
        this.nombre = nombre;
        this.ELIdentificador = ELIdentificador;
        this.ELNumerador = ELNumerador;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
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

    public String getELIdentificador() {
        return ELIdentificador;
    }

    public void setELIdentificador(String ELIdentificador) {
        this.ELIdentificador = ELIdentificador;
    }

    public String getELNumerador() {
        return ELNumerador;
    }

    public void setELNumerador(String ELNumerador) {
        this.ELNumerador = ELNumerador;
    }

    @Override
    public String toString() {
        return "TipoDeDocumento{" + "articulo=" + articulo + ", caratula=" + caratula + ", codigo=" + codigo + ", nombre=" + nombre + ", ELIdentificador=" + ELIdentificador + ", ELNumerador=" + ELNumerador + '}';
    }

}
