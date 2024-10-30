package Semana14;

import java.util.Date;

public class MainClase {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("David", "Suarez", 12123, 111, "davis02@eafit.co");
        Profesor p2 = new Profesor("Emilia", "Martinez", 68943214, 112, "emiliamar12@eafit.co");
        Profesor p3 = new Profesor("Rene", "Zuluaga", 5832217, 113, "renezga@eafit.co");

        Estudiante e1 = new Estudiante("Jose", "Perez", 1123, 5209, "joseprz2@eafit.co", "Negocios Internacionales");
        Estudiante e2 = new Estudiante("Mariana", "Gomez", 2234, 5210, "mariana.gomez@eafit.co", "Ingeniería de Sistemas");
        Estudiante e3 = new Estudiante("Luis", "Rodriguez", 3345, 5211, "luis.rodriguez@eafit.co", "Derecho");

        Clase clase1 = new Clase(101, "Matemáticas", new Date(2023, 1, 10), new Date(2023, 5, 20), "Lunes y Miércoles 8-10 AM", 100, 4, p1);
        Clase clase2 = new Clase(102, "Física", new Date(2023, 2, 1), new Date(2023, 6, 15), "Martes y Jueves 10-12 AM", 120, 5, p2);
        Clase clase3 = new Clase(103, "Historia", new Date(2023, 1, 15), new Date(2023, 5, 25), "Viernes 2-5 PM", 80, 3, p3);

        clase1.agregarAlumno(e1);
        clase1.agregarAlumno(e2);
        clase1.agregarAlumno(e3);

        clase2.agregarAlumno(e1);
        clase2.agregarAlumno(e2);
        clase2.agregarAlumno(e3);

        clase3.agregarAlumno(e1);
        clase3.agregarAlumno(e3);

        p1.imprimirClases();
        System.out.println("");

        e1.imprimirClases();
        System.out.println("");
        e2.imprimirClases();
        System.out.println("");

        clase1.imprimirInfo();
        clase1.imprimirIntegrantes();
        System.out.println("");
    }
}