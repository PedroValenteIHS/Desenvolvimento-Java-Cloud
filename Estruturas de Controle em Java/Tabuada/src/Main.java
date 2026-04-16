// Escreva um código que receba um número e gere uma tabuada de 0 até 10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        System.out.println("Escreva o numero que deseja saber a tabuada.");
        int numero = scanner.nextInt();
        for (int i = 0; i < 11; i++) {
            int resultado = numero * i;
            System.out.printf("%s x %s = %s \n", numero, i, resultado);
        }
    }
}

// Ad Majorem Dei Gloriam