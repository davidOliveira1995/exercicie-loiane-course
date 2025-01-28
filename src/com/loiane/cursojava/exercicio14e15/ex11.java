package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        double salarioColaborador;
        double reajuste;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do Salário: R$ ");
        salarioColaborador = scan.nextDouble();
        reajuste = 0;
        if (salarioColaborador < 2800) {
            reajuste = salarioColaborador * 1.2;
        } else if(salarioColaborador >= 2800 && salarioColaborador < 7000) {
            reajuste = salarioColaborador * 1.15;
        } else if (salarioColaborador >= 7000 && salarioColaborador < 15000) {
            reajuste = salarioColaborador * 1.10;
        } else {
            reajuste = salarioColaborador * 1.05;
        }

        System.out.println("Salário antigo: R$ " + salarioColaborador +
                " Salário após reajuste: R$ " + reajuste);
    }
}
