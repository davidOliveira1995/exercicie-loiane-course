package com.loiane.cursojava.exercicio16a17;

public class ex11 {
    public static void main(String[] args) {
        int primeiro;
        int ultimo;

        verificarIntervalo(1,5);

        System.out.println("Soma total: " + calculaSoma(1,5));
    }

    // metodo verificar intervalo dos números
    public static void verificarIntervalo(int primeiro, int ultimo) {
        for (int i = primeiro+1; i < ultimo; i++) {
            System.out.println(i);
        }
    }

    public static int calculaSoma(int primeiro, int ultimo) {
        int total = 0;
        for (int i = primeiro + 1; i < ultimo; i++) {
            total += i;
        }
        return total;
    }
}
