package Exercicio5.dominio;
import java.util.Scanner;

public class Salario {
    private static final double SALARIO_MINIMO = 1293.20;
    private double salario;

    Scanner entrada = new Scanner(System.in);

    public Salario() {
        System.out.print("Digite o seu salário: ");
        salario = entrada.nextFloat();
    }

    public void calculoSalario() {
        double salariosMinimos = salario / SALARIO_MINIMO;
        System.out.println("Você ganha " + salariosMinimos + " salários mínimos");
    }

}
