"""
Exercício 18 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100
"""

import java.util.Random;

public class estudo {
    public static void main(String[] args) {
        
        Random random = new Random();
        int numero = random.nextInt(101);
        
        System.out.println("Seu número é: " + numero);
    }
}
