"""
Exercício 15 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
"""

import java.util.Scanner;

public class estudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Fº: ");
        double f = sc.nextDouble();

        double c = (5 * (f - 32) / 9); // Corrigido para double

        System.out.printf("%.2f Fahrenheit em graus Celsius é: %.2f °C%n", f, c);

        sc.close();
    }
}
