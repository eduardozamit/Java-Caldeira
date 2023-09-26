import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Tarefa> listaDeTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Lista de Tarefas ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Exibir Tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    Date data = new Date(); // Data atual
                    Tarefa tarefa = new Tarefa(titulo, data, descricao);
                    listaDeTarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < listaDeTarefas.size()) {
                        listaDeTarefas.remove(indice);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Índice inválido. Tarefa não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("=== Lista de Tarefas ===");
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        System.out.println("Índice " + i + ": " + listaDeTarefas.get(i));
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