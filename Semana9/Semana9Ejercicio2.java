package Semana9;

import java.util.Scanner;

public class Semana9Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un string: ");
        String texto = scanner.nextLine();

        StringBuilder textoReverso = new StringBuilder(texto);
        System.out.println("String al revés: " + textoReverso.reverse().toString());

        scanner.close();
    }
}