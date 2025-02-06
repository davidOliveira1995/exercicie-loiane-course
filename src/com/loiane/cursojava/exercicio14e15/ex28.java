package com.loiane.cursojava.exercicio14e15;

import java.util.Locale;
import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {

        int peso = 0;
        int opcao;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha entre uma dessas opções de carne.");
        System.out.println("1.File Duplo - 2.Alcatra - 3.Picanha");
        opcao = scan.nextInt();

        System.out.println("Quantos kilos? ");
        peso = scan.nextInt();

        System.out.println("Compra no cartão tabajara? 1.Sim 2.Não");
        int cartao = scan.nextInt();

        double preco = calcularPreco(opcao, peso);
        exibirInformacoes(opcao, preco, cartao);

        scan.close();
    }

    // Metodo Escolher opção de carne e retorna o preço
    public static double calcularPreco(int opcao, int peso) {
        double preco = 0;

        switch (opcao) {
            case 1:
                if (peso <= 5) {
                    preco = peso * 4.90;
                } else {
                    preco = peso * 5.80;
                }
                break;
            case 2:
                if (peso <= 5) {
                    preco = peso * 5.90;
                } else {
                    preco = peso * 6.80;
                }
                break;
            case 3:
                if (peso <= 5) {
                    preco = peso * 6.90;
                } else {
                    preco = peso * 7.80;
                }
                break;
            default:
                System.out.println("Opção Inválida!");
        }
        return preco;
    }

    // Metodo exibir o valor e tipo da carne
    public static void exibirInformacoes(int opcao, double preco, int cartao) {
        String tipoCarne;
        double desconto = 0;
        double subtotal = 0;

        // exibe o tipo de carne
        if (opcao == 1) {
            tipoCarne = "File Duplo";
        } else if(opcao == 2) {
            tipoCarne = "Alcatra";
        } else if(opcao == 3) {
            tipoCarne = "Picanha";
        } else {
            tipoCarne = "Opção Inválida";
        }

        // opção compra no cartão ou não, para gerar desconto
        if (cartao == 1) {
            desconto = (preco / 100) * 5;
        }

        subtotal = preco - desconto;

        System.out.println("Carne selecionada: " + tipoCarne + "!");
        System.out.println("Preço: R$ " + preco);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Subtotal: R$ " + subtotal);
    }

}
