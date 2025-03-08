"""
Exercício 22 - Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.
"""

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos números
        System.out.println("Digite o primeiro número: ");
        double numero_1 = sc.nextDouble();

        // Consome a quebra de linha pendente antes de ler a string
        sc.nextLine(); 

        // Entrada do operador
        System.out.println("Digite qual operador deseja utilizar (+, -, *, /): ");
        String operador = sc.nextLine();

        System.out.println("Digite o segundo número: ");
        double numero_2 = sc.nextDouble();

        // Estrutura condicional corrigida
        if (operador.equals("+")) {
            System.out.printf("%.2f + %.2f = %.2f\n", numero_1, numero_2, (numero_1 + numero_2));
        } else if (operador.equals("-")) {
            System.out.printf("%.2f - %.2f = %.2f\n", numero_1, numero_2, (numero_1 - numero_2));
        } else if (operador.equals("*")) {
            System.out.printf("%.2f * %.2f = %.2f\n", numero_1, numero_2, (numero_1 * numero_2));
        } else if (operador.equals("/")) {
            if (numero_2 != 0) {
                System.out.printf("%.2f / %.2f = %.2f\n", numero_1, numero_2, (numero_1 / numero_2));
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Operação inválida.");
        }

        sc.close();
    }
}


