import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ar= new int[5];
        int soma = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < ar.length; i++) {
            System.out.print("Insira o " + (i + 1) + "° número: ");
            ar[i] = scan.nextInt();
            soma += ar[i];
        }

        System.out.println("A soma dos números é: " + soma);
        System.out.println("E a média dos números é: " + (soma / 5));
    }
}