public class ContaBancaria {
    private double saldo;

    public ContaBancaria (double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void  sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insufficient meu guri");
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso meu guri.");
    }

    public double getSaldo() {
        return saldo;
    }
}
