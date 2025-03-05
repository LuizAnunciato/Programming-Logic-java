"""
Exercício 02 - Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
"""

import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int combustivel;

        do {
            System.out.println("Digite o tipo de combustível (1. Álcool, 2. Gasolina, 3. Diesel, 4. Fim): ");
            combustivel = sc.nextInt();

            while (combustivel < 1 || combustivel > 4) { // Validação de entrada
                System.out.println("Código inválido! Digite novamente:");
                combustivel = sc.nextInt();
            }

            switch (combustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }

        } while (combustivel != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
