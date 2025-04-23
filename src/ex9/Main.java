package ex9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        Circulo circulo = new Circulo();

        String menu = "\n1. Alterar valor do raio\n2. Visualizar o valor do raio\n3. Calcular área\n4. Calcular perímetro\n5. Finalizar operação";
        int opcao = 0;

        do {
            System.out.println(menu);
            opcao = kb.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Insira o novo valor do raio: ");
                    double novoRaio = kb.nextDouble();
                    if (novoRaio <= 0)
                        System.out.println("Valor inválido!!");
                    else
                        circulo.alterarRaio(novoRaio);
                    break;
                case 2:
                    System.out.print("Raio: " + df.format(circulo.getRaio()));
                    break;
                case 3:
                    System.out.print("Área aproximada: " + df.format(circulo.calcularArea()));
                    break;
                case 4:
                    System.out.print("Perímetro aproximado: " + circulo.calcularPerimetro());
                    break;
                case 5:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 5);
    }
}
