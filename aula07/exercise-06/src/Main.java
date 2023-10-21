public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        try {
            conta.sacar(1500.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}