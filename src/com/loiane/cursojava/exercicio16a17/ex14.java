package com.loiane.cursojava.exercicio16a17;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[10];

        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + "° número: ");
            numeros[i] = scan.nextInt();

            total += numeros[i];
        }
        System.out.println(total);

        for (int i = total; i > 0; i--) {

            if (i % 2 == 0) {
                System.out.println("O número " + i + " é PAR!");
            } else {
                System.out.println("O número " + i + " é IMPAR!");
            }
        }
    }
}
