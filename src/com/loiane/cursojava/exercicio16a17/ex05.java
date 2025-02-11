package com.loiane.cursojava.exercicio16a17;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        double populacaoA;
        double populacaoB;
        double percentualA;
        double percentualB;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a população incial de A: ");
        populacaoA = scan.nextDouble();

        System.out.println("Digite a população incial de B: ");
        populacaoB = scan.nextDouble();

        System.out.println("Digite a taxa de crescimento A: ");
        percentualA = scan.nextDouble();

        System.out.println("Digite a taxa de crescimento B: ");
        percentualB = scan.nextDouble();

        calcularCrescimentoPopulacional(populacaoA, populacaoB, percentualA, percentualB);
    }

    // calcular crescimento da população
    public static void calcularCrescimentoPopulacional(double populacaoA, double populacaoB, double percentualA, double percentualB) {
        for (int i = 1; populacaoA <= populacaoB; i++) {
            populacaoA = populacaoA + (populacaoA * percentualA / 100);
            populacaoB = populacaoB + (populacaoB * percentualB / 100);

            System.out.printf("%nAno: %d", i);
            System.out.printf("%nPopulação A: %.0f", populacaoA);
            System.out.printf("%nPopulação B: %.0f", populacaoB);
        }

    }
}
