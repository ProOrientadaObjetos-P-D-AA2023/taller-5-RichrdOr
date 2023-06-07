/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author Usuario
 */
class Ciudad {
    private String nombre;
    private String provincia;

    public Ciudad(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Ciudad: " + nombre + "\nProvincia: " + provincia;
    }
}