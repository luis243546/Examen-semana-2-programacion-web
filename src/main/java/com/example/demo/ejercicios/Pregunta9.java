package com.example.demo.ejercicios;

import java.util.Scanner;

public class Pregunta9 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String nombreMenor = "";
            int edadMenor = Integer.MAX_VALUE;

            System.out.println("Ingrese el nombre y edad de las 5 personas");

            for (int i = 0; i < 5; i++) {
                System.out.println("Nombre de la persona " + (i + 1) + ":");
                String nombre = sc.next();
                sc.nextLine();

                System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
                int edad = sc.nextInt();
                sc.nextLine();

                if (edad < edadMenor) {
                    edadMenor = edad;
                    nombreMenor = nombre;
                }
            }

            System.out.println("La persona mas joven es: " + nombreMenor);
            System.out.println("su edad es: " + edadMenor);
        }

    }
}
