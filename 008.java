"""
Exercício 8 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso (Ex: 78): ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura (Ex: 1,80): ");
        double altura = sc.nextDouble();

        double imc = (peso / Math.pow(altura,2));

        if (imc < 18.5) {
            System.out.printf("Seu IMC é de: %.2f e você está abaixo do peso",imc);
        } else if (imc >= 18.6 && imc <= 24.90) {
            System.out.printf("Seu IMC é de: %.2f e você está no peso ideal, parabéns!",imc);
        } else if (imc >= 25.0 && imc <= 29.90) {
            System.out.printf("Seu IMC é de %.2f e você está levemente acima do peso",imc);
        } else if (imc >= 30.0 && imc <= 34.90) {
            System.out.printf("Seu IMC é de: %.2f e você está com obesidade grau I",imc);
        } else if (imc >= 35.0 && imc <= 39.90) {
            System.out.printf("Seu IMC é de: %.2f e você está com obesidade grau II",imc);
        } else {
            System.out.printf("Seu IMC é de: %.2f e você está com obesidade grau III (Mórbida)",imc);
        }
        
        sc.close();
    }
}

    }
}
