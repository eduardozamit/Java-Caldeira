import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();

        list.put("Fetterman", 17);
        list.put("Bonatto", 21);
        list.put("Arthur", 17);
        list.put("David", 22);
        list.put("Anaurelino", 82);

        agePicker(list);

        getAge(list, "Arthur");
    }

    public static void getAge(HashMap<String, Integer> list, String name) {
        if (list.containsKey(name)) {
            System.out.println("O " + name + " tem " +list.get(name) + " anos de idade.");
        } else {
            System.out.println("O nome não está na lista!");
        }
    }
    public static void agePicker(HashMap<String, Integer> list) {
        int n = 0;
        for (Map.Entry<String, Integer> be : list.entrySet()) {
            if (be.getValue() >= 65) {
                System.out.println(be.getKey());
                n++;
            }
        }
        if (n < 1) {
            System.out.println("A lista não possui ninguém na terceira idade");
        }
    }
}