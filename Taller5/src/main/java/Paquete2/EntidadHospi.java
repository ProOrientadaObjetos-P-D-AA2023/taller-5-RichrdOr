/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
class EntidadHospitalaria {
    private String nombre;
    private Ciudad ciudad;
    private int numEspecialidades;
    private ArrayList<Medico> medicos;
    private ArrayList<Enfermero> enfermeros;

    public EntidadHospitalaria(String nombre, Ciudad ciudad, int numEspecialidades) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numEspecialidades = numEspecialidades;
        medicos = new ArrayList<>();
        enfermeros = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarEnfermero(Enfermero enfermero) {
        enfermeros.add(enfermero);
    }

    public double calcularTotalSueldos() {
        double totalSueldos = 0.0;
        for (Medico medico : medicos) {
            totalSueldos += medico.sueldoMensual;
        }
        for (Enfermero enfermero : enfermeros) {
            totalSueldos += enfermero.sueldoMensual;
        }
        return totalSueldos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n");
        sb.append("Dirección: ").append(ciudad).append("\n");
        sb.append("Número de especialidades: ").append(numEspecialidades).append("\n");
        sb.append("Listado de médicos\n");
        for (Medico medico : medicos) {
            sb.append(medico.toString()).append("\n");
        }
        sb.append("Listado de enfermeros(as)\n");
        for (Enfermero enfermero : enfermeros) {
            sb.append(enfermero.toString()).append("\n");
        }
        sb.append("Total de sueldos a pagar por mes: ").append(calcularTotalSueldos());
        return sb.toString();
    }
}