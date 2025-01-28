package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double primeiraNota;
        double segundaNota;
        double media;

        System.out.println("Digite a primeira nota: ");
        primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundaNota = scan.nextDouble();

        media = (primeiraNota + segundaNota) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção! Média: " + media);
        } else if(media >= 7 && media < 10) {
            System.out.println("Aprovado! Média: " + media);
        } else {
            System.out.println("Reprovado! Média: " + media);
        }
    }
}
