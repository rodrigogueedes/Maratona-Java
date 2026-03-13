package ExercicioLista;

import java.util.Random;

//21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100

public class Ex21 {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(101);

        System.out.println(num1);
    }
}
