package com.loiane.cursojava.exercicio14e15;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {

        int pesoMaca;
        int pesoMorango;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos kilos de Maça?");
        pesoMaca = scan.nextInt();

        System.out.println("Quantos kilos de Morango?");
        pesoMorango = scan.nextInt();

        int pesoTotal = pesoMaca + pesoMorango;

        double precoMaca = calcularMaca(pesoMaca);
        double precoMorango = calcularMorango(pesoMorango);

        double precoTotal = precoMaca + precoMorango;

        verificarDesconto(pesoTotal, precoTotal);

        scan.close();
    }

    // Metodo calcular preço da MAÇÃ
    public static double calcularMaca(int pesoMaca) {
        double precoMaca = (pesoMaca <= 5) ? pesoMaca * 1.80 : pesoMaca * 1.50;
        System.out.printf("O preço total das Maçãs: R$ %.2f%n", precoMaca);
        return precoMaca;
    }

    // Metodo calcular preço do MORANGO
    public static double calcularMorango(int pesoMorango) {
        double precoMorango = (pesoMorango <= 5) ? pesoMorango * 2.50 : pesoMorango * 2.20;
        System.out.printf("O preço total dos Morangos: R$ %.2f%n", precoMorango);
        return precoMorango;
    }

    // Metodo que verifica se o peso total > 8 kg ou o preço total > R$ 25,00
    public static void verificarDesconto(int pesoTotal, double precoTotal) {
        if (pesoTotal > 8 || precoTotal > 25.00) {
            double desconto = precoTotal * 0.10; // 10% de desconto
            double precoFinal = precoTotal - desconto;

            System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
            System.out.printf("Preço final com desconto: R$ %.2f%n", precoFinal);
        } else {
            System.out.printf("Nenhum desconto aplicado. Preço final: R$ %.2f%n", precoTotal);
        }
    }
}
