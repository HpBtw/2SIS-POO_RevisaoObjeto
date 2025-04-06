package ex6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Hora hr = new Hora(0, 0, 0);

        hr.horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora: "));
        hr.minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos: "));
        hr.segundos = Integer.parseInt(JOptionPane.showInputDialog("Digite os segundos: "));

        JOptionPane.showMessageDialog(null, hr.imprimirHorarioFormatado());
    }
}
