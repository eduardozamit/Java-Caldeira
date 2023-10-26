import org.example.OperacaoNumero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperacaoNumeroTest {

    private final OperacaoNumero operacaoNumero = new OperacaoNumero();

    @Test
    void testSomarNumeros() {
        int[] numeros = {1, 2, 3, 4, 5};
        assertEquals(15, operacaoNumero.somarNumeros(numeros));
        int[] numerosNegativos = {-1, -2, -3, -4, -5};
        assertEquals(-15, operacaoNumero.somarNumeros(numerosNegativos));
        int[] numerosVazios = {};
        assertEquals(0, operacaoNumero.somarNumeros(numerosVazios));
    }

    @Test
    void testEhPar() {
        assertTrue(operacaoNumero.ehPar(4));
        assertFalse(operacaoNumero.ehPar(5));
        assertTrue(operacaoNumero.ehPar(-2));
    }

    @Test
    void testCalcularFatorial() {
        assertEquals(120, operacaoNumero.calcularFatorial(5));
        assertEquals(1, operacaoNumero.calcularFatorial(0));
    }

    @Test
    void testEhPalindromo() {
        assertTrue(operacaoNumero.ehPalindromo("O lobo ama o bolo"));
        assertFalse(operacaoNumero.ehPalindromo("hello"));
    }

    @Test
    void testCalcularFibonacci() {
        assertEquals(5, operacaoNumero.calcularFibonacci(5));
        assertEquals(0, operacaoNumero.calcularFibonacci(0));
        assertEquals(1, operacaoNumero.calcularFibonacci(1));
        assertEquals(55, operacaoNumero.calcularFibonacci(10));
    }
}
