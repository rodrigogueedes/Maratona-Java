package Aintroducaoclasses.test;

import Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Civic";
        carro1.modelo = "Touring";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.nome = "Creta";
        carro2.modelo = "Comfort";
        carro2.ano = 2025;

        Carro carro3 = new Carro();
        carro3.nome = "";
        carro3.modelo = "";
        carro3.ano = 0;
        
        carro3 = carro1;
        carro1 = carro2;

        System.out.println("Nome: " + carro1.nome + "| Modelo: " + carro1.modelo + "| Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + "| Modelo: " + carro2.modelo + "| Ano: " + carro2.ano);
        System.out.println("Nome: " + carro3.nome + "| Modelo: " + carro3.modelo + "| Ano: " + carro3.ano);
    }
}
