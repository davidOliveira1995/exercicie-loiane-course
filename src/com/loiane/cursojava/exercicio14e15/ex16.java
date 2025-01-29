package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double delta;

        Scanner scan = new Scanner(System.in);

        // Inserindo os dados
        System.out.println("Digite valor de A: ");
        a = scan.nextDouble();

        System.out.println("Digite valor de B: ");
        b = scan.nextDouble();

        System.out.println("Digite valor de C: ");
        c = scan.nextDouble();

        // verificar se a equação é do segundo grau.
        if (a == 0) {
            System.out.println("A equação não é do segundo grau!");

        } else {

            // calculando e exibindo o valor de delta
            delta = calcularDelta(a, b, c);
            System.out.println("Delta: " + delta);

            // calculano e exibindo as raizes
            bhaskara(a, b, delta);
        }

        scan.close();
    }

    // metodo calculo delta
    public static double calcularDelta(double a, double b, double c) {
        return Math.pow(b,2) - (4 * a * c);
    };

    // metodo calcular formula de Bhaskara
    public static void bhaskara(double a, double b, double delta) {
      double x1 = (-b + Math.sqrt(delta)) / (2 * a);
      double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
    };
}
