package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

// Faça um programa que peça um número e então mostre a mensagem "O número informado foi"
public class ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 0;

        System.out.print("Digite um número: ");
        number = scan.nextInt();

        System.out.print("O número informado foi: " + number);
    }
}
