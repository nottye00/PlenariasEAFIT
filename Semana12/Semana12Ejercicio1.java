package Semana12;

public class Semana12Ejercicio1 {

    static String[] palabras = {"hola", "papa", "eafit"};
    static char[][] sopa = {
            {'h', 'o', 'l', 'a'},
            {'p', 'a', 'p', 'a'},
            {'e', 'a', 'f', 'i'},
            {'t', 'o', 'p', 'e'}
    };

    public static void main(String[] args) {
        int pasos = 0;

        for (String palabra : palabras) {
            boolean encontrada = buscarPalabra(palabra);
            if (encontrada) {
                System.out.println("Palabra encontrada: " + palabra);
            } else {
                System.out.println("Palabra no encontrada: " + palabra);
            }
            pasos++;
        }

        System.out.println("Número de pasos ejecutados: " + pasos);
    }

    public static boolean buscarPalabra(String palabra) {
        return false;
    }
}