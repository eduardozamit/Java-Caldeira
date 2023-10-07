import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Contact> schedule = new TreeMap<>();

        schedule.put("Eduardo", new Contact("51986284163", "Eduardo", "Dr. Luiz", "Sul"));
        schedule.put("Bonatto", new Contact("51923523432", "Bonatto", "Av. Conceição", "Norte"));
        schedule.put("Fetterman", new Contact("51923984765", "Fetterman", "Rua. Borges de medeiros", "Leste"));
        schedule.put("Juliana", new Contact("51932232323", "Juliana", "Rua. Ernesto Dornelles", "Oeste"));
        schedule.put("Diogo", new Contact("51912754630", "Diogo", "Rua. Sapucaia do Sul", "Sul"));

        String region = "Sul";

        System.out.println("Contatos em ordem alfabética:");
        for (Contact contact : schedule.values()) {
            System.out.println(contact);
        }

        System.out.println("\n Contatos que residem na região " + region + ":");
        for (Contact contact : schedule.values()) {
            if (contact.getLocal().equals(region)) {
                System.out.println(contact);
            }
        }

    }
}