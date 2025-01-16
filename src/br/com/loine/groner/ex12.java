package br.com.loine.groner;

import java.util.Scanner;

// calcular peso ideal
public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double altura;
        double pesoideal;

        System.out.print("Digite sua altura: ");
        altura = scan.nextDouble();

        pesoideal = (72.7 * altura) - 58;

        System.out.print("Peso Ideal: " + pesoideal + " KG.");

        scan.close();
    }
}
