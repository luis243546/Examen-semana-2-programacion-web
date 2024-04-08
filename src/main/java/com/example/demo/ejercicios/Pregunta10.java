package com.example.demo.ejercicios;

import java.util.Scanner;

public class Pregunta10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = scanner.nextInt();

        int minutos = segundos / 60;
        int horas = minutos / 60;

        int segundosRestantesMinutos = (segundos % 60);

        int segundosRestantesHoras = 3600 - segundos;

        System.out.println("Minutos: " + minutos);
        System.out.println("Horas: " + horas);
        System.out.println("Segundos restantes para completar los minutos: " + segundosRestantesMinutos);
        System.out.println("Segundos restantes para completar las horas: " + segundosRestantesHoras);

        scanner.close();

    }
}
