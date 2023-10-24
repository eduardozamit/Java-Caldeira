public abstract class Conta {
    protected double saldo;

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public double obterSaldo() {
        return saldo;
    }
}
