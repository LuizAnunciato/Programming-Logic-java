"""
Exercício 8 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso (Ex: 78): ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura (Ex: 1,80): ");
        double altura = sc.nextDouble();

        Math.pow(altura,2);

        double imc = (peso / Math.pow(altura,2));

        System.out.printf("Seu IMC é: %f", imc);
        sc.close();
    }
}
