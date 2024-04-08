package com.example.demo.ejercicios;

public class Pregunta8 {
    public static void main(String[] args) {

        int pagoInicial = 100;

        int totalAPagar = 0;

        for (int mes = 1; mes <= 10; mes++) {
            totalAPagar += pagoInicial * mes;
        }

        System.out.println("El total a pagar en 10 meses es: " + totalAPagar + " soles.");

    }

}
