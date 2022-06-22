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
public class Venta {

    private String td;
    private String nd;
    private String cliente;
    private double valor;
    private String descripcion;
    private Panel p;

    public Venta(String td, String nd, String cliente, double valor, String descripcion, Panel p) {
        this.td = td;
        this.nd = nd;
        this.cliente = cliente;
        this.valor = valor;
        this.descripcion = descripcion;
        this.p = p;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
