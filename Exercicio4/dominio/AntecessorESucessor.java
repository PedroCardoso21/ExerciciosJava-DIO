package Exercicio4.dominio;
import java.util.Scanner;

public class AntecessorESucessor {
    private int numero;

    Scanner entrada = new Scanner(System.in);

    public AntecessorESucessor () {
        System.out.print("Digite um número: ");
        this.numero = entrada.nextInt();
    }

    public void resolucao() {
        System.out.println("Antecessor: " + (this.numero - 1));
        System.out.println("Sucessor: " + (this.numero + 1));
    }
}
