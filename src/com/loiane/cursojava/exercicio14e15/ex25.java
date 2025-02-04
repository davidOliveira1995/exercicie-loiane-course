package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {

        int[] resposta = new int[5];

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite 1- Sim | 0- Não%n");

        System.out.printf("Telefonou para a vítima? ");
        resposta[0] = scan.nextInt();

        System.out.printf("Esteve no local do crime? ");
        resposta[1] = scan.nextInt();

        System.out.printf("Mora perto da vítima? ");
        resposta[2] = scan.nextInt();

        System.out.printf("Devia para a vítima? ");
        resposta[3] = scan.nextInt();

        System.out.printf("Já trabalhou com a vítima? ");
        resposta[4] = scan.nextInt();

        int total = 0;
        for (int i = 0; i < resposta.length; i++) {
            total += resposta[i];
        }

        if (total == 5) {
            System.out.printf("Assassino!%n");
        } else if(total > 2 && total < 5) {
            System.out.printf("Cúmplice!%n");
        } else if(total > 1 && total < 3) {
            System.out.printf("Suspeita!%n");
        } else {
            System.out.printf("Inocente!%n");
        }

        scan.close();
    }
}
