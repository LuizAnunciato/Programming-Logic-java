"""
Exercício 5 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double salario_minimo = 1293.20;
        double salario = 0;
        double calculo = 0;

        System.out.println("Digite seu salário: ");
        salario = sc.nextDouble();

        calculo = salario / salario_minimo;

        System.out.printf("Seu salário contém %.2f salários mínimos",calculo);

        sc.close();
    }
}
