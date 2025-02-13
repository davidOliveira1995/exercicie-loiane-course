package com.loiane.cursojava.exercicio16a17;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];

        int total = 0;
        int media = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scan.nextInt();

            total += numeros[i];
            media = total / numeros.length;
        }

        System.out.println("Total: " + total);
        System.out.println("Média: " + media);
    }
}
