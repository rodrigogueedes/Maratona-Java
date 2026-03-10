package introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        // idade >=15 && idade <18 categoria juvenil
        // idade >=18 categoria adulto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua Idade: ");
        int idade = scanner.nextInt();

        if (idade <15) {
            System.out.println("Sua categoria é infantil");
        }else if (idade >=15 && idade <18) {
            System.out.println("Sua categoria é juvenil");
        }else if (idade >=18) {
            System.out.println("Sua categoria é Adulto");
        }
        scanner.close();
    }
}
