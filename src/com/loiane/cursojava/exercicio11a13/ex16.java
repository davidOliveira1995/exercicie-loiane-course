package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double areaTotal;
        double litrosNecessarios;
        double galoesNecessaios;
        double rendimentoTinta = 3;
        double custoTotal;

        System.out.println("Qual o tamanho da área a ser pintada? ");
        areaTotal = scan.nextDouble();

        litrosNecessarios = areaTotal / rendimentoTinta;

        System.out.println(litrosNecessarios);

        galoesNecessaios = Math.ceil(litrosNecessarios / 18);

        System.out.println(galoesNecessaios);

        custoTotal = galoesNecessaios * 80;

        System.out.println("Preço: R$ " + custoTotal);
    }
}
