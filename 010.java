"""
Exercício 10 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e  se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
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
