import java.util.Scanner;
import java.util.Scanner;

public class Semana7Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo par: ");
        int o = sc.nextInt();

        int[] par = new int[o];
        int[] invpar = new int[o];

        int i = 1;

        System.out.println();
        for (int x = 0; x < o; ) {

            if (i % 2 == 0) {
                par[x] = i;
                System.out.print(par[x] + "|");
                x++;
            }

            i++;
        }

        System.out.println("");
        System.out.println("arreglo inverso:");

        for (int y = 0; y < o; y++) {
            invpar[y] = par[(o - (y + 1))];
            System.out.print(invpar[y] + "|");
        }


    }
}
