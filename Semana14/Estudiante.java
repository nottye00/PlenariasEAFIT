package Semana14;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private int documentoIdentificacion;
    private int identificacionUniversidad;
    private String email;
    private String carrera;
    private Clase[] clases;
    private int totalClases;


    public Estudiante(String nombre, String apellidos, int documentoIdentificacion, int identificacionUniversidad, String email, String carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documentoIdentificacion = documentoIdentificacion;
        this.identificacionUniversidad = identificacionUniversidad;
        this.email = email;
        this.carrera = carrera;
        this.clases = new Clase[7];
        this.totalClases = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(int documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public int getIdentificacionUniversidad() {
        return identificacionUniversidad;
    }

    public void setIdentificacionUniversidad(int identificacionUniversidad) {
        this.identificacionUniversidad = identificacionUniversidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Clase[] getClases() {
        return clases;
    }

    public boolean agregarClase(Clase clase) {
        if (totalClases < 7) {
            clases[totalClases] = clase;
            totalClases++;
            return true;
        } else {
            System.out.println("No se pueden asignar más de 7 clases a este estudiante.");
            return false;
        }
    }

    public void imprimirClases() {
        System.out.println("Clases del Semana14.Estudiante " + nombre + " " + apellidos + ":");
        for (int i = 0; i < totalClases; i++) {
            System.out.println("Código: " + clases[i].getCodigo() + ", Nombre: " + clases[i].getNombre());
        }
    }
}