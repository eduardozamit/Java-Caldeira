import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("A idade deve ser valida!");
        }
    }
}