package ex5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Medidas m = new Medidas();
        String aux;

        m.metros = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os metros à serem convertidos: "));
        aux = "Para milhas: " + m.metrosParaMilhas();
        aux += "\nPara pés: " + m.metrosParaPes();

        JOptionPane.showMessageDialog(null, aux);

    }
}
