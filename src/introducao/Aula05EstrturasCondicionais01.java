package introducao;
public class Aula05EstrturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;

        if (isAutorizadoComprarBebida) {
            System.out.println("voce pode beber");
        }else{
             System.out.println("Você nao pode beber");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Você nao pode beber");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
