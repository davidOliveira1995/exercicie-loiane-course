package com.loiane.cursojava.exercicio16a17;

public class ex04 {
    public static void main(String[] args) {

        double populacaoA = 10;
        double populacaoB = 2000000000;

        calcularCrescimentoPopulacional(populacaoA, populacaoB);
    }

    // calcular crescimento da população
    public static void calcularCrescimentoPopulacional(double populacaoA, double populacaoB) {
        for (int i = 1; populacaoA <= populacaoB; i++) {
            populacaoA = populacaoA  * 1.03;
            populacaoB = populacaoB * 1.015;

            System.out.printf("%nAno: %d", i);
            System.out.printf("%nPopulação A: %.0f", populacaoA);
            System.out.printf("%nPopulação B: %.0f", populacaoB);
        }

    }
}
