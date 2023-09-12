import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            for (int j = num1; j < num2; j++) {
                if(i % j == 0 && i < 1);

            }
        }
    }
}