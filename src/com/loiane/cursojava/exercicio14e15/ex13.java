package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] diaSemana = new String[7];
        diaSemana[0] = "Segunda-feira";
        diaSemana[1] = "Terça-feira";
        diaSemana[2] = "Quarta-feira";
        diaSemana[3] = "Quinta-feira";
        diaSemana[4] = "Sexta-feira";
        diaSemana[5] = "Sábado";
        diaSemana[6] = "Domingo";

        int diaSelecionado;
        System.out.println("Digite um número de 0 a 6: ");
        diaSelecionado = scan.nextInt();

        if (diaSelecionado >= 0 && diaSelecionado <= 6) {
            System.out.println(diaSemana[diaSelecionado]);
        } else {
            System.out.println("Erro! Digite um valor entre 0 e 6");
        }

        scan.close();
    }
}
