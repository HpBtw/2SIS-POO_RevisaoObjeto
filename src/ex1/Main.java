package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Bike bike = new Bike("", 0, 0);

        System.out.println("Informe a cor da bike: ");
        bike.cor = kb.nextLine();

        System.out.println("Informe a quantia de marchas da bike: ");
        bike.numMarchas = kb.nextInt();

        System.out.println("Informe o valor da bike: ");
        bike.valor = kb.nextDouble();

        System.out.println("Dados da bike: " + bike.retornarDados());

    }
}
