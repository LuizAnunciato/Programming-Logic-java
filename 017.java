"""
Exercício 17 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
"""

import java.util.Scanner;

public class estudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i)); // Corrigido para `i`
        }

        sc.close(); // Agora está no lugar correto
    }
}
