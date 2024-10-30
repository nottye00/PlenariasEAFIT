package Semana8;

import java.util.Random;
import java.util.Scanner;

public class Semana8Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese el tamaño de la matriz : ");
        int n = scanner.nextInt();

        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = matriz1 [i][j];
            }
        }

        System.out.println("Matriz Original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz2[j][i] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nDiagonal de la matriz Transpuesta: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz2[i][i] + "\t");
        }


    }
}
