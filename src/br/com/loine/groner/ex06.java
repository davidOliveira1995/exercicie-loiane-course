package br.com.loine.groner;

import java.util.Scanner;

// Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double area;
        double raio;

        System.out.printf("Valor do raio: ");
        raio = scan.nextDouble();

        area = Math.PI * Math.pow(raio,2);

        System.out.println("A área do Circulo é: " + area + " cm².");

        scan.close();
    }
}
