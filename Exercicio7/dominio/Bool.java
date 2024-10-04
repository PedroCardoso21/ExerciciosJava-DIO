package Exercicio7.dominio;

import java.util.Scanner;

public class Bool {
    Scanner sc = new Scanner(System.in);
    private boolean bool1;
    private boolean bool2;

    public Bool(){
        System.out.println("Digite o primeiro valor booleano (True/False): ");
        bool1 = sc.nextBoolean();
        System.out.println("Digite o segundo valor booleano (True/False): ");
        bool2 = sc.nextBoolean();
    }

    public void verificaBool(){
        if(bool1 && bool2) {
            System.out.println("Ambos os valores são verdadeiros");
        } else if (!bool1 && !bool2) {
            System.out.println("Ambos os valores são falsos");
        } else {
            System.out.println("Os valores são diferentes");
        }
    }
}
