package br.com.loine.groner;

import java.util.Scanner;

// Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas
// no mês. Calcule e mostre o total do seu salário no referido mês.
public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salarioHora;
        double salarioBruto;
        int horasTrabalhadasNoMes;

        System.out.printf("Digite o valor do seu salário por hora: ");
        salarioHora = scan.nextDouble();

        System.out.println(); // Pular Linha

        System.out.printf("Digite quantas horas você trabalhou no mês: ");
        horasTrabalhadasNoMes = scan.nextInt();

        salarioBruto = horasTrabalhadasNoMes * salarioHora;

        System.out.printf("Salário: R$ " + salarioBruto);

        scan.close();

    }
}
