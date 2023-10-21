import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Atenção 300! Temos uma guerra pela frente! Eu, Tigas, Tiago Ventura e mais 297!!!");

        do {
            System.out.print("Qual é o seu palpite sobre contra quantos inimigos os espartanos irão lutar: ");
            int palpite = scan.nextInt();

            if (palpite < 30000) {
                System.out.println("UM POUCO MAIS!!!");
            } else if (palpite > 30000) {
                System.out.println("UM POUCO MENOS!!!");
            } else {
                System.out.println("ACERTOU MIZERAVI!!!");
                break;
            }
        } while (true);
    }
}
