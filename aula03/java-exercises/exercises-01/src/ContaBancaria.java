import java.util.Date;
public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private Date horarioAtual;

    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = new Date();
    }

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
        if (horarioAtual.getHours() < 8 || horarioAtual.getHours() >= 19) {
            System.out.println("As transferências só podem ser realizadas entre 8h e 19h.");
        } else if (valor <= 0) {
            System.out.println("O valor da transferência deve ser maior que zero.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        } else {
            saldo -= valor;
            destino.deposito(valor);
            System.out.printf("Transferência de R$%.2f para a conta de %s realizada com sucesso.%n", valor, destino.nome);
            System.out.printf("Novo saldo da sua conta: R$%.2f%n", saldo);
            System.out.printf("Novo saldo da conta de %s: R$%.2f%n", destino.nome, destino.saldo);
        }
    }

    public void verificarSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }

    public void verificarHorario() {
        System.out.printf("Horário atual: %02d:%02d%n", horarioAtual.getHours(), horarioAtual.getMinutes());
    }

    public void verificarInformacoes() {
        System.out.println("Informações da conta bancária:");
        System.out.println("Nome do titular: " + nome);
        System.out.println("CPF do titular: " + cpf);
        System.out.println("Número de identificação da conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço do titular: " + endereco);
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
        System.out.printf("Horário atual: %02d:%02d%n", horarioAtual.getHours(), horarioAtual.getMinutes());
    }

    public void setCpf() {

    }
}
