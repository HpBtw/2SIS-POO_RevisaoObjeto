package ex10;

public class Triangulo {
    public double a = 5;
    public double b = 5;
    public double c = 5;

    public String getDados() {
        return "A = " + this.a + "\nB = " + this.b + "\nC = " + this.c;
    }

    public double calcCentroide() { // = p( p − a)( p − b)( p − c)
        double p = calcSemiPerimetro();
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public double calcSemiPerimetro() {
        return calcPerimetro()/2;
    }

    public double calcPerimetro() {
        return this.a + this.b + this.c;
    }

    public double calcLambda() {
        return (this.a * this.a + this.b * this.b - this.c * this.c) / (2 * this.a * this.b);
    }

    public double calcX() {
        return (this.b + this.a * calcLambda()) / 3;
    }

    public double calcY() {
        return (this.a / 3) * Math.sqrt(1 - Math.pow(calcLambda(), 2));
    }
}
