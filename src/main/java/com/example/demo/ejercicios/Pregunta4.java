package com.example.demo.ejercicios;

import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int multiplicacion = 1;

        System.out.println("Ingrese números negativos (para finalizar, ingrese un número positivo):");

        while (true) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero >= 0) {
                break;
            }

            multiplicacion = multiplicacion * numero;
        }

        System.out.println("La multiplicación de los números negativos ingresados es: " + multiplicacion);

        scanner.close();

    }

}
