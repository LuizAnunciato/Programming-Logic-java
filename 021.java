"""
Exercício 21 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
"""
  
import java.util.Scanner;

public class estudo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite qual o destino da sua viagem: ");
    String destino = sc.nextLine();

    System.out.println("Digite quantos KM totais tem sua viagem: ");
    int km_total = sc.next();

    int litros = km_total / 12;

    System.out.println("Para chegar a " + destino + ", você precisará de " + litros + " litros de combustível.");
        
    sc.close();
    }
}
