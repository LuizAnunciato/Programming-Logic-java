"""
Exercício 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o valor de A: ");
    int a = sc.nextInt();

    System.out.println("Digite o valor de B: ");
    int b = sc.nextInt();

    int c = 0;
    
    System.out.println();

    System.out.println("Antes da troca (A): " + a);
    System.out.println("Antes da troca (B): " + b);

    c = a;
    a = b;
    b = c;

    System.out.println();

    System.out.println("Depois da troca (A): " + a);
    System.out.println("Depois da troca (B): " + b);

    sc.close();
    }
}


