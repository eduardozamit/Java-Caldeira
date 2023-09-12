import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome! You are in the 03 exercise of class-01");
        System.out.println("------------------------------------------------------------");

        int[] numbs = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite seu " + (i + 1) + "° número inteiro: ");
            numbs[i] = scan.nextInt();
        }

        int max = Integer.max(Integer.max(numbs[0], numbs[1]), numbs[2]);
        int min = Integer.min(Integer.min(numbs[0], numbs[1]), numbs[2]);
        float average = (float) (numbs[0] + numbs[1] + numbs[2]) / 3;

        System.out.println("O seu maior número é: " + max + " o menor número é: " + min + " e a média é: " + average);
    }
}