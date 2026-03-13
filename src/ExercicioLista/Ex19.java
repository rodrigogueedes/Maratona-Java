package ExercicioLista;

//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
public class Ex19 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) {
            for (int i = 0; i <=10; i++) {
                int resu = contador * i;
                System.out.println(contador + " x " + i + " = " + resu);
            }
            contador++;
            System.out.println("=================");
        }
    }
}
