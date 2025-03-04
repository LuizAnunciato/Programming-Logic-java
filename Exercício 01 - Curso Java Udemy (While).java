"""
Exercício 01 - Curso Java Udemy (Estrutura de repetição - While) - Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
"""

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senha_valida = 123628;
        int senha;

        do {
            System.out.println("Digite a senha de 6 dígitos (Ex: 012135): ");
            senha = sc.nextInt();

            if (senha != senha_valida) {
                System.out.println("Senha inválida. Tente novamente.");
            }

            if (String.valueOf (senha).length() > 6) {
                System.out.println("Senha ultrapassou limite de 6 elementos.");
            }

        } while (senha != senha_valida);

        System.out.println("Acesso permitido!");

        sc.close();
    }
}
