import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> products = new LinkedHashMap<>();

        products.put("Banana", 2.99);
        products.put("Maça", 4.56);
        products.put("Pera", 6.19);

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println("chave: " + entry.getKey() + ", valor: " + entry.getValue());
        }
    }
}