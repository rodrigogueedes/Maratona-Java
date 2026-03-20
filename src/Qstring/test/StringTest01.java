package Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Rodrigo"; //String constant pool
        String nome2 = "Rodrigo";
        nome = nome.concat(" Suane"); // nome += " Suane"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Rodrigo"); // 1 variavel de referência, 2 objeto do tipo String, 3 uma String na pool de String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
