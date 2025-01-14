package br.com.loine.groner;

import java.util.Scanner;

// Faça um programa que peça as 4 notas bimestrais e mostre a média
public class ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notasBimestrais = new double[4];

        System.out.println("----- Calculadora de Nota Bimestral ----");

        double total = 0;
        for (int i = 0; i < notasBimestrais.length; i++) {
            System.out.print("Digite a note do " + (i+1) + "° Bimestre: ");
            notasBimestrais[i] = scan.nextDouble();

            total += notasBimestrais[i];
        }

        double media = total / 4;
        System.out.println("A nota total é: " + total);
        System.out.println("A média é: " + media);
    }
}
