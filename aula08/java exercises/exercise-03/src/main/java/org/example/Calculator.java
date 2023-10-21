package org.example;

public class Calculator {
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return num1 / num2;
    }

    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(num);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
