package Exercicio6.dominio;
import java.util.Scanner;

public class Reajuste {
    private double valor;
    Scanner entrada = new Scanner(System.in);

    public Reajuste() {
        System.out.print("Digite um valor: ");
        valor = entrada.nextDouble();
    }

    public void calculoReajuste() {
        valor *= 1.05;
        System.out.println("Valor reajustado com 5%: " + valor);
    }
}
