package com.loiane.cursojava.exercicio14e15;

import java.util.Locale;
import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {

        int litros;
        String opcao;

        Scanner scan = new Scanner(System.in);

        System.out.printf("%nQuantos litros você vai por? ");
        litros = scan.nextInt();

        System.out.printf("Vai abastecer com Gasolina ou Alcool? ");
        opcao = scan.next();

        calcularCombustivel(opcao, litros);

        scan.close();
    }


    //Metodo calcular combustivel
    public static void calcularCombustivel(String opcao, int litros) {
        double desconto = 0;
        double total = 0;

        switch (opcao.toLowerCase()) {
            case "Gasolina":
            case "gasolina":
                if (litros <= 20) {
                    desconto = ((litros * 2.50) / 100) * 4;
                } else {
                    desconto = ((litros * 2.50) / 100) * 6;
                }
                total = (litros * 2.50) - desconto;

                System.out.printf("%d de Gasolina!", litros);
                System.out.printf("Preço: R$ %.2f", total);
                System.out.printf("Desconto: R$ %.2f", desconto);
                break;
            case "Alcool":
            case "alcool":
                if (litros <= 20) {
                    desconto = ((litros * 1.90) / 100) * 3;
                } else {
                    desconto = ((litros * 1.90) / 100) * 5;
                }
                total = (litros * 1.90) - desconto;
                System.out.printf("%d de Alcool!", litros);
                System.out.printf("Preço: R$ %.2f", total);
                System.out.printf("Desconto: R$ %.2f", desconto);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha entre Gasolina ou Alcool.");
                break;
        }
    }
}
