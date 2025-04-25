package ex11;

import javax.swing.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Util {
    Professor[] professor = new Professor[3];

    public void dados() {
        for (int i = 0; i < professor.length; i++) {
            String nome = showInputDialog("Insira o nome do professor '" + (i+1) + "'");
            String temp = showInputDialog("Insira o tipo de diploma do professor '" + (i+1) + "' ('m' para mestre, 'd' para doutor, 'p' para professor regular)");
            char diploma = temp.charAt(0);
            int serie = parseInt(showInputDialog("O professor '" + nome + "' dá aula para qual série? (1 para 1° série, 2 para 2° série"));
            double nmrAulaSemanal = parseDouble(showInputDialog("Insira a quantia de aulas semanais do(a) professor(a) '" + nome + "'"));
            double valorDaHoraAula = parseDouble(showInputDialog("Insira o valor da hora-aula do(a) professor(a) '" + (i+1) + "'"));

        }
    }
}
