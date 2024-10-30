import java.util.Scanner;

public class Semana7Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        float[] arreglo2 = new float[n];
        float[] arreglo05 = new float[(n / 2)];

        for (int i = 0; i < n; i++) {
            arreglo2[i] = ((i + 1) * 2);
            System.out.print(arreglo2[i] + "|");
        }

        System.out.println("");


        for (int j = 0; j < (n / 2); j++) {
            arreglo05[j] = (arreglo2[j * 2] + arreglo2[(j * 2) + 1]) / 2;

            System.out.print(arreglo05[j] + "|");
        }

    }
}
