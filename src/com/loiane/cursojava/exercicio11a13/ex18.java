package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tamanhoArquivo;
        double velocidadeInternet;
        double resultado;

        System.out.println("Digite o tamanho do Arquivo a ser baixado: ");
        tamanhoArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade da Interner: ");
        velocidadeInternet = scan.nextDouble();

        resultado = (tamanhoArquivo * 8) / velocidadeInternet;

        System.out.println("tempo do download " + resultado);
    }
}
