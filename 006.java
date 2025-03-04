"""
Exercício 6 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double valor = 0;
        double calculo = 0;

        System.out.println("Digite um valor que sofrerá um reajuste de 5%: ");
        valor = sc.nextDouble();

        calculo = (valor * 0.05);

        System.out.printf("O valor do reajuste é: %.2f%n" , calculo);
        System.out.print("O valor total reajustado é: " + (valor + calculo));

        sc.close();
    }
}
