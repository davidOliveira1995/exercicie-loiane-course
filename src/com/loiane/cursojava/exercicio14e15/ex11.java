package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        double salarioColaborador;
        double salarioComReajuste = 0;
        double reajuste = 0;
        String percentual;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do Salário: R$ ");
        salarioColaborador = scan.nextDouble();

        if (salarioColaborador < 2800) {
            salarioComReajuste = salarioColaborador * 1.2;
            percentual = "20%";
        } else if(salarioColaborador >= 2800 && salarioColaborador < 7000) {
            salarioComReajuste = salarioColaborador * 1.15;
            percentual = "15%";
        } else if (salarioColaborador >= 7000 && salarioColaborador < 15000) {
            salarioComReajuste = salarioColaborador * 1.10;
            percentual = "10%";
        } else {
            salarioComReajuste = salarioColaborador * 1.05;
            percentual = "5%";
        }

        reajuste = salarioComReajuste - salarioColaborador;

        System.out.println("Salário antigo: R$ " + salarioColaborador);
        System.out.println("Salário após reajuste: R$ " + salarioComReajuste);
        System.out.println("Reajuste: R$ " + reajuste);
        System.out.println("Percentual: " + percentual);
    }
}
