import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome! You are in the 02 exercise of class-01");
        System.out.println("------------------------------------------------------------");

        System.out.print("Digite um número inteiro: ");
        int num1 = scan.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Os números digitados foram: " + num1 + " e " + num2);
    }
}