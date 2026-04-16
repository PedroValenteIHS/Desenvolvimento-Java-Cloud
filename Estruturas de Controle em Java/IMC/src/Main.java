//Escreva um código onde o usuário entra com a altura e com o peso e que calcule o imc

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //recebe valores de altura e peso
        System.out.println("Digite sua altura em m:");
        float altura = scanner.nextFloat();
        //validação de valores menores que 0
        while (altura <= 0) {
            System.out.println("Valor de altura incorreto, insira um novo valor:");
            altura = scanner.nextFloat();
        }
        System.out.println("Digite seu peso em kg:");
        float peso = scanner.nextFloat();
        //validação de valores menores que 0
        while (peso <= 0) {
            System.out.println("Valor de peso incorreto, insira um novo valor:");
            peso = scanner.nextFloat();
        }

        //calcula imc
        float imc = peso/(altura*altura);

        //verifica em que caso se enquadra e imprime o valor
        if(imc <= 18.5){
            System.out.println("Você está abaixo do peso");
        }else if (imc <= 24.9 && imc > 18.5){
            System.out.println("Você está no peso ideal");
        }else if (imc <= 29.9 && imc > 24.9){
            System.out.println("Você está levemente acima do peso");
        }else if (imc <= 34.9 && imc > 29.9){
            System.out.println("Você está com obesidade grau I");
        }else if (imc <= 39.9 && imc > 34.9){
            System.out.println("Você está com obesidade grau II");
        }else{
            System.out.println("Você está com obesidade grau III");
        }
    }
}

// Ad Majorem Dei Gloriam