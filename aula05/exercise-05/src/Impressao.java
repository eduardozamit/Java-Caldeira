import java.util.Date;
public class Impressao {
    private String nome;
    private Date data;
    private String numeroDePaginas;

    public Impressao(String nome, Date data, String numeroDePaginas) {
        this.nome = nome;
        this.data = data;
        this.numeroDePaginas = numeroDePaginas;
    }


    @Override
    public String toString() {
        return "Título: " + nome + ", Descrição: " + numeroDePaginas + ", Data: " + data;
    }
}
