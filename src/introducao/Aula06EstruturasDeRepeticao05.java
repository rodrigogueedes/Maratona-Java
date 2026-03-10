package introducao;
public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //dada um valor de um carro descubra em quantas ele pode ser parcelado
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >=1 ; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);
        }
    }
}