package Exercicio1.dominio;

import java.util.Scanner;

public class SomaValores {
    private final double A;
    private final double B;
    private final double C;
    private double soma;

    public SomaValores() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        A = scan.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = scan.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = scan.nextDouble();
        scan.close();
    }

    public void testaValores() {
        soma = A + B;
        System.out.println("A soma de " + A + " + " + B + " = " + soma);
        if (soma > C) {
            System.out.println("Maior que C");
        } else if (soma == C) {
            System.out.println("Igual a C");
        } else {
            System.out.println("Menor que C");
        }
    }
}
