package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando a lista de produtos
        List<Product> products = new ArrayList<>();
        products.add(new Product("Shampoo", 15.5, 8));
        products.add(new Product("Toothpaste", 5.2, 12));
        products.add(new Product("Soap", 3.0, 15));
        products.add(new Product("Deodorant", 8.0, 10));

        // Encontrando o produto mais caro
        Product mostExpensiveProduct = products.stream()
                .max((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())) // Encontra o produto mais caro com base no preço
                .orElse(null); // Retorna null se a lista estiver vazia
        System.out.println("Produto mais caro: " + mostExpensiveProduct.getName());

        // Calculando o preço total de todos os produtos
        double totalPrice = products.stream()
                .mapToDouble(p -> p.getPrice() * p.getQuantity()) // Calcula o preço total de cada produto e o soma
                .sum();
        System.out.println("Preço total dos produtos: " + totalPrice);

        // Filtrando os produtos com quantidade superior a 10 e criando uma nova lista com eles
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getQuantity() > 10) // Filtra os produtos com quantidade superior a 10
                .toList(); // Cria uma nova lista com os produtos filtrados
        System.out.println("Produtos com a quantidade superior a 10: ");
        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }
}