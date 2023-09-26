import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Impressao> listaDeImpressao = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Fila de impressão ===");
            System.out.println("1. Adicionar documentos");
            System.out.println("2. Remover documentos da fila");
            System.out.println("3. Imprimir documentos da fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do documento: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o número de páginas do documento: ");
                    String paginas = scanner.nextLine();
                    Date data = new Date(); // Data atual
                    Impressao impressao = new Impressao(titulo, data, paginas);
                    listaDeImpressao.add(impressao);
                    System.out.println("Documento adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o índice do documento a ser removido: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < listaDeImpressao.size()) {
                        listaDeImpressao.remove(indice);
                        System.out.println("Documento removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido. Tarefa não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("=== Lista de Tarefas ===");
                    for (int i = 0; i < listaDeImpressao.size(); i++) {
                        System.out.println("Índice " + i + ": " + listaDeImpressao.get(i));
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