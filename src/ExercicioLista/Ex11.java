package ExercicioLista;

import java.util.Scanner;
// Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
//  imprima na tela o nome do aluno e  se o aluno foi aprovado ou reprovado.
//  Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();
        double soma = 0;
        int contador = 0;

        for (int i = 1 ; i <= 4; i++) {
            System.out.print("Digite sua " + i + " nota: ");
            double nota = scanner.nextDouble();
            soma += nota;
            contador++;
        }

        double media = soma / contador;

        System.out.println("O aluno: " + nome + " Teve sua media de : " + media);
        scanner.close();
        
    }
}
