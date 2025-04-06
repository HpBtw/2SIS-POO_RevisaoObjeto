package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Retangulo retangulo = new Retangulo(0, 0, 0, 0);

        System.out.println("Informa a altura do retângulo: ");
        retangulo.altura = kb.nextDouble();

        System.out.println("Informa a largura do retângulo: ");
        retangulo.largura = kb.nextDouble();

        System.out.println("Area do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
