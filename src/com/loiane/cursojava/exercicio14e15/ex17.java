package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

        int ano;


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        ano = scan.nextInt();

        calcularAnoBissexto(ano);
    }

    public static void calcularAnoBissexto(int ano) {

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("O " + ano + " é Bissexto!");
        } else {
            System.out.println("Não é Bissexto!");
        }

    }
}
