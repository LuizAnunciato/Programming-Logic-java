"""
Exercício 10 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite sua nota b1: ");
        double b1 = sc.nextDouble();

        System.out.println("Digite sua nota b2: ");
        double b2 = sc.nextDouble();

        System.out.println("Digite sua nota b3: ");
        double b3 = sc.nextDouble();

        System.out.println("Digite sua nota b4: ");
        double b4 = sc.nextDouble();

        double media = (b1 + b2 + b3 + b4) / 4;

        if (media >= 7) {
            System.out.println("Parabéns! " + nome + " você foi aprovado com média "+ media);
        } else {
            System.out.println("Infelizmente " + nome + "você foi reprovado com média " + media);
        }
        
        sc.close();
    }
}
