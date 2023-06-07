/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author Usuario
 */
public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldoMensual;

    public Medico(String nombre, String especialidad, double sueldoMensual) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public String toString() {
        return "Médico: " + nombre + ", Especialidad: " + especialidad + ", Sueldo Mensual: " + sueldoMensual;
    }
}
