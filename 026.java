"""
Exercício 26 - Faça um programa que receba a idade e o peso de uma pessoa. 
 * De acordo com a tabela a seguir, verifique e mostre em qual grupo de risco essa pessoa se encaixa.
 * Menores que 20 anos - risco 9 até 60 kg, risco 8 entre 60 e 90 kg, risco 7 acima de 90 kg.
 * De 20 a 50 anos - risco 6 até 60 kg, risco 5 entre 60 e 90 kg, risco 4 acima de 90 kg.
 * Maiores que 50 anos - risco 3 até 60 kg, risco 2 entre 60 e 90 kg, risco 1 acima de 90 kg. */
"""

import java.util.Scanner;

public class risco_peso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String risco = ""; // Declarado fora dos blocos if

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        if (idade >= 1 && idade < 20) {
            if (peso >= 1 && peso < 60) {
                risco = "9";
            } else if (peso >= 60 && peso < 90) {
                risco = "8";
            } else {
                risco = "7";
            }
        } else if (idade >= 20 && idade < 50) {
            if (peso >= 1 && peso < 60) {
                risco = "6";
            } else if (peso >= 60 && peso < 90) {
                risco = "5";
            } else {
                risco = "4";
            }
        } else {
            if (peso >= 1 && peso < 60) {
                risco = "3";
            } else if (peso >= 60 && peso < 90) {
                risco = "2";
            } else {
                risco = "1";
            }
        }

        System.out.println("\nSuas informações:");
        System.out.println();
        System.out.printf("%s, verifique se suas informações estão corretas.\n", nome);
        System.out.printf("Idade: %d anos\n", idade);
        System.out.printf("Peso: %.2f kg\n", peso);
        System.out.printf("Risco: %s\n", risco);

        sc.close();
    }
}
