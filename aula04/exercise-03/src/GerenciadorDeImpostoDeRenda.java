import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpostoDeRenda {
    private double totalTributos;
    private List<Tributavel> listaTributaveis;

    public GerenciadorDeImpostoDeRenda() {
        this.totalTributos = 0;
        this.listaTributaveis = new ArrayList<>();
    }

    public void adicionar(Tributavel t) {
        listaTributaveis.add(t);
        totalTributos += t.calculaTributos();
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}
