package ex4;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();

        util.entradaDados();

        System.out.println("Convertida em Fahrenheit: " + util.celsiusToFahrenheit());
        System.out.println("Convertida em Kelvin: " + util.celsiusToKelvin());
    }
}
