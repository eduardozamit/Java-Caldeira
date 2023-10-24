import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalcularPagamentoMensal() {
        double valorDoEmprestimo = 300000;
        double taxaDeJurosAnual = 3.5;
        int prazoEmAnos = 30;

        double pagamentoEsperado = 1347.13; // valor esperado do pagamento mensal

        double pagamentoMensal = Calculator.calcularPagamentoMensal(valorDoEmprestimo, taxaDeJurosAnual, prazoEmAnos);
        assertEquals(pagamentoEsperado, pagamentoMensal, 0.01); // Tolerância de 0.01 para lidar com imprecisões de cálculo
    }
}
