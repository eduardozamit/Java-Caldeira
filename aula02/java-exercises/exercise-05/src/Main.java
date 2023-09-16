import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor digite uma palavra para ser dividida: ");
        String word = scan.nextLine();

        System.out.println("A primeira metade da palavra é: " + word.substring(0, (word.length() / 2)) );
        //Método descoberto para solucionar esse problema.
    }
}