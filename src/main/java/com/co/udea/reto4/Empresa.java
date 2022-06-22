/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto4;

import java.util.ArrayList;

/**
 *
 * @author HOME
 */
public class Empresa {
    private ArrayList<Panel> paneles;
    private ArrayList<Seguro> seguros;
    private ArrayList<Venta> ventas;

    public Empresa() {
        paneles = new ArrayList<>();
        seguros = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public ArrayList<Panel> getPaneles() {
        return paneles;
    }

    public void setPaneles(ArrayList<Panel> paneles) {
        this.paneles = paneles;
    }

    public ArrayList<Seguro> getSeguros() {
        return seguros;
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    
}
