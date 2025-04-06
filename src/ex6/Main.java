package ex6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora: "));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos: "));
        int segundos = Integer.parseInt(JOptionPane.showInputDialog("Digite os segundos: "));

        Hora hr = new Hora(horas, minutos, segundos);

        JOptionPane.showMessageDialog(null, hr.imprimirHorarioFormatado());
    }
}
