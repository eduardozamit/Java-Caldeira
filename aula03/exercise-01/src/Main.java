public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria("Fulano", "05419209012", 123, "Banco XPTO", "Rua A, 123", 1000);

        // Realizando operações na conta
        conta.verificarInformacoes();

        conta.deposito(500);
        conta.saque(200);
        conta.pix(300);

        ContaBancaria destino = new ContaBancaria("Ciclano", "05419209012", 456, "Banco XYZ", "Rua B, 456", 500);
        conta.transferencia(destino, 150);

        // Verificando saldo e horário
        conta.verificarSaldo();
        conta.verificarHorario();

        // Alterando endereço
        conta.alterarEndereco("Rua C, 789");

        // Taxa de manutenção mensal e cálculo de juros
        conta.taxaManutencaoMensal(50);
        conta.calcularJuros(1.5);

        // Fechando a conta
        conta.fecharConta();

        // Exibindo histórico de transações
        conta.exibirHistoricoTransacoes();
    }
}