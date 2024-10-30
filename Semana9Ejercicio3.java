import java.util.Scanner;

public class Semana9Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer string: ");
        String str1 = scanner.nextLine();

        System.out.print("Ingresa el segundo string: ");
        String str2 = scanner.nextLine();

        if (str1.contains(str2)) {
            System.out.println("El segundo string es un substring del primero.");
        } else {
            System.out.println("El segundo string no es un substring del primero.");
        }

        if (str1.length() > str2.length()) {
            System.out.println("El tamaño de str1 es mayor que el de str2.");
        } else {
            System.out.println("El tamaño de str1 no es mayor que el de str2.");
        }

        scanner.close();
    }
}