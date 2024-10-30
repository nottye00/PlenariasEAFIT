package Semana12;

import java.util.Scanner;

public class Semana12Ejercicio3 {

    static int num = 0;
    static int n = 1000;
    static int[] arreglo = new int[n];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1: Agregar elemento");
            System.out.println("2: Borrar elemento");
            System.out.println("3: Imprimir arreglo");
            System.out.println("0: Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    int elemento = scanner.nextInt();
                    agregarElemento(elemento);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a borrar: ");
                    elemento = scanner.nextInt();
                    borrarElemento(elemento);
                    break;
                case 3:
                    imprimirArreglo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void agregarElemento(int valor) {
        int i = num - 1;
        while (i >= 0 && arreglo[i] > valor) {
            arreglo[i + 1] = arreglo[i];
            i--;
        }
        arreglo[i + 1] = valor;
        num++;
        System.out.println("Elemento agregado.");
    }

    public static void borrarElemento(int valor) {
        int indice = busquedaLineal(valor);
        if (indice != -1) {
            for (int i = indice; i < num - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
            num--;
            System.out.println("Elemento borrado.");
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    public static void imprimirArreglo() {
        System.out.print("Arreglo: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static int busquedaLineal(int valor) {
        for (int i = 0; i < num; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}