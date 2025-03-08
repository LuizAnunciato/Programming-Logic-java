"""
Exercício 24 - Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente (1 = domingo, 2 = segunda).
"""

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número entre 1 e 7 correspondente aos dias da semana: ");
    int dia = sc.nextInt();

    if (dia == 1) {
        System.out.printf("%d - Domingo",dia);
    }else if (dia == 2) {
        System.out.printf("%d - Segunda Feira",dia);
    }else if (dia == 3) {
        System.out.printf("%d - Terça Feira",dia);
    }else if (dia == 4) {
        System.out.printf("%d - Quarta Feira",dia);
    }else if (dia == 5) {
        System.out.printf("%d - Quinta Feira",dia);
    }else if (dia == 6) {
        System.out.prinf("%d - Sexta Feira",dia);
    }else if (dia == 7) {
        System.out.printf("%d - Sábado",dia);
    }


    sc.close();
    }
}
