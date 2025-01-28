package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word;

        System.out.println("Digite F para feminino ou M para masculino:");
        word = scan.next();

        switch (word) {
            case "f":
            case "F":
                System.out.println("Você digitou (" + word + ") -> Feminino!");
                break;
            case "m":
            case "M":
                System.out.println("Você digitou (" + word + ") -> Masculino!");
                break;
            default:
                System.out.println("Letra incorreta! Digite novamente.");
        }
    }
}
