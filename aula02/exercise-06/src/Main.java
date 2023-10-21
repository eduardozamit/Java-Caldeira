import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Character> array = new ArrayList<>();

        System.out.print("Digite uma palavra: ");
        String word = scan.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            array.add(word.charAt(i));
        }
        System.out.println(array);
    }
}
