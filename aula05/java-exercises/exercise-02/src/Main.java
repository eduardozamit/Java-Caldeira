import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[10];
        boolean acertou = false;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = 1 + random.nextInt(50);
        }

        do {
            System.out.print("Chute um número entre 1 e 100! Somente acertando saíra do loop!: ");
            int n = scan.nextInt();

            for (int j = 0; j < ar.length; j++) {
                if (n == ar[j]) {
                    acertou = true;
                }
            }

            if (acertou == true) {
                System.out.println("Você acertou! Meus parabéns.");
            } else {
                System.out.println("Infelizmente você errou, tente novamente.");
            }
        } while (acertou == false);

    }
}