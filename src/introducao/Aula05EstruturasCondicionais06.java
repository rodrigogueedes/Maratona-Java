package introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7 imprima se é dia util ou final de semana
        //considerando 1 como domingo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um dia da semana em numeros: ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia Util");
                break;
            case 3:
                System.out.println("Dia Util");
                break;
            case 4:
                System.out.println("Dia Util");
                break;
            case 5:
                System.out.println("Dia Util");
                break;
            case 6:
                System.out.println("Dia Util");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
        
            default:
                System.out.println("Dia invalido");
                break;
        }
    scanner.close();
    }
}
