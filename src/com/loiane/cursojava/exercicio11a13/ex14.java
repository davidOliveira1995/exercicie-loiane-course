package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double peso;
        double excesso;
        double valor;
        double multa;

        System.out.print("Digite o peso total de peixes: ");
        peso = scan.nextDouble();

        if (peso > 50) {
            excesso = peso - 50;
            multa = excesso * 4;

            System.out.println("Excesso de peso, " + excesso + "kg.");
            System.out.println("Multa a pagar: R$ " + multa);
        } else {
            System.out.println("Não a multa a ser aplicada !");
        }
    }
}
