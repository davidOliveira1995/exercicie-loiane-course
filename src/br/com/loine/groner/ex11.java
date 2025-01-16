package br.com.loine.groner;

import java.util.Scanner;

// Faça um programa que peça dois números inteiros
public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        double numberThree;

        System.out.print("Digite um número inteiro: ");
        numberOne = scan.nextInt();

        pulaLinha();

        System.out.print("Digite o segundo número inteiro: ");
        numberTwo = scan.nextInt();

        pulaLinha();

        System.out.print("Digite um número ponto flutuante: ");
        numberThree = scan.nextDouble();

        pulaLinha();

        int resultadoA;
        double resultadoB;
        double resultadoC;

        resultadoA = (numberOne * 2) + (numberTwo / 2);
        resultadoB = ((numberOne * 3) + numberThree);
        resultadoC = Math.pow(numberThree, 3);

        System.out.print("A: " + resultadoA);
        pulaLinha();

        System.out.print("B: " + resultadoB);
        pulaLinha();

        System.out.print("C: " + resultadoC);
    }

    public static void pulaLinha() {
        System.out.println(); // Pula Linha
    }
}
