package ex7.domain;

public class Bola {
    private String cor;
    private double raio;

    public Bola(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public Bola maiorBola(Bola bola2, Bola bola3) {
        Bola aux = this;
        if (bola2.raio > bola3.raio && bola2.raio > this.raio) {
            aux = bola2;
        }
        else if (bola3.raio > bola2.raio && bola3.raio > this.raio) {
            aux = bola3;
        }
        return aux;
    }

    public String retornarDados() {
        return cor + " " + raio;
    }
}
