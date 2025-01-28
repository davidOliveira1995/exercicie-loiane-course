package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOne;
        int numberTwo;

        System.out.print("Digite um número: ");
        numberOne = scan.nextInt();

        System.out.println(); // Pula Linha

        System.out.print("Digite o segundo número: ");
        numberTwo = scan.nextInt();

        if (numberOne > numberTwo) {
            System.out.println(numberOne + " é maior que " + numberTwo);
        } else {
            System.out.println(numberTwo + " é maior que " + numberOne);
        }
    }
}
