package Semana14;

public class Profesor {
    private String nombre;
    private String apellidos;
    private int documentoIdentificacion;
    private int identificacionUniversidad;
    private String email;
    private Clase[] clases;
    private int totalClases;


    public Profesor(String nombre, String apellidos, int documentoIdentificacion, int identificacionUniversidad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documentoIdentificacion = documentoIdentificacion;
        this.identificacionUniversidad = identificacionUniversidad;
        this.email = email;
        this.clases = new Clase[5];
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

    public Clase[] getClases() {
        return clases;
    }

    public boolean agregarClase(Clase clase) {
        if (totalClases < 5) {
            clases[totalClases] = clase;
            totalClases++;
            return true;
        } else {
            System.out.println("No se pueden asignar más de 5 clases a este profesor.");
            return false;
        }
    }

    public void imprimirClases() {
        System.out.println("Clases del Semana14.Profesor " + nombre + " " + apellidos + ":");
        for (int i = 0; i < totalClases; i++) {
            System.out.println("Código: " + clases[i].getCodigo() + ", Nombre: " + clases[i].getNombre());
        }
    }
}