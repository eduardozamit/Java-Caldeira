import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Reserva> listaDeReservas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Lista de reservas ===");
            System.out.println("1. Reservar passagem");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Exibir lista de reservas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da reserva: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o local da reserva: ");
                    String local = scanner.nextLine();
                    System.out.print("Digite o seu CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite a sua data de entrada dd/MM/yy: ");
                    String dataDeEntrada = scanner.nextLine();
                    System.out.print("Digite a sua data de dd/MM/yy: ");
                    String dataDeSaida = scanner.nextLine();
                    Reserva impressao = new Reserva(nome, local, cpf, dataDeEntrada, dataDeSaida);
                    listaDeReservas.add(impressao);
                    System.out.println("Reserva adicionada com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o índice da reserva a ser removido: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < listaDeReservas.size()) {
                        listaDeReservas.remove(indice);
                        System.out.println("Reserva removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido. Reserva não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("=== Lista de Reservas ===");
                    for (int i = 0; i < listaDeReservas.size(); i++) {
                        System.out.println("Índice " + i + ": " + listaDeReservas.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}