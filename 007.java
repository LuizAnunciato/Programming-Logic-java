
"""
Exercício 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite true ou false para o primeiro valor: ");
        boolean valor_1 = sc.nextBoolean();

        System.out.println("Digite true ou false para o segundo valor: ");
        boolean valor_2 = sc.nextBoolean();

        if (valor_1 == valor_2) {
            System.out.println("Ambos são " + (valor_1 ? "VERDADEIRO" : "FALSO"));
        } else {
            System.out.println("Os valores são diferentes.");
        }

        sc.close();
    }
}
