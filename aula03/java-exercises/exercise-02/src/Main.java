import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o raio desejado: ");
        double raio = scan.nextDouble();

        Circulo circulo = new Circulo(raio);

        double area = circulo.calcularArea();
        double circunferencia = circulo.calcularCircunferencia();

        System.out.println("Raio do círculo: " + raio);
        System.out.println("Área do círculo: " + String.format("%.2f", area));
        System.out.println("Circunferência do círculo: " + String.format("%.2f", circunferencia));
    }
}