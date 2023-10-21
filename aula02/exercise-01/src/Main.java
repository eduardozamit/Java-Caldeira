import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int num1, num2, i, j;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        boolean primo;

        for (i = num1; i <= num2; i++) {
            primo = true;
            if (i== 1) {
                primo = false;
            }
            if (primo) {
                if (i % 2 == 0 && i != 2) {
                    primo = false;
                }
            }

            if (primo) {
                for (j = 2; j <= (i/2); j++) {
                    if (i%j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                array.add(i);
            }
        }

        System.out.println("Os números primos entre " + num1 + " e " + num2 + " são: " + array);

    }
}