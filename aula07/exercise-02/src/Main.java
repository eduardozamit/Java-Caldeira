import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um dia da semana (em maiúsculas): ");
        String input = scan.nextLine();

        DaysOfWeek day = DaysOfWeek.valueOf(input);

        switch (day) {
            case SEGUNDA -> System.out.println("Hoje é segunda-feira. É o primeiro dia útil da semana.");
            case TERCA -> System.out.println("Hoje é terça-feira. A semana está apenas começando.");
            case QUARTA -> System.out.println("Hoje é quarta-feira. Já estamos no meio da semana.");
            case QUINTA -> System.out.println("Hoje é quinta-feira. O fim de semana está chegando.");
            case SEXTA -> System.out.println("Hoje é sexta-feira. É o último dia útil da semana.");
            case SABADO -> System.out.println("Hoje é sábado. Aproveite o fim de semana!");
            case DOMINGO -> System.out.println("Hoje é domingo. Um dia para relaxar.");
            default -> System.out.println("Dia da semana inválido. Certifique-se de digitar em maiúsculas.");
        }
    }
}