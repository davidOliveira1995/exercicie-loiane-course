package com.loiane.cursojava.exercicio16a17;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        String nome;
        int idade = 0;
        double salario = 0;
        String sexo;
        String estadoCivil;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite um nome: ");
            nome = scan.next();

        } while (nome.length() < 3);

        System.out.println("Nomme, confirmado!");

        do {
            System.out.println("Digite uma idade entre 0 e 150: ");
            idade = scan.nextInt();

        } while (idade < 0 || idade > 150);
        System.out.println("idade, confirmada!");

        do {
            System.out.println("Digite seu sálario: R$ ");
            salario = scan.nextDouble();
        } while (salario <= 0);
        System.out.println("Salário, confirmado!");

        boolean confirmadoSexo;
        do {
            confirmadoSexo = false;

            System.out.println("Digite seu estado civil: 'f'- feminino, ou 'm'- masculino");
            sexo = scan.next();

            if (sexo.equals("f") || sexo.equals("m")) {
                confirmadoSexo = true;
            } else {
                System.out.println("Letra, incorreta!");
            }

        } while (confirmadoSexo != true);
        System.out.println("Sexo, confirmado!");

        boolean confirmadoEstadoCivil;
        do {
            confirmadoEstadoCivil = false;

            System.out.println("-----Digite o estado Civil!-----");
            System.out.println("S- Solteiro, C- Casado, V- Viuvo, D- Divorciado");
            estadoCivil = scan.next();

            if (estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d")) {
                confirmadoEstadoCivil = true;
            } else {
                System.out.println("Estado Civil Incorreto!");
            }
        }while (confirmadoEstadoCivil != true);
        System.out.println("Estado Civil, confirmado!");

        exibirInformacoes(nome,idade,salario,estadoCivil,sexo);

        scan.close();
    }

    // metodo exibir informações na tela
    public static void exibirInformacoes(String nome, int idade, double salario, String estadoCivil, String sexo){
        String nomeSexo = "";
        String nomeEstado = "";

        if (sexo.equals("f")) {
            nomeSexo = "Feminino";
        } else if(sexo.equals("m")) {
            nomeSexo = "Masculino";
        }

        if (estadoCivil.equals("s")) {
            nomeEstado = "Solteiro";
        } else if (estadoCivil.equals("c")) {
            nomeEstado = "Casado";
        } else if(estadoCivil.equals("v")) {
            nomeEstado = "Viuvo";
        } else if (estadoCivil.equals("d")) {
            nomeEstado = "Divorciado";
        }

        System.out.println("--------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos.");
        System.out.println("Sálario: R$ " + salario);
        System.out.println("Sexo: " + nomeSexo);
        System.out.println("Estado Civil: " + nomeEstado);
        System.out.println("--------------------------------");
    }
}
