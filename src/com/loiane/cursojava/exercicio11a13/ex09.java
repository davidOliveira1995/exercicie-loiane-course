package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

// Faça um programa que peça a temperatura em Farenheit, transforme e  mostre a temperatura
// em graus Celcius
public class ex09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double celcius;
        double farenheit;

        System.out.printf("Digite a temperatura em graus Farenheit: ");
        farenheit = scan.nextDouble();

        System.out.println(); // Pula Linha
        celcius = (5 * (farenheit - 32) / 9);

        System.out.printf("Temperatura em Farenheit: " + farenheit + "F°, temperatura" +
                " em graus Celcius: " + celcius + "C°.");

        scan.close();
    }
}
