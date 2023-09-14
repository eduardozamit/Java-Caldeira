import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Calculadora");
            System.out.print("Digite o primeiro número: ");
            double num1 = scan.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scan.nextDouble();

            System.out.println("""
                    Escolha uma operação:\s
                    1 - Adição\s
                    2 - Subtração\s
                    3 - Multiplicação\s
                    4 - Divisão""");

            int escolha = scan.nextInt();

            double resultado;

            switch (escolha) {
                case 1 -> resultado = num1 + num2;
                case 2 -> resultado = num1 - num2;
                case 3 -> resultado = num1 * num2;
                case 4 -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continue; // Comando que faz voltar ao início do loop
                    }
                }
                default -> {
                    System.out.println("Opção inválida.");
                    continue; // Comando que faz voltar ao início do loop/2
                }
            }

            System.out.println("O resultado é: " + resultado);

            System.out.print("Deseja continuar? (S para Sim, N para Não): ");
            char continuar = scan.next().charAt(0);

            if (continuar == 'N' || continuar == 'n') {
                System.out.println("Encerrando a calculadora.");
                break;
            }

        } while (true);

    }
}
