package Exercicio12.dominio;

import java.util.Scanner;

public class Produto implements InterfaceProduto {
    private final double valor;
    private final byte formaPagamento;

    Scanner input = new Scanner(System.in);

    public Produto() {
        System.out.print("Digite o valor do produto: ");
        this.valor = input.nextDouble();
        System.out.println("Opções:");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, juros de 10%");
        System.out.print("Selecione a forma de pagamento: ");
        this.formaPagamento = input.nextByte();
    }

    @Override
    public String formaPagamento() {
        if (formaPagamento == 1) {
            return "À Vista em Dinheiro ou Pix";
        } else if (formaPagamento == 2) {
            return "À Vista no cartão de crédito";
        } else if (formaPagamento == 3) {
            return "Parcelado no cartão em duas vezes";
        } else {
            return "Parcelado no cartão em três vezes ou mais";
        }
    }

    @Override
    public double calculaValorNovo() {
        if (formaPagamento == 1) {
            return valor - (valor * 0.15);
        } else if (formaPagamento == 2) {
            return valor - (valor * 0.10);
        } else if (formaPagamento == 3) {
            return valor;
        } else {
            return valor + (valor * 0.1);
        }
    }

    public void imprime() {
        System.out.println("Valor do produto: " + valor);
        System.out.println("Forma de pagamento: " + formaPagamento());
        System.out.println("Valor novo: " + calculaValorNovo());
    }

}
