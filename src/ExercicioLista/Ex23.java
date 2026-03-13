package ExercicioLista;

import java.util.Scanner;

//21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
//valor da hora aula,número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor da hora: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Numero de aulas lecionadas no mes: ");
        int numeroDeAulas = scanner.nextInt();
        System.out.print("Percentual do INSS: ");
        double inss = scanner.nextDouble();

        double salarioBruto = valorHora * numeroDeAulas;
        double salarioLiquido = salarioBruto - (salarioBruto * inss/100);

        System.out.println("O seu salario Bruto é: " + salarioBruto + "\nO seu salario liquido é: " + salarioLiquido);
        scanner.close();
    }
}
