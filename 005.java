"""
Exercício 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse 

usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double salario_minimo = 1293.20;
        double salario = 0;
        double calculo = 0;

        System.out.println("Digite seu salário: ");
        salario = sc.nextDouble();

        calculo = salario / salario_minimo;

        System.out.printf("Seu salário contém %.2f salários mínimos",calculo);

        sc.close();
    }
}
