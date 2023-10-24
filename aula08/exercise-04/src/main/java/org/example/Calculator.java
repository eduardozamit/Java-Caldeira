package org.example;

public class Calculator {
    public static double calcularPagamentoMensal(double valorDoEmprestimo, double taxaDeJurosAnual, int prazoEmAnos) {
        double taxaDeJurosMensal = (taxaDeJurosAnual / 100) / 12;
        int prazoEmMeses = prazoEmAnos * 12;
        double pagamentoMensal;

        pagamentoMensal = valorDoEmprestimo * (taxaDeJurosMensal * Math.pow(1 + taxaDeJurosMensal, prazoEmMeses))
                / (Math.pow(1 + taxaDeJurosMensal, prazoEmMeses) - 1);

        return pagamentoMensal;
    }
}
