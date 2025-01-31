package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {

        double numero;

        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        numero = scan.nextDouble();

        verificaImparPar(numero);
        verificaPositivoNegativo(numero);
        verificaInteiroDecimal(numero);

        scan.close();
    }

    // metodo verificar se é impar ou par
    public static void verificaImparPar(double numero) {
        if(numero % 1 != 0) {
            System.out.printf("O número %.1f é decimal, portanto não pode ser " +
                    "par ou impar!%n", numero);
        } else if((int) numero % 2 == 0) {
            System.out.printf("O número %.0f é Par!%n", numero);
        } else {
            System.out.printf("O número %.1f é Ímpar!%n", numero);
        }
    }

    // metodo verificar se é positivo ou negativo
    public static void verificaPositivoNegativo(double numero) {
        if (numero > 0) {
            System.out.printf("O número %.1f é positivo!%n", numero);
        } else {
            System.out.printf("O número %.1f é negativo!%n", numero);
        }
    }

    // metodo verificar se é inteiro ou decimal
    public static void verificaInteiroDecimal(double numero) {
        if (numero % 1 == 0) {
            System.out.printf("O número %.0f é inteiro!", numero);
        } else {
            System.out.printf("O número %.1f é Decimal!", numero);
        }
    }
}
