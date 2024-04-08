package com.example.demo.ejercicios;

import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingresa 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int menor = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número menor es: " + menor);

        scanner.close();

    }
}
