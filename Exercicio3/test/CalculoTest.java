package Exercicio3.test;

// Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
// deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer
// um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

import Exercicio3.dominio.Calculo;

public class CalculoTest {
    public static void main(String[] args) {
        Calculo calculo =  new Calculo();

        calculo.testeCalculo();
    }
}
