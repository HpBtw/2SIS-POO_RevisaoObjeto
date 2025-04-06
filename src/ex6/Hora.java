package ex6;

public class Hora {
    int horas;
    int minutos;
    int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = validarHora(horas);
        this.minutos = validarMinSec(minutos);
        this.segundos = validarMinSec(segundos);
    }

    public int validarHora(int valido) {
        if (valido < 0 || valido > 24) {
            return 0;
        }
        return valido;
    }

    public int validarMinSec(int valido) {
        if (valido < 0 || valido > 59) {
            return 0;
        }
        return valido;
    }

    public String imprimirHorarioFormatado() {
        String aux = horas + ":" + minutos + ":" + segundos;

        return aux;
    }
}
