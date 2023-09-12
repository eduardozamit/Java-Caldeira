import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome! You are in the first exercise of class-01");
        System.out.println("------------------------------------------------------------");

        System.out.print("Digite seu nome: ");
        String name = scan.nextLine();
        System.out.println(name + " é um lindo nome!");

    }
}