package org.example;

import static org.example.Calculator.calcularPagamentoMensal;

public class Main {
    public static void main(String[] args) {
        double valorDoEmprestimo = 200000; // exemplo de valor do empréstimo
        double taxaDeJurosAnual = 2; // exemplo de taxa de juros anual
        int prazoEmAnos = 10; // exemplo de prazo em anos

        double pagamentoMensal = calcularPagamentoMensal(valorDoEmprestimo, taxaDeJurosAnual, prazoEmAnos);
        System.out.println("O pagamento mensal é: " + pagamentoMensal);
    }
}