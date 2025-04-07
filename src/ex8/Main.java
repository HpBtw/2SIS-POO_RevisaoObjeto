package ex8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Equacao eq = new Equacao(0, 0, 0, 0);

        eq.entradaDados();

        JOptionPane.showMessageDialog(null, "Delta = " + eq.calcularDelta() + "\nRaizes:\n" + eq.calcularRaizes());
    }
}
