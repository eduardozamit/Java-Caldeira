import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaBancaria {
    // Atributos
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private Date horarioAtual;
    private List<String> historicoTransacoes;
    private boolean contaAtiva;

    public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        if(validarCPF(cpf)){
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = new Date();
        this.historicoTransacoes = new ArrayList<>();
        this.contaAtiva = true;
    }

    public void saque(double valor) {
        try {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                historicoTransacoes.add("Saque de " + valor + " realizado. Novo saldo: " + saldo);
            } else {
                throw new IllegalArgumentException("Saldo insuficiente para saque.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deposito(double valor) {
        this.saldo += valor;
        historicoTransacoes.add("Depósito de " + valor + " realizado. Novo saldo: " + saldo);
    }

    public void pix(double valor) {
        try {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                historicoTransacoes.add("Transferência PIX de " + valor + " realizada. Novo saldo: " + saldo);
            } else {
                throw new IllegalArgumentException("Saldo insuficiente para realizar PIX.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        try {
            Date data = new Date();
            int hora = data.getHours();
            if (hora >= 8 && hora <= 19) {
                if (this.saldo >= valor) {
                    this.saldo -= valor;
                    destino.deposito(valor);
                    historicoTransacoes.add("Transferência de " + valor + " realizada para conta " + destino.getIdentificadorConta() + ". Novo saldo: " + saldo);
                } else {
                    throw new IllegalArgumentException("Saldo insuficiente para transferência.");
                }
            } else {
                throw new IllegalArgumentException("A transferência só pode ser feita entre 8hrs e 19hrs.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void verificarHorario() {
        System.out.println("Horário atual: " + horarioAtual.toString());
    }

    public void verificarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Identificador da conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        System.out.println("Saldo: " + saldo);
        System.out.println("Horário atual: " + horarioAtual.toString());
    }

    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço alterado com sucesso para: " + endereco);
    }

    public void taxaManutencaoMensal(double taxa) {
        this.saldo -= taxa;
        historicoTransacoes.add("Taxa de manutenção mensal de " + taxa + " debitada. Novo saldo: " + saldo);
    }

    public void calcularJuros(double taxa) {
        this.saldo += this.saldo * (taxa / 100);
        historicoTransacoes.add("Juros de " + taxa + "% calculados. Novo saldo: " + saldo);
    }

    public void fecharConta() {
        this.saldo = 0;
        this.contaAtiva = false;
        System.out.println("Conta encerrada com sucesso.");
    }

    public int getIdentificadorConta() {
        return identificadorConta;
    }

    public void exibirHistoricoTransacoes() {
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    //Método que válida CPF (Peguei pronto da net.)
    public boolean validarCPF(String cpf) {
        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11)
            return false;

        // Verifica se todos os dígitos são iguais, o que não é permitido em CPFs válidos
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != cpf.charAt(0))
                break;
            if (i == 10)
                return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito > 9)
            primeiroDigito = 0;

        // Verifica o primeiro dígito verificador
        if (primeiroDigito != cpf.charAt(9) - '0')
            return false;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito > 9)
            segundoDigito = 0;

        // Verifica o segundo dígito verificador
        if (segundoDigito != cpf.charAt(10) - '0')
            return false;

        return true;
    }
}
