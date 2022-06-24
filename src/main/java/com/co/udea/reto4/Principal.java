/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto4;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Principal {

    static Scanner lectura = new Scanner(System.in);
    static Panel p;
    static Venta v;
    static Seguro s;
    static Empresa gestion = new Empresa();

    public static void main(String[] args) {

        String res;

        menu:
        while (true) {
            System.out.println("Elija una opcion asi:\n");
            System.out.println("1-Agregar Panel");
            System.out.println("2-Agregar Venta");
            System.out.println("3-Agregar Seguro");
            System.out.println("4-Ver paneles");
            System.out.println("5-Ver Ventas");
            System.out.println("6-Ver Seguros");
            System.out.println("7-Salir");

            res = lectura.nextLine();

            switch (res) {
                case "1" -> {
                    agregarPanel();
                }
                case "2" -> {
                    agregarVenta();
                }
                case "3" ->
                    agregarSeguro();
                case "4" -> {
                    if (gestion.getPaneles().isEmpty()) {
                        System.out.println("Aún no hay paneles...");
                    } else {
                        for (Panel panel : gestion.getPaneles()) {
                            System.out.println(panel);
                        }
                    }

                }
                case "5" -> {
                    if (gestion.getVentas().isEmpty()) {
                        System.out.println("Aún no hay ventas...");
                    } else {
                        for (Venta venta : gestion.getVentas()) {
                            System.out.println(venta);
                        }
                    }

                }
                case "6" -> {
                    if (gestion.getSeguros().isEmpty()) {
                        System.out.println("Aún no hay seguros...");
                    } else {
                        for (Seguro seguro : gestion.getSeguros()) {
                            System.out.println(seguro);
                        }
                    }
                }
                case "7" -> {
                    System.out.println("Salida exitosa");
                    break menu;
                }
                default ->
                    System.out.println("Opcion incorrecta, vuelva a intentarlo");
            }
        }
    }

    public static String seleccionarTipo() {
        String op;
        while (true) {
            System.out.println("Seleccione el tipo así:");
            System.out.println("1-monocristalino");
            System.out.println("2-policristalino");
            System.out.println("3-película delgada");
            System.out.println("4-CVP");
            op = lectura.nextLine();

            switch (op) {
                case "1" -> {
                    return "monocristalino";
                }
                case "2" -> {
                    return "policristalino";
                }
                case "3" -> {
                    return "pelicula delgada";
                }
                case "4" -> {
                    return "CVP";
                }
                default -> {
                    System.out.println("Opción incorrecta, vuelva a intentarlo");
                }
            }
        }
    }

    public static void agregarPanel() {
        String descripcion, tipo, modelo, res;
        int anio;
        double precio;
        System.out.println("Ingrese la siguiente información");
        System.out.println("nombre del modelo:");
        modelo = lectura.nextLine();
        tipo = seleccionarTipo();
        System.out.println(tipo);
        System.out.println("Año de fabricación:");
        anio = lectura.nextInt();
        System.out.println("Precio de venta:");
        precio = lectura.nextDouble();
        lectura.nextLine();
        System.out.println("Breve descripción del panel:");
        descripcion = lectura.nextLine();
        p = new Panel(descripcion, tipo, modelo, anio, precio);
        System.out.println("¿El panel tiene identificador de serie?");
        System.out.println("Responda:\n 1-Si\n 2-no");
        res = lectura.nextLine();
        if (res.equals("1")) {
            System.out.println("Ingrese la serie");
            String serie = lectura.nextLine();
            p.setSerie(serie);
        }
        gestion.getPaneles().add(p);
        System.out.println("Panel agregado exitosamente");
    }

    public static void agregarVenta() {
        int id;
        String fecha, tp, nd, cliente, descripcion;
        System.out.println("Ingrese la siguiente información:");
        System.out.println("Identificador (id) del panel:");
        id = lectura.nextInt();
        lectura.nextLine();
        p = gestion.buscarPanel(id);
        if (p != null) {
            System.out.println("Fecha y hora de la venta en el formato: yyyy-MM-dd HH:mm");
            fecha = lectura.nextLine();
            System.out.println("Tipo de documento del cliente");
            tp = lectura.nextLine();
            System.out.println("Número de documento del cliente");
            nd = lectura.nextLine();
            System.out.println("Nombre completo del cliente");
            cliente = lectura.nextLine();
            System.out.println("Descripcion breve del uso que se le dará al panel");
            descripcion = lectura.nextLine();
            v = new Venta(tp, nd, fecha, cliente, p.getPrecio(), descripcion, p);
            gestion.getVentas().add(v);
            System.out.println("Venta realizada con éxito");
        } else {
            System.out.println("El panel no existe");

        }
    }

    public static void agregarSeguro() {
        int id;
        String empresa, descripcion, fechaIn, fechaFin;

        System.out.println("Ingrese la siguiente información");
        System.out.println("Identificador (id) del panel");
        id = lectura.nextInt();
        lectura.nextLine();
        p = gestion.buscarPanel(id);
        if (p != null) {
            System.out.println("Nombre de la empresa");
            empresa = lectura.nextLine();
            System.out.println("Fecha de inicio de cobertura del servicio en el formato: yyyy-MM-dd");
            fechaIn = lectura.nextLine();
            System.out.println("Fecha de finalización de cobertura del servicio en el formato: yyyy-MM-dd");
            fechaFin = lectura.nextLine();
            System.out.println("Descripción breve del seguro");
            descripcion = lectura.nextLine();
            s = new Seguro(empresa, descripcion, fechaIn, fechaFin, p);
            gestion.getSeguros().add(s);
            System.out.println("Seguro creado con éxito");
        } else {
            System.out.println("El panel no existe");
        }

    }
}
