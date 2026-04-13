// Escreva um código que receba os valores da altura e largura de um retangulo
// e retorne a área. O mesmo para um quadrado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //quadrado
        // recebe os valores da altura e largura
        var scanner = new Scanner(System.in);
        System.out.println("Informe o valor da largura em cm do quadrado");
        float largura = scanner.nextFloat();
        // calcula a área e retorna o valor
        float area = largura * largura;
        System.out.printf("A área do quadrado informado é %s cm", area);

        //retangulo
        // recebe os valores da altura e largura
        System.out.println("Informe o valor da largura em cm do retangulo");
        largura = scanner.nextFloat();
        System.out.println("Informe o valor da altura em cm do retangulo");
        float altura = scanner.nextFloat();
        // calcula a área e retorna o valor
        area = largura * altura;
        System.out.printf("A área do retangulo informado é %s cm", area);

    }
}

//Iesus Hominum Salvator