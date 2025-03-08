"""
Exercício 21 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
"""
  
import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o tempo gasto na viagem (em horas): ");
        double tempo = sc.nextDouble();

        System.out.println("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidadeMedia = sc.nextDouble();

        // Cálculo da distância percorrida
        double distancia = tempo * velocidadeMedia;

        // Cálculo do consumo de combustível
        double litrosUsados = distancia / 12; // Considerando que o carro faz 12 km/l

        // Saída dos resultados
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros de combustível utilizados: " + litrosUsados + " litros");

        sc.close();
    }
}

