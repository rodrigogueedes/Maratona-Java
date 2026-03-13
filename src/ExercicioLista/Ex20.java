package ExercicioLista;

import java.util.Scanner;

//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor: ");
        int valor = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            int resu = valor * i;
            System.out.println(valor + " x " + i + " = " + resu);
        }
        scanner.close();

    }
}
