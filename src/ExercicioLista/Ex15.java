package ExercicioLista;

import java.util.Scanner;
// 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
//  meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
//(Ex: 5 anos, 2 meses e 15 dias de vida)
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o ano que você nasceu: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Informe o mes que você nasceu: ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Informe o dia que você nasceu: ");
        int diaNascimento = scanner.nextInt();

        int anoHoje = 2026;
        int mesHoje = 3;
        int diaHoje = 13;



        int idade = anoHoje - anoNascimento;
        int mesCerto = mesHoje - mesNascimento;
        int diaCerto = diaHoje - diaNascimento;

        if (mesCerto < 0) {
            idade -= 1;
            mesCerto += 12;
        }
        if (diaCerto < 0) {
            mesCerto -= 1;
            diaCerto += 30;
        }

        System.out.println(idade);
        System.out.println(mesCerto);
        System.out.println(diaCerto);
        scanner.close();
    }
    
}
