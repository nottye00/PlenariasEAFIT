package Semana9;

import java.util.Scanner;

public class Semana9Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un string: ");
        String string1 = scanner.nextLine();


        String resultado = procesarString(string1);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }


    public static String procesarString(String string1) {
        int longitud = string1.length();

        if (longitud % 2 == 0) {
            char primero = string1.charAt(0);
            char ultimo = string1.charAt(longitud - 1);
            return "" + primero + ultimo;
        } else {
            char primero = string1.charAt(0);
            char medio = string1.charAt(longitud / 2);
            char ultimo = string1.charAt(longitud - 1);
            return "" + primero + medio + ultimo;
        }
    }
}