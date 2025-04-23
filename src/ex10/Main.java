package ex10;

public class Main {
    public static void main(String[] args) { // caso queira alterar os valores das retas do triângulo, altere na classe "Triangulo"
        Triangulo tr = new Triangulo();

        System.out.print("\nRetas do triângulo: " + tr.getDados());
        System.out.print("\nPerímetro: " + tr.calcPerimetro());
        System.out.print("\nSemiperímetro: " + tr.calcSemiPerimetro());
        System.out.print("\nX: " + tr.calcX());
        System.out.print("\nY: " + tr.calcY());
        System.out.print("\nCentróide: " + tr.calcCentroide());
        System.out.print("\nLambda: " + tr.calcLambda());
    }
}
