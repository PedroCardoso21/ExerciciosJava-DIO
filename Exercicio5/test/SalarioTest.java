package Exercicio5.test;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
// calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
// (Base para o Salário mínimo R$ 1.293,20).

import Exercicio5.dominio.Salario;

public class SalarioTest {
    public static void main(String[] args) {
        Salario salario = new Salario();

        salario.calculoSalario();
    }
}
