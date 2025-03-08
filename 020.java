"""
Exercício 20 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
"""

import java.util.Scanner;

public class estudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita o valor da hora de aula
        System.out.println("Digite o valor da hora de suas aulas: ");
        double valor_hora = sc.nextDouble();

        // Solicita o número de aulas lecionadas
        System.out.println("Digite o número de aulas lecionadas nesse mês: ");
        double aulas = sc.nextDouble();

        // Cálculo do salário bruto
        double salario_bruto = valor_hora * aulas;
        System.out.printf("Salário bruto: R$ %.2f%n", salario_bruto);

        // Declara a variável salário líquido fora do bloco
        double salario_liquido = 0;

        // Verificação do salário e cálculo do desconto do INSS
        if (salario_bruto <= 1302.00) {
            double desconto = 0.075;
            double desconto_inss = salario_bruto * desconto;
            salario_liquido = salario_bruto - desconto_inss;

        } else if (salario_bruto >= 1302.01 && salario_bruto <= 2571.29) {
            double desconto = 0.09;
            double desconto_inss = salario_bruto * desconto;
            salario_liquido = salario_bruto - desconto_inss;

        } else if (salario_bruto >= 2571.30 && salario_bruto <= 3856.94) {
            double desconto = 0.12;
            double desconto_inss = salario_bruto * desconto;
            salario_liquido = salario_bruto - desconto_inss;

        } else if (salario_bruto >= 3856.95 && salario_bruto <= 7507.49) {
            double desconto = 0.14;
            double desconto_inss = salario_bruto * desconto;
            salario_liquido = salario_bruto - desconto_inss;

        } else {
            // Para salários acima do teto
            System.out.println("O valor excedente não é tributado.");
        }

        // Exibe o salário líquido
        if (salario_liquido > 0) {
            System.out.println();
            System.out.printf("Salário líquido após desconto do INSS: R$ %.2f%n", salario_liquido);
        }

        sc.close();
    }
}
