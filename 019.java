"""
Exercício 18 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles
"""

import java.util.Scanner;

public class estudo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    
    System.out.println("Digite o valor de A: ");
    int a = sc.nextInt();    

    System.out.println("Digite o valor de B: ");
    int b = sc.nextInt();

    float resto = (a % b);
    float coeficiente = (a/b);

    if (a % b != 0) {
        System.out.printf("O coeficiente da divisão de %d/%d é: %.0f%n",a,b,coeficiente);
        System.out.printf("O resto da divisão inteira é: %.0f ",resto);
    }else {
        System.out.println("A divisão não será feita, pois o número não tem resto");
    }
    sc.close();
    }
}


