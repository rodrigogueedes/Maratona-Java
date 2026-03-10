package Hheranca.test;

import Hheranca.dominio.Endereco;
import Hheranca.dominio.Funcionario;
import Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Rodrigo");
        pessoa.setCpf("1111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Endereco enderecof = new Endereco();
        enderecof.setRua("Rua 30");
        enderecof.setCep("012345-219");

        Funcionario funcionario = new Funcionario("Reginaldo");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(enderecof);
        funcionario.setSalario(5000.45);
        System.out.println("------------");
        funcionario.imprime();
        
        
    }
}
