"""
Exercício 23 - Criar um programa que leia pelo teclado um valor inteiro e diga se é par ou ímpar.
"""

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número: ");
    double numero = sc.nextDouble(); 

    if (numero % 2 == 0) {
        System.out.printf("%.0f é um número par",numero);
    }else if (numero % 2 != 0) {
        System.out.printf("%.0f é um número ímpar",numero);
    }else {
        System.out.println("Valor inválido.");
    }

    sc.close();
    }
}
