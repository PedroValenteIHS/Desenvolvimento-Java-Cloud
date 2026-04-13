// Escreva um código que receba os valores da altura e largura de um quadrado
// e retorne a área.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // recebe os valores da altura e largura
        var scanner = new Scanner(System.in);
        System.out.println("Informe o valor da largura em cm do quadrado");
        float largura = scanner.nextFloat();
        System.out.println("Informe o valor da altura em cm do quadrado");
        float altura = scanner.nextFloat();
        // calcula a área e retorna o valor
        float area = largura * altura;
        System.out.printf("A área do quadrado informado é %s cm", area);
    }
}

//Iesus Hominum Salvator