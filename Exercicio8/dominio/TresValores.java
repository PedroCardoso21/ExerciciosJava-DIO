package Exercicio8.dominio;

import java.util.Scanner;

public class TresValores {
    private final int valor1;
    private final int valor2;
    private final int valor3;
    private int menorValor;
    private int maiorValor;
    private int valorMeio;

    Scanner entrada = new Scanner(System.in);

    public TresValores() {
        System.out.print("Digite o primeiro valor: ");
        valor1 = entrada.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = entrada.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = entrada.nextInt();
    }

    public void verificaMenorValor(){
        if (valor1 < valor2 && valor1 < valor3){
            menorValor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3){
            menorValor = valor2;
        } else {
            menorValor = valor3;
        }
    }

    public void verificaMaiorValor(){
        if (valor1 > valor2 && valor1 > valor3){
            maiorValor = valor1;
        } else if (valor2 > valor1 && valor2 > valor3){
            maiorValor = valor2;
        } else {
            maiorValor = valor3;
        }
    }

    public void verificaValorMeio() {
        if (maiorValor != valor1 && menorValor != valor1) {
            valorMeio = valor1;
        } else if(maiorValor != valor2 && menorValor != valor2) {
            valorMeio = valor2;
        } else {
            valorMeio = valor3;
        }
    }

    @Override
    public String toString() {
        return "TresValores{" +
                "menorValor=" + menorValor +
                ", valorMeio=" + valorMeio +
                ", maiorValor=" + maiorValor +
                '}';
    }
}
