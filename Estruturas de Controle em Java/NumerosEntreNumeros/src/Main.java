//Escreva um códido que receba dois numeros, o usuario deve escolher entre par e impar e o sistema deve imprimir todos
//os numeros impar ou par entre os dois numeros escolhidos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // recebe os dois valores
       var scanner = new Scanner (System.in);
       System.out.println("Digite o primeiro valor inteiro:");
       int valorUm = scanner.nextInt();
       System.out.println("Digite o segundo valor inteiro:");
       int valorDois = scanner.nextInt();

       // verifica se o primeiro é menor que o segundo
       while (valorUm > valorDois){
            System.out.println("Numero invalido, digite valor maior que o primeiro:");
            valorDois = scanner.nextInt();
       }

       //recebe se é impar ou par
       System.out.println("par ou impar?");
       var valor = scanner.next();

       //imprime os valores verificando se é par ou impar
       if ("par".equals(valor)){
           if (valorUm % 2 != 0){
               valorUm++;
           }
           for (var i = valorUm; i <= valorDois; i += 2 ){
               System.out.printf("%s \n", i);
           }
       } else {
           if (valorUm % 2 == 0){
               valorUm++;
           }
           for (var i = valorUm; i <= valorDois; i += 2 ){
               System.out.printf("%s \n", i);
           }
       }
    }
}

// Ad Majorem Dei Gloriam