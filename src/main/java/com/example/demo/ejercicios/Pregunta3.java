package com.example.demo.ejercicios;

import java.util.Scanner;

public class Pregunta3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVendido = 0;

        double ventas[] = new double[10];

        System.out.println("Ingrese el monto de las 10 ventas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Venta " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }

        System.out.println("Ventas menores a 100 soles:");
        for (int i = 0; i < 10; i++) {
            if (ventas[i] < 100) {
                System.out.println("Venta " + (i + 1) + ": " + ventas[i] + " soles");
            }
            totalVendido += ventas[i];
        }

        System.out.println("Total vendido: " + totalVendido + " soles");

        scanner.close();

    }
}
