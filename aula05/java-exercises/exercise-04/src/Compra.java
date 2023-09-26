import java.util.Date;
public class Compra {
    private String nome;
    private Date data;
    private String dataDeValidade;

    public Compra(String nome, Date data, String dataDeValidade) {
        this.nome = nome;
        this.data = data;
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data: " + data + ", Data de validade: " + dataDeValidade;
    }
}
