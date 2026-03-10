package Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        // TODO Auto-generated method stub
        this.salario = salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome: " + nome + ", salario: " + salario + "]";
    }

}
