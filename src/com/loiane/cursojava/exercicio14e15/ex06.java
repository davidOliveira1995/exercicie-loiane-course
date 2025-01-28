package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numberOne;
        double numberTwo;
        double numberThree;

        System.out.println("Digite um número: ");
        numberOne = scan.nextDouble();

        System.out.println("Digite um número: ");
        numberTwo = scan.nextDouble();

        System.out.println("Digite um número: ");
        numberThree = scan.nextDouble();

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println(numberOne);
        } else if(numberTwo > numberThree && numberTwo > numberOne) {
            System.out.println(numberTwo);
        } else {
            System.out.println(numberThree);
        }
    }
}
