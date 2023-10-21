import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculadora = new Calculator();

        //Escolha dos dois números para equação.
        System.out.print("Escolha o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Escolha o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("""
                Agora escolha qual equação deseja fazer:\s
                 1 - Adição\s
                 2 - Subtração\s
                 3 - Multiplicação\s
                 4 - Divisão\s
                 0 - Sair""");
        int option = scan.nextInt();


        Operations operacao;
        switch (option) {
            case 1:
                operacao = Operations.ADICIONAR;
                break;
            case 2:
                operacao = Operations.SUBTRAIR;
                break;
            case 3:
                operacao = Operations.MULTIPLICAR;
                break;
            case 4:
                operacao = Operations.DIVIDIR;
                break;
            case 0:
                System.out.println("Programa encerrado.");
                return;
            default:
                System.err.println("Operação inválida.");
                return; // Encerra o programa em caso de operação inválida.
        }

        try {
            int result = 0;
            switch (operacao) {
                case ADICIONAR -> result = calculadora.adicionar(num1, num2);
                case SUBTRAIR -> result = calculadora.subtrair(num1, num2);
                case MULTIPLICAR -> result = calculadora.multiplicar(num1, num2);
                case DIVIDIR -> result = calculadora.dividir(num1, num2);
            }
            System.out.println("O resultado da operação foi: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Erro: " + e.getMessage());
        }

    }
}