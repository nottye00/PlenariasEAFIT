package Semana7;

import java.util.Scanner;

public class Semana7Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = ((i + 1) * 2);
            System.out.print(arreglo[i] + "|");

        }

        System.out.println("");

        int reverse;


        for (int i = 0; i < n / 2; i++) {

            reverse = arreglo[i];
            arreglo[i] = arreglo[n - (i + 1)];
            arreglo[n - (i + 1)] = reverse;
        }

        for (int x : arreglo) {
            System.out.print(x + "|");
        }
    }
}
