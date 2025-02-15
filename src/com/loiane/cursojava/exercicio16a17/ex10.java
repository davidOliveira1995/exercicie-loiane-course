package com.loiane.cursojava.exercicio16a17;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        int primeiro;
        int ultimo;

        verificarIntervalo(10,200);
    }

    // metodo verificar intervalo dos números
    public static void verificarIntervalo(int primeiro, int ultimo) {
        for (int i = primeiro+1; i < ultimo; i++) {
            System.out.println(i);
        }
    }
}
