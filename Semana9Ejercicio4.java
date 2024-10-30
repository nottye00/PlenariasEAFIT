public class Semana9Ejercicio4 {
    public static void main(String[] args) {
        String str1 = "Esta es una prueba de string, que verifica donde esta un string";
        String str2 = "esta";
        String str3 = "string";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str3 = str3.toLowerCase();

        int posicionStr2 = str1.indexOf(str2);
        int posicionStr3 = str1.indexOf(str3);

        System.out.println("Posición de '" + str2 + "': " + (posicionStr2));
        System.out.println("Posición de '" + str3 + "': " + (posicionStr3));
    }
}