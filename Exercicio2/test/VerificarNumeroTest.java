package Exercicio2.test;

// Faça um algoritmo para receber um número qualquer
// e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import Exercicio2.dominio.VerificarNumero;

public class VerificarNumeroTest {
    public static void main(String[] args) {
        VerificarNumero verifica = new VerificarNumero();

        verifica.verificaParOuImpar();
        verifica.verificaPositivoOuNegativo();
    }
}
