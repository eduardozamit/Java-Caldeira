import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Livros> pilhaDeLivros = new Stack<>();

        // Adiciona livros a pilha
        pilhaDeLivros.push(new Livros("Harry Potter", "Fantasia"));
        pilhaDeLivros.push(new Livros("Senhor dos anéis", "Fantasia"));
        pilhaDeLivros.push(new Livros("Jogos Vorazes", "Fantasia"));
        pilhaDeLivros.push(new Livros("Código Limpo", "Tech"));


        imprimirPilhaDeLivros(pilhaDeLivros);

        imprimirPilhaDeLivrosPorCategoria(pilhaDeLivros, "Fantasia");

        esvaziarPilhaDeLivros(pilhaDeLivros);

        imprimirPilhaDeLivros(pilhaDeLivros);

    }
    public static void imprimirPilhaDeLivros(Stack<Livros> pilhaDeLivros) {
        System.out.println("\n---------- Pilha de Livros ----------\n");
        if (pilhaDeLivros.empty()) {
            System.out.println("A pilha de livros está vazia");
        } else {
            for (Livros livro : pilhaDeLivros) {
                System.out.println(livro);
            }
        }
    }

    public static void imprimirPilhaDeLivrosPorCategoria(Stack<Livros> pilhaDeLivros, String categoria) {
        System.out.printf("\n---------- %s ----------\n", categoria);
        for (Livros livro : pilhaDeLivros) {
            if (livro.getCategoria() == categoria) {
                System.out.println(livro);
            }
        }
    }

    public static void esvaziarPilhaDeLivros(Stack<Livros> pilhaDeLivros) {
        System.out.println("\n--------------------\n");
        System.out.println("Esvaziando a pilha de livros...");
        System.out.println("\n--------------------\n");
        do {
            pilhaDeLivros.pop();
        } while (!pilhaDeLivros.empty());
    }

}