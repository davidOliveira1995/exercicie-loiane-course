package com.loiane.cursojava.exercicio16a17;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        String nomeUsuario;
        String senha;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite o nome do úsuario: ");
            nomeUsuario = scan.next();

            System.out.println("Digite uma senha: ");
            senha = scan.next();

            if (nomeUsuario.equals(senha)) {
                System.out.println("Digite uma senha diferente!");
            }
        } while (nomeUsuario.equals(senha));

        System.out.println("Senha do úsuario: " + senha);
    }
}
