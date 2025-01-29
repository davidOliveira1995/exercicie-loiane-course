package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        double ladoA;
        double ladoB;
        double ladoC;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Lado A: ");
        ladoA = scan.nextInt();

        System.out.println("Digite o Lado B: ");
        ladoB = scan.nextInt();

        System.out.println("Digite o Lado C: ");
        ladoC = scan.nextDouble();

        //Verifica se os valores podem formar um triângulo válido
        if (ehTrianguloValido(ladoA, ladoB, ladoA)) {
            String tipo = determinarTipoTriangulo(ladoA, ladoB, ladoC);
            System.out.println("O triângulo é: " + tipo);
        } else {
            System.out.println("Os valores informados não formam um triângulo válido");
        }

        scan.close();
        
    }

    // metodo para verificar se os lados formam um triângulo válido
    private static boolean ehTrianguloValido(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // metodo para determinar o tipo de triângulo
    private static String determinarTipoTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilátero - todos os lados são iguais";
        } else if (a == b || a == c || b == c) {
            return "Isósceles - dois lados são iguais";
        } else {
            return "Escaleno - todos os lados são diferentes";
        }
    }
}
