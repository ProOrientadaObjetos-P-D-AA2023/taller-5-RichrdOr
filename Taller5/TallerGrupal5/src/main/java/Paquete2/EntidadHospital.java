/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author Usuario
 */
public class EntidadHospital {
     private String nombreHospital;
    private Ciudad ciudad;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private double sueldoTotal;
    private String direccion;

    public EntidadHospital(String nombreHospital, Ciudad ciudad,
            int numeroEspecialidades, Medico[] medicos, Enfermero[] enfermeros,
            String direccion) {
        this.nombreHospital = nombreHospital;
        this.ciudad = ciudad;
        this.numeroEspecialidades = numeroEspecialidades;
        this.medicos = medicos;
        this.enfermeros = enfermeros;
        this.direccion = direccion;
        calcularSueldoTotal();
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public void setNumeroEspecialidades(int numeroEspecialidades) {
        this.numeroEspecialidades = numeroEspecialidades;
    }

    public Medico[] getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public Enfermero[] getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(Enfermero[] enfermeros) {
        this.enfermeros = enfermeros;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    private void calcularSueldoTotal() {
        double totalMedicos = 0;
        for (Medico medico : medicos) {
            totalMedicos += medico.getSueldoMensual();
        }

        double totalEnfermeros = 0;
        for (Enfermero enfermero : enfermeros) {
            totalEnfermeros += enfermero.getSueldoMensual();
        }

        sueldoTotal = totalMedicos + totalEnfermeros;
    }

    public String toString() {
        return "Nombre del Hospital: "+nombreHospital+ "\nCiudad: "+ciudad+
                "\nNúmero de Especialidades: "+numeroEspecialidades+
                "\nDirección: "+direccion+"\nSueldo Total a Cancelar por Mes del Personal: $"+sueldoTotal;
    }
}
