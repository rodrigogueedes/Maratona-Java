package ExercicioLista;

import java.util.Scanner;

//22 - Faça um algoritmo que leia dois valores inteiros A e B,
//  imprima na tela o quociente e o resto da divisão inteira entre eles.
public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = scanner.nextInt();

        int quociente = a / b;

        int resto = a % b;

        System.out.println("O quociente da divisão de " + a + " e " + b + " foi: " +  quociente + " e o resto é de: " + resto);
        scanner.close();
    }
}
