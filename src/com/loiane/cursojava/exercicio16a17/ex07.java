package com.loiane.cursojava.exercicio16a17;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];
        int maior = Integer.MIN_VALUE; // Inicializa com o menor número

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scan.nextInt();

            System.out.println("Número: " + (i+1) + " é " + numeros[i]);

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

        }
        System.out.println("O maior número é " + maior);

    }
}
