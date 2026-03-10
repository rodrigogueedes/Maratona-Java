package introducao;
public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 numeros de um dado valor);
        int numero = 100;

        for (int i = 0; i <= numero; i++) {
            if (i >25) {
                break;
            }
            System.out.println(i);
        }
    }
}      
