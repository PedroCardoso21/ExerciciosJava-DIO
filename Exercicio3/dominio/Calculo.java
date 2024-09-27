package Exercicio3.dominio;

import java.util.Scanner;

public class Calculo {
    private int A;
    private int B;
    private int C;

    Scanner entrada = new Scanner(System.in);

    public Calculo() {
        System.out.print("Digite o valor de A: ");
        this.A = entrada.nextInt();
        System.out.print("Digite o valor de B: ");
        this.B = entrada.nextInt();
    }

    public boolean iguais() {
        return A == B;
    }

    public void testeCalculo() {
        if (iguais()) {
            C = this.A + this.B;
            System.out.println("Valores somados: " + C);
        } else {
            C = this.A * this.B;
            System.out.println("Valores multiplicados: " + C);
        }
    }
}
