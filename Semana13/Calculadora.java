package Semana13;

public class Calculadora {
    private float memoria;


    public Calculadora() {
        this.memoria = 0;
    }

    float obtenerMemoria() {
        return this.memoria;
    }

    void iniciarMemoria() {
        this.memoria = 0;
    }

    float sumar(float a, float b) {
        float resultado = a + b;
        this.memoria += resultado;

        return resultado;
    }
}
