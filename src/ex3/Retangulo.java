package ex3;

public class Retangulo {
    double altura;
    double largura;

    public Retangulo(double altura, double largura, double area, double perimetro) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
}

