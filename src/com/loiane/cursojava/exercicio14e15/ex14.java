package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        double primeiraNota;
        double segundaNota;
        double media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundaNota = scan.nextDouble();

        media = (primeiraNota + segundaNota) / 2;

        String conceito;

        // Calcular o Conceito
        if (media < 4) {
            conceito = "E";
        } else if(media >= 4 && media < 6) {
            conceito = "D";
        } else if(media >= 6 && media < 7.5) {
            conceito = "C";
        } else if(media >= 7.5 && media < 9) {
            conceito = "B";
        } else {
            conceito = "A";
        }

        String resultado = "";

        switch (conceito) {
            case "A":
            case "B":
            case "C":
                resultado = "APROVADO";
                break;
            case "D":
            case "E":
                resultado = "REPROVADO";
                break;
            default:
        }

        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Resultado: " + resultado);
    }
}
