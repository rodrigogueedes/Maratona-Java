package introducao;
public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000
        int contador = 0;

        while (contador<10) {          
            if (contador % 2 == 0) {
                System.out.println(contador);               
            }
         contador = contador +1;  
        }
            //Fazendo com For
 //     for (int i = 0; i < 20; i = i++) {
//          if (i % 2 == 0) {
//              System.out.println(i);
//          }
//      }
    }
}
