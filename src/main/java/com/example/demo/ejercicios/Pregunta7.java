package com.example.demo.ejercicios;

import java.util.Scanner;

public class Pregunta7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombreMayor = "";
        double sueldoMayor = Double.MIN_VALUE;

        System.out.println("Ingrese el nombre y el sueldo de 5 trabajadores:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del trabajador " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Sueldo del trabajador " + (i + 1) + ": ");
            double sueldo = scanner.nextDouble();
            scanner.nextLine();

            if (sueldo > sueldoMayor) {
                sueldoMayor = sueldo;
                nombreMayor = nombre;
            }
        }

        System.out.println("El trabajador con el sueldo más alto es: " + nombreMayor);
        System.out.println("Su sueldo es: " + sueldoMayor);

        scanner.close();

    }
}
