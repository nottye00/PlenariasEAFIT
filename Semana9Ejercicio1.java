import java.util.Scanner;

public class Semana9Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un string: ");
        String texto = scanner.nextLine();

        System.out.print("Ingresa un carácter para contar: ");
        char caracter = scanner.next().charAt(0);

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en el string.");
        scanner.close();
    }
}
