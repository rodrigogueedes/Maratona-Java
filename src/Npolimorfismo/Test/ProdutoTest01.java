package Npolimorfismo.Test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Televisao;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10", 11000);
        Tomate tomate = new Tomate("Tomate Vermelho", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);

        CalculadoraImposto.calcularImposto(tomate);

        CalculadoraImposto.calcularImposto(tv);
    }
}
