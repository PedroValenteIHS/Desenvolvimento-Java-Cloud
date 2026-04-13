// Escreva um código que receba duas datas de nascimento e imprima a diferença na tela

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Recebe as datas de nascimento
        var scanner = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento");
        String dateStum = scanner.nextLine();
        System.out.println("Digite a data de nascimento da outra pessoa");
        String dateStdois = scanner.nextLine();

        // Formata as datas e calcula a diff
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateum = LocalDate.parse(dateStum, formatter);
        LocalDate datedois = LocalDate.parse(dateStdois, formatter);

        long diferencaAno = ChronoUnit.YEARS.between(dateum, datedois);
        long diferencaMes = ChronoUnit.MONTHS.between(dateum, datedois);

        // Imprime valor na tela
        System.out.printf("A diferença de idades entre você e a outra pessoa é de %s ano(s) e %s mes(es)", diferencaAno, diferencaMes);
    }
}

//Iesus Hominum Salvator