package Exercicio8.test;

// Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import Exercicio8.dominio.TresValores;

public class TresValoresTest {
    public static void main(String[] args) {
        TresValores valores = new TresValores();

        valores.verificaMenorValor();
        valores.verificaMaiorValor();
        valores.verificaValorMeio();
        System.out.println(valores);
    }
}
