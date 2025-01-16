package br.com.loine.groner;

import java.util.Scanner;

// Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus
// Farenheit
public class ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double farenheit;
        double celsius;

        System.out.printf("Digite a temperatura em Celsius: ");
        celsius = scan.nextDouble();

        farenheit = ((celsius * 9) / 5) + 32;

        System.out.println(); // Pula Linha

        System.out.printf("Farenheit: " + farenheit + "F° \nCelcius: " + celsius + "C°");

        scan.close();
    }
}
