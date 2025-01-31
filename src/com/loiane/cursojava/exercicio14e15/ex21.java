package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {

        int valor;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do saque: R$");
        valor = scan.nextInt();

        if (valorSaque(valor)) {
            calculadoraDeNotas(valor);
        } else {
            System.out.println("O caixa só aceita valor entre R$ 10,00 e R$ 600,00");
        }

        scan.close();
    }

    // metodo para verificar valor a ser sacado
    public static boolean valorSaque(int valor) {
        if (valor >= 10 && valor <= 600) {
            return true;
        } else {
            return false;
        }
    }


    // metodo para calcular quantidade de notas;
    public static void calculadoraDeNotas(int valor) {
        int cem;
        int cinquenta;
        int dez;
        int cinco;
        int um;

        cem = valor / 100;
        valor %= 100; // atualiza o valor restante

        cinquenta = valor / 50;
        valor %= 50;

        dez = valor / 10;
        valor %= 10;

        cinco = valor / 5;
        valor %= 5;

        um = valor;

        System.out.println("Notas de cem: " + cem);
        System.out.println("Notas de cinquenta: " + cinquenta);
        System.out.println("Notas de dez: " + dez);
        System.out.println("Notas de cinco: " + cinco);
        System.out.println("Notas de um: " + um);
    }
}
