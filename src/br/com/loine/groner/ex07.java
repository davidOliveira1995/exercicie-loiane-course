package br.com.loine.groner;

import java.util.Scanner;

// Faça um programa que calcule a área de um quadrado, em seguida mostre
// o dobro dessa área para o usuário.
public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double lado;
        double area;

        System.out.printf("Digite o lado do quadrado: ");
        lado = scan.nextDouble();

        area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area + " M².");
        System.out.println("O dobro da área é: " + (area*2) + " M².");

        scan.close();
    }
}
