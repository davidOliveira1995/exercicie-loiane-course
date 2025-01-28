package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        int numberThree;

        /*
         1 2 3
         1 3 2
         2 3 1
         2 1 3
         3 1 2
         3 2 1

         */

        System.out.println("Número um: ");
        numberOne = scan.nextInt();

        System.out.println("Número dois: ");
        numberTwo = scan.nextInt();

        System.out.println("Número três: ");
        numberThree = scan.nextInt();


    }
}
