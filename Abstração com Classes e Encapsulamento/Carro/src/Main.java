//Crie um código que simule um carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var carro = new Carro();
        int acao;
        int acelerar;

        //Informa as opções
        do {
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Trocar marcha");
            System.out.println("6 - Verificar velocimetro");
            System.out.println("Sair");

            acao = scanner.nextInt();
        //Chama a funcao de cada ação tomada
            if (acao == 1){
                carro.ligar();
                System.out.println("Carro ligado");
            } else if (acao == 2){
                carro.desligar();
                System.out.println("Carro desligado");
            } else if (acao == 3){
                System.out.println("Quantos km/h mais vai acelerar?");
                acelerar = scanner.nextInt();
                System.out.printf("%s \n", carro.acelerar(acelerar));
            } else if (acao == 4) {
                System.out.println("Quantos km/h vai desacelerar?");
                acelerar = scanner.nextInt();
                System.out.printf("%s \n", carro.desacelerar(acelerar));
            } else if (acao == 5) {
                System.out.println("Digite a marcha:");
                System.out.println("N - 1 - 2 - 3 - 4 - 5 - R");
                var marcha = scanner.next();
                System.out.printf("%s\n", carro.trocarMarcha(marcha));
            }else if (acao == 6) {
                int velocidade = carro.velocimetro();
                System.out.printf("%sKM/h \n", velocidade);
            }

        } while (acao == 1 || acao == 2 || acao == 3 || acao == 4 || acao == 5 || acao == 6);

    }
}

//Ad Majorem Dei Gloria