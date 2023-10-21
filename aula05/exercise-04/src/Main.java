import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Compra> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Lista de Compras ===");
            System.out.println("1. Adicionar itens a lista");
            System.out.println("2. Remover itens da lista");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a data de validade do produto: ");
                    String descricao = scanner.nextLine();
                    Date data = new Date(); // Data atual
                    Compra compra = new Compra(titulo, data, descricao);
                    listaDeCompras.add(compra);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o índice do produto a ser removidao:");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < listaDeCompras.size()) {
                        listaDeCompras.remove(indice);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Índice inválido. Tarefa não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("=== Lista de Tarefas ===");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println("Índice " + i + ": " + listaDeCompras.get(i));
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