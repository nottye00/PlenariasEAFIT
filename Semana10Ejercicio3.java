import java.util.ArrayList;
import java.util.Random;

public class Semana10Ejercicio3 {
    public static void main(String[] args) {
        int[] arreglo = crearArreglo(10);
        ArrayList<Integer> lista = convertirArrEstatico(arreglo);
        imprimirArrDin(lista);
    }


    public static int[] crearArreglo(int n) {
        int[] arreglo = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(100);
        }
        return arreglo;
    }


    public static ArrayList<Integer> convertirArrEstatico(int[] arr) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int num : arr) {
            lista.add(num);
        }
        return lista;
    }


    public static void imprimirArrDin(ArrayList<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}