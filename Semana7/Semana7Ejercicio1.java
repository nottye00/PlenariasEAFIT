package Semana7;

import java.util.Scanner;

public class Semana7Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de datos de su arreglo: ");
        int x = sc.nextInt();

        int[] num = new int[x];

        int dat;

        for (int y = 0; y < x; y++) {
            System.out.println("Valor para su arreglo: ");
            dat = sc.nextInt();

            num[y] = dat * 2;
        }

        System.out.println("");

        for (int t : num) {
            System.out.print(t * 3 + "|");
        }


    }
}

