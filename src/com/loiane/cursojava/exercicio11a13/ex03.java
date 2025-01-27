package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

// Faça um programa que peça dois números e imprima a soma
public class ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[2];

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite o " + (i+1) + "° número: ");
            numbers[i] = scan.nextInt();

            total += numbers[i];
        }

        System.out.print("A soma é " + total);
    }
}
