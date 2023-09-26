import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Quadrado(3));
        formas.add(new Circulo(6));
        formas.add(new Retangulo(2, 4));
        formas.add(new Triangulo(8, 7));
        formas.add(new Losango(3, 6));

        //metodo for each
        for (FormaGeometrica forma : formas) {
            System.out.println(forma.calcularArea());
        }
    }
}