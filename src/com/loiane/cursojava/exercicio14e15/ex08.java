package com.loiane.cursojava.exercicio14e15;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double produtoA;
        double produtoB;
        double produtoC;

        System.out.println("Máquina de Lava - Eletrolux 110v: R$ ");
        produtoA = scan.nextDouble();

        System.out.println("Máquina de Lava - Consul 110v: R$ ");
        produtoB = scan.nextDouble();

        System.out.println("Máquina de Lava - Brasstemp 110v: R$ ");
        produtoC = scan.nextDouble();

        if (produtoA < produtoB && produtoA < produtoC) {
            System.out.println("Máquina Eletrolux R$ " + produtoA);
        } else if(produtoB < produtoA && produtoB < produtoC) {
            System.out.println("Máquina Consul R$ " + produtoB);
        } else {
            System.out.println("Máquina Brasstemp R$ " + produtoC);
        }
    }
}
