public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        // A área do círculo é π * raio^2
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        // A circunferência do círculo é 2 * π * raio
        return 2 * Math.PI * raio;
    }
}
