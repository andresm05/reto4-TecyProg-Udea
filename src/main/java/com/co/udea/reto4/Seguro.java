/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author HOME
 */
public class Seguro {

    private String empresa;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    public static final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private Panel p;

    public Seguro(String empresa, String descripcion, String fechaInicio, String fechaFin, Panel p) {
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.fechaInicio = LocalDate.parse(fechaInicio, formatoFecha);
        this.fechaFin = LocalDate.parse(fechaFin, formatoFecha);
        this.p = p;
    }
    public Seguro(){
        
    }
    
    public int calcularDias(){
        Duration dd = Duration.between(fechaInicio.atStartOfDay(), fechaFin.atStartOfDay());
        return (int) dd.toDays();
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
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

    @Override
    public String toString() {
        return "Seguro{" + "\n empresa= " + empresa + "\n descripcion= " + descripcion + 
                "\n fecha Inicio= " + fechaInicio + "\n fecha Fin= " + fechaFin + "\n Id del panel= " + p.getId() + '}';
    }
    
    
}
