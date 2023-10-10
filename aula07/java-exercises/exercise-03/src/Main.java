import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        try {
            int num = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Você digitou algo errado!");
        }
    }
}