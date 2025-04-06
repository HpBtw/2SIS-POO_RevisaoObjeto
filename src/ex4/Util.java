package ex4;

import java.util.Scanner;

public class Util {
    Temp temp = new Temp(0);

    public void entradaDados() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        temp.celsius = kb.nextDouble();
    }

    public double celsiusToFahrenheit() {
        return (temp.celsius * 9 / 5) + 32;
    }

    public double celsiusToKelvin() {
        return temp.celsius + 273;
    }
}
