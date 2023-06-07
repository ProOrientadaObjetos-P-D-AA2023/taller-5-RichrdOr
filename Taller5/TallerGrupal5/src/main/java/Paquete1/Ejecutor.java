/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Paquete1;

import Paquete2.Ciudad;
import Paquete2.Enfermero;
import Paquete2.EntidadHospital;
import Paquete2.Medico;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del hospital: ");
        
        String nombreHospital = entrada.nextLine();

        System.out.println("Ingrese el nombre de la ciudad: ");
        
        String nombreCiudad = entrada.nextLine();

        System.out.println("Ingrese la provincia de la ciudad: ");
        String provinciaCiudad = entrada.nextLine();

        System.out.println("Ingrese el número de especialidades: ");
        
        int numeroEspecialidades = entrada.nextInt();
        entrada.nextLine();  

        System.out.println("Ingrese la dirección del hospital: ");
        
        String direccionHospital = entrada.nextLine();

        System.out.println("Ingrese la cantidad de médicos: ");
        
        int cantidadMedicos = entrada.nextInt();
        
        entrada.nextLine();  

        Medico[] medicos = new Medico[cantidadMedicos];
        
        for (int i = 0; i < cantidadMedicos; i++) {
            
            System.out.println("Ingrese el nombre del médico " + (i + 1) + ": ");
            
            String nombreMedico = entrada.nextLine();

            System.out.println("Ingrese la especialidad del médico " + (i + 1) + ": ");
            
            String especialidadMedico = entrada.nextLine();

            System.out.println("Ingrese el sueldo mensual del médico " + (i + 1) + ": ");
            
            double sueldoMedico = entrada.nextDouble();
            
            entrada.nextLine();  

            medicos[i] = new Medico(nombreMedico, especialidadMedico, sueldoMedico);
        }

        System.out.print("Ingrese la cantidad de enfermeros/as: ");
        
        int cantidadEnfermeros = entrada.nextInt();
        
        entrada.nextLine();  

        Enfermero[] enfermeros = new Enfermero[cantidadEnfermeros];
        
        for (int i = 0; i < cantidadEnfermeros; i++) {
            
            System.out.println("Ingrese el nombre del enfermero: " + (i + 1) + ": ");
            
            String nombreEnfermero = entrada.nextLine();

            System.out.println("Ingrese el tipo del enfermero: " + (i + 1) + ": ");
            
            String tipoEnfermero = entrada.nextLine();

            System.out.println("Ingrese el sueldo mensual del enfermero: " + (i + 1) + ": ");
            
            double sueldoEnfermero = entrada.nextDouble();
            
            entrada.nextLine(); 

            enfermeros[i] = new Enfermero(nombreEnfermero, tipoEnfermero, sueldoEnfermero);
        }

        Ciudad ciudad = new Ciudad(nombreCiudad, provinciaCiudad);
        
        EntidadHospital entidadHospitalaria = new EntidadHospital(nombreHospital, ciudad, numeroEspecialidades, medicos, enfermeros, direccionHospital);
        
        
        System.out.println(entidadHospitalaria.toString());
    }
}
