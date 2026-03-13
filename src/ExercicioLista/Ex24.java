package ExercicioLista;

import java.util.Scanner;

//22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
//sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem 
//a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//Fórmula: distância = tempo x velocidade.
//litros usados = distância / 12.
public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tempo de viagem ");
        int tempo = scanner.nextInt();
        System.out.println("Velocidade media ");
        int velocidade = scanner.nextInt();

        double distância = tempo * velocidade;
        double litrosUsados = distância / 12;

        System.out.println("A distancia percorrida foi: " + distância);
        System.out.println("A quantidade de litros usados foi: " + litrosUsados);
        scanner.close();

    }
}
