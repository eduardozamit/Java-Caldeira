public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;

    public void saque(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }

    }

    public void deposito(double valor) {
        if (valor < 0) {
            System.out.println("Impossivel depositar uma valor menor que zero!");
        } else {
            saldo += valor;
        }
    }

    public void pix(double valor) {
        if (valor < saldo) {
            System.out.println("Vocë nao pode tranferir um pix negativo");
            saldo -= valor;
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        
    }
}
