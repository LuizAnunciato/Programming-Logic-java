"""
Exercício 16 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
"""

import java.util.Scanner;

public class estudo {
    public static void main(String[] args) {
        double francisco = 1.50;
        double sara = 1.10;
        int anos = 0;

        while (sara < francisco) {
            francisco += 0.02;
            sara += 0.03;
            anos = anos + 1;
        }

        System.out.printf("Sara ultrapassará Francisco em %d anos.%n",anos);

    }
}
