package com.loiane.cursojava.exercicio16a17;
import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double base;
        double expoente;

        System.out.println("Digite o número base: ");
        base = scan.nextDouble();

        System.out.println("Digite o expoente: ");
        expoente = scan.nextDouble();

        double resultado = calculaExpoente(base, expoente);

        System.out.println("O resultado é: " + resultado);

        scan.close();
    }

    // calcula expoente
    public static double calculaExpoente(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
