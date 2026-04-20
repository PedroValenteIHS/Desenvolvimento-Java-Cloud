// Escreva um código onde o usuário passe um valor a ser dividido e depois o valor
// que vai dividir, enquanto a divisão tiver resto o sistema deve solicitar um novo número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Recebe os primeiros dois valores
        var scanner = new Scanner (System.in);
        System.out.println("Digite o número que soferá a divisão.");
        float valorUm = scanner.nextInt();
        System.out.println("Digite o número que fará a divisão.");
        float valorDois = scanner.nextInt();
        float result = valorUm / valorDois;
        System.out.printf("%s / %s = %s \n", valorUm, valorDois, result);

        // Inicia o looping enquanto a divisão não for perfeita.
        while(valorUm % valorDois != 0) {
            System.out.println("O sistema irá fechar assim que a divisão não tiver resto.");
            System.out.println("Digite outro número que fará a divisão.");
            valorDois = scanner.nextInt();
            result = valorUm / valorDois;
            System.out.printf("%s / %s = %s \n", valorUm, valorDois, result);
        }
    }
}

// Ad Majorem Dei Gloriam