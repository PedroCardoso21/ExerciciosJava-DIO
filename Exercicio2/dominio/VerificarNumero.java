package Exercicio2.dominio;

import java.util.Scanner;

public class VerificarNumero {
    private int numero;

    Scanner scan  = new Scanner(System.in);

    public VerificarNumero() {
        System.out.print("Digite um número: ");
        numero = scan.nextInt();
    }

    public void verificaParOuImpar() {
        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }

    public void verificaPositivoOuNegativo() {
        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero == 0) {
            System.out.println("Número nulo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
