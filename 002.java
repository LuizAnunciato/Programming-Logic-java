"""
Exercício 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
"""

import java.util.Scanner;

public class Estudo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = sc.nextInt();

		if (numero > 0) {
			System.out.printf("Positivo ou negativo: %d é um número positivo%n", numero);
		} else if (numero < 0) {
			System.out.printf("Positivo ou negativo: %d é um número negativo%n", numero);
		} else
			System.out.printf("Positivo ou negativo: %d é um número equivalente a zero%n", numero);

		if (numero % 2 == 0) {
			System.out.printf("Par ou Ímpar: %d é um número par%n", numero);
		} else {
			System.out.printf("Par ou Ímpar: %d é um número ímpar%n", numero);
		}

		sc.close();
	}
}
