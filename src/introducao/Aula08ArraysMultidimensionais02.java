package introducao;
public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {

        //metodo 1
        //|
        int[] array = { 1, 2, 3 };
        int[][] arrayInt = new int[3][];

        //metodo 2 (principal)
        //|
        arrayInt[0] = new int[2];
        arrayInt[1] = array; //metodo 1
        arrayInt[2] = new int[] { 1, 2, 3, 4, 5, 6, };

        //metodo 3
        //|
        int[][] arrayInt2 = { { 0, 0 }, { 1, 2, 3 }, { 1, 2, 3, 4, 5, 6 } };

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n--------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
