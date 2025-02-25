package com.loiane.cursojava.exercicio16a17;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite a tabuada que você gostaria de ver!");
        numero = scan.nextInt();

        System.out.println("-- Tabuada de " + numero + " --");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scan.close();
    }
}
