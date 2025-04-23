package ex9;

public class Circulo {
    private double raio;

    public void alterarRaio(double novoRaio) {
        this.raio = novoRaio;
    }

    public double getRaio() { return this.raio; }

    public double calcularArea() {
        return Math.PI * (this.raio * this.raio);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}
