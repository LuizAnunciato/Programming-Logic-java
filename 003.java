"""
Exercício 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, 

caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e

imprimir seu valor na tela.
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int multi = 0;
        int C = 0;

        System.out.println("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = sc.nextInt();
        
        if (A == B) {
            soma = (A+B); 
            C = soma;           
        } else {
            multi = (A*B);
            C = multi;
        }

        System.out.printf("O valor de C é: %d",C);

        sc.close();

    }
}


