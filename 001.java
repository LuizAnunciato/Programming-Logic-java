"""
Exercício 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
"""
import java.util.Scanner;

public class Estudo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de a: ");
		int a = sc.nextInt();

		System.out.println("Digite o valor de b: ");
		int b = sc.nextInt();

		System.out.println("Digite o valor de c: ");
		int c = sc.nextInt();

		int soma = (a + b);
		System.out.printf("Resultado da soma de %d + %d é de %d%n", a, b, soma);

		if (soma < c) {
			System.out.printf("%d é menor que %d", soma, c);
		} else {
			System.out.printf("%d é maior que %d", soma, c);
		}

		sc.close();
	}
}
