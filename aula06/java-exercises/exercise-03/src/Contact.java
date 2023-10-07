public class Contact {
    private String telephone;
    private String name;
    private String address;
    public String local;

    public Contact(String telephone, String name, String address, String local) {
        this.telephone = telephone;
        this.name = name;
        this.address = address;
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Número de telefone: " + telephone + ", Endereço: " + address + ", Localidade: " + local;
    }
}
