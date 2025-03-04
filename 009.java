"""
Exercício 9 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota b1: ");
        double b1 = sc.nextDouble();

        System.out.println("Digite sua nota b2: ");
        double b2 = sc.nextDouble();

        System.out.println("Digite sua nota b3: ");
        double b3 = sc.nextDouble();

        double media = (b1 + b2 + b3) / 3;
        System.out.printf("Sua média é: %.2f ", media);

        sc.close();
    }
}
