/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author Usuario
 */
public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldoMensual;

    public Enfermero(String nombre, String tipo, double sueldoMensual) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    public String toString() {
        return "Enfermero/a: " + nombre + ", Tipo: " + tipo + ", Sueldo Mensual: " + sueldoMensual;
    }
}
