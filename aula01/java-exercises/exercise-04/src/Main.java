import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome! You are in the 04 exercise of class-01");
        System.out.println("------------------------------------------------------------");

        float salarioMinimo = 1320;
        System.out.print("Digite o seu Salário: ");
        float salario = scan.nextFloat();

        float quantidadeDeSalariosMinimos = salario / salarioMinimo;

        System.out.println("O usuário recebe um total de " + (int) quantidadeDeSalariosMinimos + " salário(s) mínimo(s).");
    }
}