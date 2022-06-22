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
public class Panel {

    private static int existencias;
    private final int id;
    private String serie;
    private String descripcion;
    private String tipo;
    private String modelo;
    private int anio;
    private double precio;

    public Panel(String serie, String descripcion, String tipo, String modelo, int anio, double precio) {
        existencias++;
        this.id = existencias;
        this.serie = serie;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public static int getExistencias() {
        return existencias;
    }

    public int getId() {
        return id;
    }

    public String getSerie() {
        return serie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    public static void setExistencias(int existencias) {
        Panel.existencias = existencias;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
