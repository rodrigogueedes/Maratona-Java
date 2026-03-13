package ExercicioLista;

import java.util.Scanner;

// 13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade. 
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }

        scanner.close();
    }
}
