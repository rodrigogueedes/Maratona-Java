package ExercicioLista;

import java.util.Scanner;
//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
//Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * ( F-32) / 9)
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double temperatuFahrenheit = scanner.nextDouble();

        double celsius = (5 * ( temperatuFahrenheit - 32) / 9);

        System.out.println("Temperatura em Fahrenheit: " + temperatuFahrenheit + "\nTemperaturan em Celsius: " + celsius);

        scanner.close();

    }
}
