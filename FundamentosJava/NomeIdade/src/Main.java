// Escreva um código que receba nome e o ano de nascimento e imprima na tela
// o nome e a idade.

import java.io.Console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Recebe os parametros de nome e data
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome.");
        String name = scanner.nextLine();
        System.out.println("Digite sua data de nascimento");
        String dateSt = scanner.nextLine();

        //Converter data string para date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateSt, formatter);
        LocalDate today = LocalDate.now();

        //Calcula a idade com base na data atual
        long idade = ChronoUnit.YEARS.between(date, today);

        //Imprime resultado
        System.out.printf("Olá, %s!\nVoce tem %s anos!", name, idade);
    }
}

//Iesus Hominum Salvator