package Semana8;

import java.util.Scanner;
import java.util.Random;

public class Semana8Ejercicio6 {
    public static int[][] matriz;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.print("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();
        matriz = new int[n][n];

        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Llenar toda la matriz con números pedidos al usuario");
            System.out.println("2. Llenar toda la matriz con números aleatorios");
            System.out.println("3. Imprimir la matriz");
            System.out.println("4. Suma de una fila específica");
            System.out.println("5. Suma de una columna específica");
            System.out.println("6. Suma de la diagonal principal");
            System.out.println("7. Suma de la diagonal secundaria");
            System.out.println("8. Suma de todos los valores de la matriz");
            System.out.println("9. Promedio de todos los valores de la matriz");
            System.out.println("10. Encontrar el valor máximo y su posición");
            System.out.println("11. Encontrar el valor mínimo y su posición");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> llenarMatrizManual();
                case 2 -> llenarMatrizAleatorio();
                case 3 -> imprimirMatriz();
                case 4 -> {
                    System.out.print("Ingrese el número de la fila: ");
                    int fila = scanner.nextInt();
                    System.out.println("Suma de la fila " + fila + ": " + sumaFila(fila));
                }
                case 5 -> {
                    System.out.print("Ingrese el número de la columna: ");
                    int columna = scanner.nextInt();
                    System.out.println("Suma de la columna " + columna + ": " + sumaColumna(columna));
                }
                case 6 -> System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal());
                case 7 -> System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria());
                case 8 -> System.out.println("Suma de todos los valores: " + sumaTodos());
                case 9 -> System.out.println("Promedio de todos los valores: " + promedioTodos());
                case 10 -> encontrarValorMaximo();
                case 11 -> encontrarValorMinimo();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void llenarMatrizManual() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para la posición (" + i + ", " + j + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void llenarMatrizAleatorio() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    public static void imprimirMatriz() {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    public static int sumaFila(int fila) {
        int suma = 0;
        for (int valor : matriz[fila]) {
            suma += valor;
        }
        return suma;
    }

    public static int sumaColumna(int columna) {
        int suma = 0;
        for (int[] fila : matriz) {
            suma += fila[columna];
        }
        return suma;
    }

    public static int sumaDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static int sumaDiagonalSecundaria() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }

    public static int sumaTodos() {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }

    public static double promedioTodos() {
        int totalElementos = matriz.length * matriz[0].length;
        return (double) sumaTodos() / totalElementos;
    }

    public static void encontrarValorMaximo() {
        int max = matriz[0][0];
        int fila = 0, columna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("Valor máximo: " + max + " en posición (" + fila + ", " + columna + ")");
    }

    public static void encontrarValorMinimo() {
        int min = matriz[0][0];
        int fila = 0, columna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("Valor mínimo: " + min + " en posición (" + fila + ", " + columna + ")");
    }
}