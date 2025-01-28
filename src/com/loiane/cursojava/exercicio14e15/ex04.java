package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra aleatória no teclado: ");
        letra = scan.next();

        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Você digitou a letra ( " + letra + " ) ela é uma vogal.");
                break;
            default:
                System.out.println("Você digitou a letra ( " + letra + " ) ela é uma consoante.");
                break;
        }
    }
}
