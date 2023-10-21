package org.example;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zamit", "Bonatto", "Rafaela", "Fetterman", "Ferrão", "Arthur", "Arthur", "Eduardo", "Julia", "Alessandra", "Eduardo", "Christian", "Lula", "Bolsonaro", "Isadora", "Alexandre", "Maria", "Samuel", "Pedro", "Matheus", "Robert", "João", "Alexandre");

        // Contagem total de names na lista
        System.out.println("Número total de nomes na lista: " + names.size());

        // Encontrando a string mais longa
        String biggestName = names.stream()
                .max((s1, s2) -> s1.length() - s2.length()) // Encontra a string mais longa com base no comprimento
                .orElse(null); // Retorna null se a lista estiver vazia
        System.out.println("Nome mais longo na lista: " + biggestName);

        // Contando a frequência das names
        Map<String, Integer> frequency = new HashMap<>();
        for (String string : names) {
            // Incrementa a contagem se a string já estiver no mapa, caso contrário, inicia a contagem em 1
            frequency.put(string, frequency.getOrDefault(string, 0) + 1);
        }

        // Exibindo as 5 names mais frequentes
        frequency.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue()) // Ordena com base na contagem em ordem decrescente
                .limit(5) // Restringe o fluxo às 5 primeiras entradas
                .forEach(entry -> System.out.println("Nome: " + entry.getKey() + ", Frequência: " + entry.getValue())); // Imprime cada elemento e sua contagem correspondente
    }
}