package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {

        double numero;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        numero = scan.nextDouble();

        verificaNumero(numero);

        scan.close();
    }

    // metodo verifica se numero é inteiro ou decimal
    public static void verificaNumero(double numero) {
        if (numero % 1 == 0) {
            System.out.printf("O número %.0f é inteiro!", numero);
        } else {
            System.out.printf("O número %.1f é Decimal!", numero);
        }
    }

}
