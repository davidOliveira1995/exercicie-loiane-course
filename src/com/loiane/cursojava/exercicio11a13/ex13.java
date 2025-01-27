package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sexo;
        double altura;
        double peso;
        double pesoIdeal;

        System.out.print("Digite sua Altura: ");
        altura = scan.nextDouble();

        System.out.println();

        System.out.print("Digite seu peso: ");
        peso = scan.nextDouble();

        System.out.println(); // PulaLinha

        System.out.print("Digite 'M' para Masculino ou 'F' para Feminino:  ");
        sexo = scan.next();

        switch (sexo) {
            case "M":
            case "m":
                pesoIdeal = (72.7 * altura) - 58;
                System.out.print("Seu peso ideal é: " + pesoIdeal + "KG.\n");

                if (peso > pesoIdeal) {
                    System.out.println("Você está acima do Peso, " + (peso - pesoIdeal) + "KG, a mais.");
                }
                break;
            case "F":
            case "f":
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.print("O seu peso ideal é: " + pesoIdeal + "KG.\n");
                if (peso > pesoIdeal) {
                    System.out.println("Você está acima do Peso, " + (peso - pesoIdeal) + "KG, a mais.");
                }
                break;
            default:
                System.out.println("Error !!");
        }
    }
}
