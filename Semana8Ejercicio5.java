import java.util.Scanner;

public class Semana8Ejercicio5 {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static String[][] estudiantes;

    public static void main(String[] args) {
        System.out.print("Ingresa el número de estudiantes: ");
        n = scanner.nextInt();
        scanner.nextLine();

        estudiantes = new String[4][n];

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Leer datos de un estudiante");
            System.out.println("2. Pedir e imprimir datos de un estudiante");
            System.out.println("3. Imprimir número de estudiantes en un rango de edad");
            System.out.println("4. Imprimir todos los estudiantes");
            System.out.println("5. Imprimir estudiantes de un año determinado");
            System.out.println("6. Promedio de materias de todos los estudiantes");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> leerDatosEstudiante();
                case 2 -> imprimirDatosEstudiante();
                case 3 -> estudiantesEnRangoEdad();
                case 4 -> imprimirTodosEstudiantes();
                case 5 -> estudiantesDeUnAño();
                case 6 -> promedioMaterias();
                case 0 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }


    public static void leerDatosEstudiante() {
        System.out.print("Ingresa el índice del estudiante (0 a " + (n - 1) + "): ");
        int i = scanner.nextInt();
        scanner.nextLine();

        if (i >= 0 && i < n) {
            System.out.print("ID: ");
            estudiantes[0][i] = scanner.nextLine();
            System.out.print("Edad: ");
            estudiantes[1][i] = scanner.nextLine();
            System.out.print("Año de nacimiento: ");
            estudiantes[2][i] = scanner.nextLine();
            System.out.print("Número de materias: ");
            estudiantes[3][i] = scanner.nextLine();
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }


    public static void imprimirDatosEstudiante() {
        System.out.print("Ingresa el índice del estudiante (0 a " + (n - 1) + "): ");
        int i = scanner.nextInt();
        scanner.nextLine();

        if (i >= 0 && i < n) {
            System.out.println("ID: " + estudiantes[0][i]);
            System.out.println("Edad: " + estudiantes[1][i]);
            System.out.println("Año de nacimiento: " + estudiantes[2][i]);
            System.out.println("Número de materias: " + estudiantes[3][i]);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }


    public static void estudiantesEnRangoEdad() {
        System.out.print("Ingresa la edad mínima: ");
        int edadMin = scanner.nextInt();
        System.out.print("Ingresa la edad máxima: ");
        int edadMax = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i < n; i++) {
            int edad = Integer.parseInt(estudiantes[1][i]);
            if (edad >= edadMin && edad <= edadMax) {
                contador++;
            }
        }
        System.out.println("Número de estudiantes en el rango de edad: " + contador);
    }


    public static void imprimirTodosEstudiantes() {
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("ID: " + estudiantes[0][i]);
            System.out.println("Edad: " + estudiantes[1][i]);
            System.out.println("Año de nacimiento: " + estudiantes[2][i]);
            System.out.println("Número de materias: " + estudiantes[3][i]);
            System.out.println();
        }
    }


    public static void estudiantesDeUnAño() {
        System.out.print("Ingresa el año de nacimiento: ");
        String año = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < n; i++) {
            if (estudiantes[2][i].equals(año)) {
                System.out.println("ID: " + estudiantes[0][i]);
                System.out.println("Edad: " + estudiantes[1][i]);
                System.out.println("Número de materias: " + estudiantes[3][i]);
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron estudiantes de ese año.");
        }
    }


    public static void promedioMaterias() {
        int sumaMaterias = 0;
        int contador = 0;

        for (int i = 0; i < n; i++) {
            sumaMaterias += Integer.parseInt(estudiantes[3][i]);
            contador++;
        }

        double promedio = (double) sumaMaterias / contador;
        System.out.println("Promedio de materias: " + promedio);
    }
}