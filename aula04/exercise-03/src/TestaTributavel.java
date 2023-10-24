public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(2000);

        SeguroDeVida sv = new SeguroDeVida();

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        gerenciador.adicionar(cc);
        gerenciador.adicionar(sv);

        System.out.println("Total de tributos a serem pagos: " + gerenciador.getTotalTributos());
    }
}