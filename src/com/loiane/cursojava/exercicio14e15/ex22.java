package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {

        int numero;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = scan.nextInt();

        verificaNumero(numero);

        scan.close();
    }

    // metodo verifica se é impar ou par
    public static void verificaNumero(int numero) {
        String mensagem;
        if (numero % 2 == 0) {
            mensagem = numero + " é Par!";
        } else {
            mensagem = numero + " é Ímpar!";
        }
        System.out.printf(mensagem);
    }
}
