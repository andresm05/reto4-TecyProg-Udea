/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto4;

/**
 *
 * @author HOME
 */
public class Seguro {

    private String empresa;
    private String descripcion;
    private Panel p;

    public Seguro(String empresa, String descripcion, Panel p) {
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.p = p;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Panel getP() {
        return p;
    }

    public void setP(Panel p) {
        this.p = p;
    }
    
    
}
