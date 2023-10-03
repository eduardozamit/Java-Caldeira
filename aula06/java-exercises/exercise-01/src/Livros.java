public class Livros {
    private String titulo;
    private String categoria;

    public Livros(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return String.format("%s - Gênero: %s", this.titulo, this.categoria);
    }
}
