package Semana10;

import java.util.ArrayList;
import java.util.Random;

public class Semana10Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = crearArreglo(10);
        int[] arreglo = convertirArrDinamico(lista);
        imprimirArrEst(arreglo);
    }

    public static ArrayList<Integer> crearArreglo(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(100));
        }
        return lista;
    }

    public static int[] convertirArrDinamico(ArrayList<Integer> arr) {
        int[] arreglo = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arreglo[i] = arr.get(i);
        }
        return arreglo;
    }

    public static void imprimirArrEst(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}