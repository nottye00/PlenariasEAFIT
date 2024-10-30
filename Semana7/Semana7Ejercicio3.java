package Semana7;

import java.util.Scanner;

public class Semana7Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] arr_int = new int[n];
        int[] inv = new int[n];

        System.out.println();

        int data;

        for (int x = 0; x < n; x++) {
            System.out.print("Valor n°" + (x + 1) + " para su arreglo: ");
            data = sc.nextInt();

            arr_int[x] = data;
            System.out.println("");
        }

        for (int x : arr_int) {
            System.out.print(x + "|");
        }


        System.out.println("");
        System.out.println("arreglo inverso:");

        for (int y = 0; y < n; y++) {
            inv[y] = arr_int[(n - (y + 1))];
            System.out.print(inv[y] + "|");
        }


    }
}
