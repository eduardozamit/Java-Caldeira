public class Calculator implements Calculable {

    @Override
    public int adicionar(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int dividir(int num1, int num2) throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida aqui.");
        }
        return num1 / num2;
    }
}
