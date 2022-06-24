/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HOME
 */
public class Venta {

    private String td;
    private String nd;
    private LocalDateTime fechaHora;
    public static final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private String cliente;
    private double valor;
    private String descripcion;
    private Panel p;

    public Venta(String td, String nd, String fechaHora, String cliente, double valor, String descripcion, Panel p) {
        this.td = td;
        this.nd = nd;
        this.fechaHora = LocalDateTime.parse(fechaHora, formatoFecha);
        this.cliente = cliente;
        this.valor = valor;
        this.descripcion = descripcion;
        this.p = p;
    }

    public Venta() {

    }

    public int calcularDias() {
        LocalDateTime fechaActual = LocalDateTime.now();
        Duration dd = Duration.between(fechaHora, fechaActual);
        return (int) dd.toDays();
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
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

    @Override
    public String toString() {
        return "Venta{" + "\n Id del panel= " + p.getId()+ "\n tipo doc= " + td + "\n numero doc= " + nd + "\n fecha= " + fechaHora
                + "\n cliente= " + cliente + "\n valor= " + valor + "\n descripcion= " + descripcion + '}';
    }

}
