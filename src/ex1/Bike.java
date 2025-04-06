package ex1;

public class Bike {
    String cor;
    int numMarchas;
    double valor;

    public Bike (String cor, int numMarchas, double valor) {
        this.cor = cor;
        this.numMarchas = numMarchas;
        this.valor = valor;
    }

    public String retornarDados() {
        return "Cor: " + cor + "\t Num. de marchas: " + numMarchas + "\t Valor: " + valor;
    }
}