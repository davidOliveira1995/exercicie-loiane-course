package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        String turno;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno que você estuda!");
        System.out.println("M - Matutino!");
        System.out.println("V - Vespertino!");
        System.out.println("N - Noturno!");

        System.out.println("Resposta: ");
        turno = scan.next();

        switch (turno) {
            case "m":
            case "M":
                System.out.println("Bom dia!");
                break;
            case "v":
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "n":
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Inválido, insira novamente!");
        }

        scan.close();
    }
}
