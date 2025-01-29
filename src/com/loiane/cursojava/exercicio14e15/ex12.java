package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        double salarioBruto;
        double impostoDeRenda;
        double sindicato;
        double inss;
        double fgts;
        double descontos;
        double salarioLiquido;
        double valorHora;
        int horasTrabalhadaMes;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que você recebe por hora: R$ ");
        valorHora = scan.nextDouble();

        System.out.println("Digite o total de horas trabalhadas no mês: ");
        horasTrabalhadaMes = scan.nextInt();

        salarioBruto = horasTrabalhadaMes * valorHora;

        // calculo do imposto de renda
        if(salarioBruto > 900 && salarioBruto <= 1500) {
            impostoDeRenda = salarioBruto * 0.05;
        } else if(salarioBruto > 1500 && salarioBruto <= 2500) {
            impostoDeRenda = salarioBruto * 0.10;
        } else if(salarioBruto > 2500) {
            impostoDeRenda = salarioBruto * 0.20;
        } else {
            impostoDeRenda = 0;
        }

        sindicato = salarioBruto * 0.03;
        fgts = salarioBruto * 0.11;
        inss = salarioBruto * 0.10;

        descontos = impostoDeRenda + sindicato + inss;
        salarioLiquido = salarioBruto - descontos;

        System.out.println("Sálario Bruto: R$ " + salarioBruto);
        System.out.println("---------- Taxas -----------");
        System.out.println("Imposto de Renda: R$ " + impostoDeRenda);
        System.out.println("INSS: R$ " + inss);
        System.out.println("Sindicato: R$ " + sindicato);
        System.out.println("Total descontos: R$ " + descontos);
        System.out.println();
        System.out.println("FGTS: R$ " + fgts);
        System.out.println("Sálario Liquido: R$ " + salarioLiquido);
    }
}
