package ex8;

import javax.swing.*;

import static java.lang.Double.parseDouble;

public class Equacao {
    double a;
    double b;
    double c;
    double delta;
    double x1;
    double x2;

    public Equacao(double a, double b, double c, double x) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void entradaDados() {
        a = parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de a: "));
        b = parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de b: "));
        c = parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de c: "));
    }

    public double calcularDelta() {
        return delta = Math.pow(b,2) - 4 * a * c;
    }

    public String calcularRaizes() {
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        return "x1 = " + x1 + "\nx2 = " + x2;
    }
}
