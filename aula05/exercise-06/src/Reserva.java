import java.util.Date;
public class Reserva {
    private String nome;
    private String local;
    private String cpf;
    private String dataDeEntrada;
    private String dataDeSaida;

    public Reserva(String nome, String local, String cpf, String dataDeEntrada, String dataDeSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataDeEntrada = dataDeEntrada;
        this.dataDeSaida = dataDeSaida;
    }


    @Override
    public String toString() {
        return "Título: " + nome + ", Descrição: " + local + ", Cpf: " + cpf + ", Data de entrada: " + dataDeEntrada + ", Data de saida: " + dataDeSaida;
    }
}
