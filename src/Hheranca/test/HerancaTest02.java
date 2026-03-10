package Hheranca.test;

import Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0- Bloco de inicialização estatico da super classe é executado quando a JVM carregar a classe filha;
    // 1- Bloco de inicialização estatico da sub classe é executado quando a JVM carregar a classe filha;
    // 2- Alocado espaço em memória pro objeto da superclasse
    // 3- Cada atributo da superclasse é criado e inicializado com valores default ou o quer for passado da classe pai
    // 4- Bloco de inicialização da superclasse é executado na ordem que aparece
    // 5- Construtor é executado da superclasse
    // 6- Alocado espaço em memória pro objeto da subclasse
    // 7- Cada atributo da subclasse é criado e inicializado com valores default ou o quer for passado da classe pai
    // 8- Bloco de inicialização da subclasse é executado na ordem que aparece
    // 9- Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rodrigo");
    }
}
