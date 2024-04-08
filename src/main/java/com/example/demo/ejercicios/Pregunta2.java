package com.example.demo.ejercicios;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de kilos de azúcar: ");
        int totalKilos = scanner.nextInt();

        int precioPorKilo;
        if (totalKilos < 100) {
            precioPorKilo = 5;
        } else {
            precioPorKilo = 4;
        }

        int totalAPagar = totalKilos * precioPorKilo;

        System.out.println("El total a pagar es: " + totalAPagar + " soles.");

        scanner.close();

    }

}
