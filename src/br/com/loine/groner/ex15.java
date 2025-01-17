package br.com.loine.groner;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int horasTrabalhadas;
        double valorHora;

        System.out.print("Digite quantas horas você trabalhou esse mês: ");
        horasTrabalhadas = scan.nextInt();

        System.out.print("Digite o valor que você ganha por hora: R$ ");
        valorHora = scan.nextDouble();

        double salarioBruto;
        double impostoRenda;
        double inss;
        double sindicato;
        double totalDespesas;
        double salarioLiquido;

        salarioBruto = horasTrabalhadas * valorHora;

        impostoRenda = (salarioBruto / 100) * 11;
        inss = (salarioBruto / 100) *  8;
        sindicato = (salarioBruto / 100) * 5;

        totalDespesas = impostoRenda + inss + sindicato;

        salarioLiquido = salarioBruto - totalDespesas;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("O imposto total é de R$ " + totalDespesas);
        System.out.println("Salário Liquido: R$ " + salarioLiquido);

        scan.close();
    }
}
