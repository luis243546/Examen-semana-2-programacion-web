package com.example.demo.ejercicios;

import java.util.Scanner;

public class Pregunta5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaNegativos = 0;
        double multiplicacionPositivos = 1;

        System.out.println("Ingrese 10 números positivos, negativos o decimales:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                sumaNegativos += numero;
            } else {
                multiplicacionPositivos *= numero;
            }
        }

        System.out.println("La suma de los números negativos es: " + sumaNegativos);
        System.out.println("La multiplicación de los números positivos es: " + multiplicacionPositivos);

        scanner.close();

    }
}
