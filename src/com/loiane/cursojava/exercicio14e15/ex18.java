package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {

        int dia;
        int mes;
        int ano;

        Scanner scan = new Scanner(System.in);

        System.out.println("Dia: ");
        dia = scan.nextInt();

        System.out.println("Mês: ");
        mes = scan.nextInt();

        System.out.println("Ano: ");
        ano = scan.nextInt();

        verificarData(dia,mes,ano);
    }

    // verefica se a data está correta
    public static void verificarData(int dia, int mes, int ano) {
        if ((dia > 0 && dia < 31) && (mes > 0 && mes < 13) && (ano > 0)) {
            System.out.println("Data: " + dia + "/" + mes + "/" + ano);
        } else {
            System.out.println("Data Inválida!");
        }
    }

}
