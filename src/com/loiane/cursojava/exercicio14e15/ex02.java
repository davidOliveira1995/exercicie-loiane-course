package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Insert a number positive or negative: ");
        number = scan.nextInt();

        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if(number < 0){
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is neutro.");
        }
    }
}
