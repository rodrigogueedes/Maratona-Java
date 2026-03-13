package ExercicioLista;

import java.util.Scanner;
//12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, 
// conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago.
// Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//Tabela de Código de Condições de Pagamento
//1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Informe o valor: ");
        double valorProduto = scanner.nextDouble();
        System.out.print(
                "informe a opção que você deseja pagar: [1] Dinheiro ou Pix [2] A vista no cartão de crédito [3] Parcelado no cartão em duas vezes [4] Parcelado no cartão em três vezes ou mais [5] Sair : ");
        int opcao = scanner.nextInt();
        double desconto = 0;
        switch (opcao) {
            case 1:
                desconto = 0.15;
                valorProduto = valorProduto - (valorProduto * desconto);
                System.out.println("O valor do " + nomeProduto + " foi de: R$" + valorProduto);
                break;
            case 2:
                desconto = 0.10;
                valorProduto = valorProduto - (valorProduto * desconto);
                System.out.println("O valor do " + nomeProduto + " foi de: R$" + valorProduto);
                break;
            case 3:
                System.out.println("O valor do " + nomeProduto + " foi de: R$" + valorProduto);
                break;
            case 4:
                desconto = 1.10;
                valorProduto = valorProduto + (valorProduto * desconto);
                System.out.println("O valor do " + nomeProduto + " foi de: R$" + valorProduto);
                break;
            case 5:
                break;

            default:
                System.out.println("Opção invalida!!!!!!!!!!!!");
                break;
        }

        scanner.close();
    }
}
