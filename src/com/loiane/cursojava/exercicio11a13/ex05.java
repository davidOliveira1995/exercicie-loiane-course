package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

// Faça um programa que converta metros para centimetros
public class ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int metros = 0;

        System.out.printf("Digite o valor em metros a ser convertido: ");
        metros =  scan.nextInt();

        int convertidoEmCentimetros = metros * 100;

        System.out.printf(metros + " Metros, convertido é igual a, "
                + convertidoEmCentimetros + " Centimetros.");

    }
}
