/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Paquete1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos para la entidad hospitalaria
        System.out.print("Ingrese el nombre del hospital: ");
        String nombreHospital = scanner.nextLine();
        System.out.print("Ingrese la ciudad del hospital: ");
        String nombreCiudad = scanner.nextLine();
        System.out.print("Ingrese la provincia de la ciudad: ");
        String provinciaCiudad = scanner.nextLine();
        System.out.print("Ingrese el número de especialidades: ");
        int numEspecialidades = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Creación de objetos
        Ciudad ciudad = new Ciudad(nombreCiudad, provinciaCiudad);
        EntidadHospi hospital = new EntidadHospi(nombreHospi, ciudad, numEspecialidades);

        // Ingreso de datos para médicos
        System.out.println("Ingreso de médicos:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre del médico " + (i + 1) + ": ");
            String nombreMedico = scanner.nextLine();
            System.out.print("Ingrese la especialidad del médico " + (i + 1) + ": ");
            String especialidadMedico = scanner.nextLine();
            System.out.print("Ingrese el sueldo mensual del médico " + (i + 1) + ": ");
            double sueldoMedico = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            Medico medico = new Medico(nombreMedico, especialidadMedico, sueldoMedico);
            hospital.agregarMedico(medico);
        }

        // Ingreso de datos para enfermeros(as)
        System.out.println("Ingreso de enfermeros(as):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el nombre del enfermero(a) " + (i + 1) + ": ");
            String nombreEnfermero = scanner.nextLine();
            System.out.print("Ingrese el tipo del enfermero(a) " + (i + 1) + ": ");
            String tipoEnfermero = scanner.nextLine();
            System.out.print("Ingrese el sueldo mensual del enfermero(a) " + (i + 1) + ": ");
            double sueldoEnfermero = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            Enfermero enfermero = new Enfermero(nombreEnfermero, tipoEnfermero, sueldoEnfermero);
            hospital.agregarEnfermero(enfermero);
        }

        scanner.close();

        // Imprimir el objeto entidad hospitalaria
        System.out.println(hospital.toString());
    }
}


    

