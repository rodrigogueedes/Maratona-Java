package ExercicioLista;

import java.util.Scanner;

//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos,
//  determine se o triângulo é equilátero, isósceles ou escaleno.
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o 1 valor: ");
        int lado1 = scanner.nextInt();
        System.out.print("Informe o 2 valor: ");
        int lado2 = scanner.nextInt();
        System.out.print("Informe o 3 valor: ");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triangulo equilatero");
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
            System.out.println("Triangulo isosceles");
        }
        else if (lado1 != lado2 && lado1 != lado3) {
            System.out.println("Triangulo escaleno");
        }

        scanner.close();

    }
}