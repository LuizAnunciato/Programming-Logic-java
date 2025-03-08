"""
Exercício 25 - Faça um programa que receba um número inteiro entre 1 e 12 e informe o mês correspondente (1 = janeiro, 2 = fevereiro),
"""

import java.util.Scanner;
import java.util.HashMap;

public class meses {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer,String>meses = new HashMap<>();
    
    System.out.println("Digite um número inteiro entre 1 e 12: ");
    int numero = sc.nextInt();

    meses.put(1, "janeiro");
    meses.put(2, "fevereiro");
    meses.put(3, "março");
    meses.put(4, "abril");
    meses.put(5, "maio");
    meses.put(6, "junho");
    meses.put(7, "julho");
    meses.put(8, "agosto");
    meses.put(9, "setembro");
    meses.put(10, "outubro");
    meses.put(11, "novembro");
    meses.put(12, "dezembro");

    if (meses.containsKey(numero)) {
        System.out.println("O mês correspondente é: " + meses.get(numero));
    }

    sc.close();
    }
}
