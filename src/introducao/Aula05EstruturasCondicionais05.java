package introducao;
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana,considerando 1 como domingo
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");

            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Dia invalido");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
            default:
                System.out.println("Genero invalido");
                break;
        }
    }
}
