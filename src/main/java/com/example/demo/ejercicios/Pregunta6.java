package com.example.demo.ejercicios;

import java.util.Scanner;

public class Pregunta6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las notas de los tres estudiantes:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        System.out.println("Resultados:");
        System.out.println("Estudiante 1: " + (nota1 >= 10.5 ? "Aprobado" : "Desaprobado"));
        System.out.println("Estudiante 2: " + (nota2 >= 10.5 ? "Aprobado" : "Desaprobado"));
        System.out.println("Estudiante 3: " + (nota3 >= 10.5 ? "Aprobado" : "Desaprobado"));

        scanner.close();

    }
}
