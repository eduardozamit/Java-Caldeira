import java.util.Date;
public class Tarefa {
    private String titulo;
    private Date data;
    private String descricao;

    public Tarefa(String titulo, Date data, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo  + ", Descrição: " + descricao + ", Data: " + data;
    }
}
