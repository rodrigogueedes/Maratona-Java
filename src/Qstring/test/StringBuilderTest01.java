package Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Rodrigo Guedes";
        nome.concat(" Silva");
        nome.substring(0,3);

        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Rodrigo Guedes");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);

    }
}
