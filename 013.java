"""
Exercício 13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade. 
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome: "); 
    String nome = sc.nextLine();

    System.out.println("Digite sua idade: ");
    int idade = sc.nextInt();

    if (idade >= 18) {
        System.out.printf("%s você é maior de idade",nome);
    }else {
        System.out.printf("%s você é menor de idade",nome);
    }

    sc.close();
    }
}
