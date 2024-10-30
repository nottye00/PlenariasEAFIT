import java.util.Scanner;

public class Semana9Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un string: ");
        String texto = scanner.nextLine();


        StringBuilder textoInvertido = new StringBuilder(texto);
        String textoReverso = textoInvertido.reverse().toString();


        System.out.println("String al revés: " + textoReverso);

        scanner.close();
    }
}