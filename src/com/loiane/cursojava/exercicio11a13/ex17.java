package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double areaTotal;
        double litrosNecessarios;
        double lataDeDezoito = 80;
        double lataDeTresEMeio = 25;
        double necessidadeLataDeDezoito;
        double necessidadeLataTresEMeio;
        double custoTotalOpcaoUm;
        double custoTotalOpcaoDois;

        System.out.println("Digite a área total a ser pintada: ");
        areaTotal = scan.nextDouble();

        litrosNecessarios = areaTotal / 6;

        System.out.println("Litros necessários: " + litrosNecessarios);

        System.out.println();

        necessidadeLataDeDezoito = Math.ceil(litrosNecessarios / 18);
        necessidadeLataTresEMeio = Math.ceil(litrosNecessarios / 3.6);

        custoTotalOpcaoUm = necessidadeLataDeDezoito * lataDeDezoito;
        custoTotalOpcaoDois = necessidadeLataTresEMeio * lataDeTresEMeio;

        System.out.println("Se pintar a casa com Lata de 18 litros, vai gastar: R$ " + custoTotalOpcaoUm +
                " um total de " + necessidadeLataDeDezoito + " Galões.");

        System.out.println("Se pintar a casa com Lata de 3,6 litros, vai gastar: R$ " + custoTotalOpcaoDois +
                " um total de " + necessidadeLataTresEMeio + " Galões.");

    }
}
