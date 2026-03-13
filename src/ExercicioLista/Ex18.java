package ExercicioLista;

//18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
//  Faça um algoritmo que calcule  e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.
public class Ex18 {
    public static void main(String[] args) {
        double n1 = 1.50; //Francisco
        double n2 = 1.10; // Sara
        int anos = 0;
        String nome = "Francisco";
        String nome2 = "Sara";

        while (n2 < n1) {

            n1 += 0.02;
            n2 += 0.03;
            anos++;
        }
        System.out.println("Foram necessarrios " + anos + " anos para " + nome2  + " ficar maior que " + nome);
    }
}
