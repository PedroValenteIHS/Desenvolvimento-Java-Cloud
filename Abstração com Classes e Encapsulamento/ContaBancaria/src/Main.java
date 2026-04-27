// Esceva um código com uma classe conta que permita depositar, sacar e visualizar o saldo.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int acao = 0;
        var conta = new Conta();
        //Informa as opções
        while (acao <= 6){
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar Dinheiro");
            System.out.println("3 - Sacar Dinheiro");
            System.out.println("Sair");

            acao = scanner.nextInt();
            var saldo = conta.getSaldo();
        //Verifica a ação desejada e a realiza
            if (acao == 1){
                System.out.printf("Saldo: %s \n", saldo);
            }else if (acao == 2){
                System.out.println("Favor informar o valor a ser depositado:");
                float valor = scanner.nextFloat();
                while (valor <= 0){
                    System.out.println("Favor informar um valor positivo:");
                    valor = scanner.nextFloat();
                }
                conta.setDeposito(valor);
            }else if (acao == 3){
                System.out.println("Favor informar o valor a ser sacado:");
                float valor = scanner.nextFloat();
                while (valor > saldo){
                    System.out.println("Saldo insuficiente, informar um novo valor:");
                    valor = scanner.nextFloat();
                }
                conta.setSaque(valor);
            }
        }
    }
}


// Ad Majorem Dei Gloriam