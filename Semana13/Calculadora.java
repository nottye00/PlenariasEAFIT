package Semana13;

public class Calculadora {

    private double memoria;


    public Calculadora() {
        this.memoria = 0.0;
    }


    public double obtenerMemoria() {
        return this.memoria;
    }


    public void iniciarMemoria() {
        this.memoria = 0.0;
    }


    public double sumar(double a, double b) {
        double resultado = a + b;
        this.memoria += resultado;
        return resultado;
    }


    public double restar(double a, double b) {
        double resultado = a - b;
        this.memoria += resultado;
        return resultado;
    }


    public double multiplicar(double a, double b) {
        double resultado = a * b;
        this.memoria += resultado;
        return resultado;
    }


    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero no permitida.");
            return 0;
        }
        double resultado = a / b;
        this.memoria += resultado;
        return resultado;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Memoria inicial: " + calc.obtenerMemoria());

        double suma = calc.sumar(10, 5);
        System.out.println("Suma: " + suma);
        System.out.println("Memoria después de sumar: " + calc.obtenerMemoria());

        double resta = calc.restar(10, 5);
        System.out.println("Resta: " + resta);
        System.out.println("Memoria después de restar: " + calc.obtenerMemoria());

        double multiplicacion = calc.multiplicar(10, 5);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Memoria después de multiplicar: " + calc.obtenerMemoria());

        double division = calc.dividir(10, 5);
        System.out.println("División: " + division);
        System.out.println("Memoria después de dividir: " + calc.obtenerMemoria());

        calc.iniciarMemoria();
        System.out.println("Memoria después de reiniciar: " + calc.obtenerMemoria());
    }
}