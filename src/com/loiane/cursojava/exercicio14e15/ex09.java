package com.loiane.cursojava.exercicio14e15;

import java.util.Arrays;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os números
        int[] numeros = new int[3];

        // Entrada dos números
        System.out.println("Digite o primeiro número:");
        numeros[0] = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        numeros[1] = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        numeros[2] = scanner.nextInt();

        // Ordenar os números em ordem decrescente
        Arrays.sort(numeros);

        // Imprimir os números em ordem decrescente
        System.out.println("Números em ordem decrescente:");
        for (int i = 2; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();

    }
}
