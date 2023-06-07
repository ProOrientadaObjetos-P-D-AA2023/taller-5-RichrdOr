/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author Usuario
 */
class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldoMensual;

    public Enfermero(String nombre, String tipo, double sueldoMensual) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public String toString() {
        return "- " + nombre + " - sueldo: " + sueldoMensual + " - " + tipo;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
}

