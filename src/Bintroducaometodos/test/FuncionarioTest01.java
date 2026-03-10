package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Roberto");
        funcionario.setIdade(28) ;
        funcionario.setSalarios(new double[]{1250.30, 3460.25, 2470.87});

        funcionario.imprime();
        System.out.println("Media: " + funcionario.getMedia());
    
        
        
    }
}
