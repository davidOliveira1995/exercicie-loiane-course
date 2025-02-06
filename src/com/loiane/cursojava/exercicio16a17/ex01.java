package com.loiane.cursojava.exercicio16a17;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        int numero = 0;

        Scanner scan = new Scanner(System.in);

        do  {
            System.out.println("Digite um número de 0 a 10: ");
            numero = scan.nextInt();

            if (numero >= 0 && numero <= 10) {
                System.out.println("Número: " + numero);
            } else {
                System.out.println("Número Inválido, digite novamente.");
            }
        } while (numero < 0 || numero > 10);
        scan.close();
    }
}
