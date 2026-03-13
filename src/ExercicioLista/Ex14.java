package ExercicioLista;

import java.util.Scanner;
//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de A: ");
        int valorA = scanner.nextInt();
        System.out.print("Informe o valor de B: ");
        int valorB= scanner.nextInt();

        int novoValorA = valorB;
        int novaValorB = valorA;

        System.out.println("Valor de A: " + novoValorA + " \nValor de B: " + novaValorB);
        scanner.close();
    }
}
