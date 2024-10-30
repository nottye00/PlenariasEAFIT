package Semana8;

import java.util.Scanner;
import java.util.Random;

public class Semana8Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa el número de filas : ");
        int n = scanner.nextInt();
        System.out.print("Ingresa el número de columnas : ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        int[] sumatoriaFilas = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(11);
            }
        }

        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            sumatoriaFilas[i] = sumaFila;
        }

        System.out.println("Matriz Original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSumatoria de cada fila:");
        for (int i = 0; i < n; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumatoriaFilas[i]);
        }

        scanner.close();
    }
}