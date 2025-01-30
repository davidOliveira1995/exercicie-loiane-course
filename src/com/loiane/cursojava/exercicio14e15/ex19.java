package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {

        int numero;

        Scanner scan = new Scanner(System.in);

        // Solicita o número para verificação
        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        // chamada do metodo verificar numero
        verificaNumero(numero);
    }

    // Metodo verifica quantas unidades tem o numero
    public static void verificaNumero(int numero) {
        int centena;
        int dezena;
        int unidade;

        centena = numero / 100;

        dezena = (numero % 100) / 10;

        unidade = numero % 10;

        System.out.println("O número " + numero + " tem.");
        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);

    }
}
