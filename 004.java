"""
Exercício 4 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int sucessor = 0;
        int antecessor = 0;

        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        
        sucessor = numero +1;
        antecessor = numero - 1;
        
        System.out.printf("O sucessor de %d é %d e o antecessor é %d",numero,sucessor,antecessor);

        sc.close();
    }
}
