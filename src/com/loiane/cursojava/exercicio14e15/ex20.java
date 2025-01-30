package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        double[] nota = new double[3];

        Scanner scan = new Scanner(System.in);

        double total = 0;
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota do " + (i+1) + "° Bimestre: ");
            nota[i] = scan.nextDouble();

            total += nota[i];
        }

        double media = total / 3;
        String mensagem;
        if (media == 10) {
            mensagem = "APROVADO COM DISTINÇÃO!";
        } else if(media < 10 && media >= 7 ) {
            mensagem = "APROVADO!";
        } else {
            mensagem = "REPROVADO!";
        }

        System.out.println("Média: " + media + " " + mensagem);
    }
}
