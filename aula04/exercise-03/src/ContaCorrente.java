public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public void sacar(double valor) {
        // Implementação do método sacar para ContaCorrente
    }

    @Override
    public void depositar(double valor) {
        // Implementação do método depositar para ContaCorrente
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.01; // 1% de tributação sobre o saldo da conta corrente
    }
}
