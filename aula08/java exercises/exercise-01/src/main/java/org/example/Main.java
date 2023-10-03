package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Zamit", "Bonatto", "Rafaela", "Fetterman", "Ferrão", "Arthur", "Arthur", "Eduardo", "Julia", "Alessandra", "Eduardo", "Crhistian", "Lula", "Bolsonaro");
        List<String> filteredNomes = nomes.stream()
                .filter(nome -> nome.startsWith("R"))
                .collect(Collectors.toList());
        List<String> stringMaisLonga = nomes.stream()
                        .filter(nome ->)

        System.out.println(filteredNomes);
    }
}