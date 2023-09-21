public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Eduardo Bonatto", "123.456.789-00", "12345", "Agibank", "Rua ABC, 123", 11000.00);
        ContaBancaria conta2 = new ContaBancaria("Eduardo Fetterman", "987.654.321-00", "54321", "Agibank", "Rua XYZ, 456", 500.00);

        conta1.verificarInformacoes();
        conta1.verificarSaldo();
        conta1.verificarHorario();

        conta1.deposito(200.00);
        conta1.saque(50.00);
        conta1.pix(300.00);
        conta1.transferencia(conta2, 15.00);

        conta1.verificarSaldo();
        conta2.verificarSaldo();
    }
}

