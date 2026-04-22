import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int acao = 0;
        var conta = new Conta();
        while (acao <= 6){
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar   boleto");
            System.out.println("6 - Verificar se a conta está utilizando cheque especial");
            System.out.println("Sair");

            acao = scanner.nextInt();

            if (acao == 1){
                var saldo = conta.getSaldo();
                System.out.println(saldo);
            }else if (acao == 3){
                float valor = scanner.nextFloat();
                conta.setDeposito(valor);
            }
        }
    }
}