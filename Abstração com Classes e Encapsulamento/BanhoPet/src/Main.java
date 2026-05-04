import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var banho = new Banho();
        int acao;
        String mensagem;

        //Informa as opções
        do {
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - Verificar nivel de água");
            System.out.println("5 - Verificar nivel de shampoo");
            System.out.println("6 - Verificar se está ocupado");
            System.out.println("7 - Retirar Pet");
            System.out.println("Sair");

            acao = scanner.nextInt();

            if (acao == 1){
                mensagem = banho.darBanho();
                System.out.printf("%s\n", mensagem);
            }else if (acao == 2) {
                mensagem = banho.abastecerAgua();
                System.out.printf("%s\n", mensagem);
            }else if (acao == 3) {
                mensagem = banho.abastecerShampoo();
                System.out.printf("%s\n", mensagem);
            }else if (acao == 4){
                mensagem = banho.getAgua();
                System.out.printf("%s\n", mensagem);
            }else if (acao == 5){
                mensagem = banho.getShampoo();
                System.out.printf("%s\n", mensagem);
            } else if (acao == 6) {
                boolean ocupacao = banho.getOcupacao();
                if (ocupacao) {
                    System.out.println("A máquina está ocupada");
                } else {
                    System.out.println("A máquina está livre");
                }
            } else if (acao == 7){
                mensagem = banho.retirar();
                System.out.printf("%s\n", mensagem);
            }
        } while (acao == 1 || acao == 2 || acao == 3 || acao == 4 || acao == 5 || acao == 6 || acao == 7);
    }
}