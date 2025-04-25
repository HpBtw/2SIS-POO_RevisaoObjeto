package ex11;

public class Professor {
    public String nome;
    public char diploma;
    public double salarioBase;
    public int serie;
    public double nmrAulaSemanal;
    public double valorDaHoraAula;

    public Professor(String nome, char diploma, double salariobase, int serie, double nmrAulaSemanal, double valorDaHoraAula) {
        this.nome = nome;
        this.diploma = diploma;
        this.salarioBase = salariobase;
        this.serie = serie;
        this.nmrAulaSemanal = nmrAulaSemanal;
        this.valorDaHoraAula = valorDaHoraAula;
    }
}
