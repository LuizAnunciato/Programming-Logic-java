"""
Exercício 2 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
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
