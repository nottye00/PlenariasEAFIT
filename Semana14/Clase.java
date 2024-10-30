package Semana14;

import java.util.ArrayList;
import java.util.Date;

public class Clase {
    private int codigoMateria;
    private String nombreMateria;
    private Date fechaInicio;
    private Date fechaFin;
    private String horario;
    private int horasTotal;
    private int horasSemana;

    private Profesor profesor;
    private ArrayList<Estudiante> alumnos;
    // Constructor
    public Clase(int codigoMateria, String nombreMateria, Date fechaInicio, Date fechaFin, String horario, int horasTotal, int horasSemana, Profesor profesor) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horario = horario;
        this.horasTotal = horasTotal;
        this.horasSemana = horasSemana;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>(30);

        profesor.agregarClase(this);
    }


    public int getCodigo() {
        return codigoMateria;
    }

    public void setCodigo(int codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombre() {
        return nombreMateria;
    }

    public void setNombre(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getHorasTotal() {
        return horasTotal;
    }

    public void setHorasTotal(int horasTotal) {
        this.horasTotal = horasTotal;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getAlumnos() {
        return alumnos;
    }


    public boolean agregarAlumno(Estudiante alumno) {
        if (alumnos.size() < 30) {
            alumnos.add(alumno);
            alumno.agregarClase(this);
            return true;
        } else {
            System.out.println("El curso ha alcanzado el número máximo de alumnos.");
            return false;
        }
    }

    public void imprimirListaAlumnos() {
        System.out.print("Lista de alumnos de la clase " + nombreMateria + ": ");
        for (Estudiante alumno : alumnos) {
            System.out.print(alumno.getNombre() + " " + alumno.getApellidos() + " |-| ");
        }
    }

    // Método para imprimir los datos del profesor
    public void imprimirDatosProfesor() {
        System.out.println("Semana14.Profesor de la clase " + nombreMateria + ":");
        System.out.println("Nombre: " + profesor.getNombre() + " " + profesor.getApellidos());
        System.out.println("Documento: " + profesor.getDocumentoIdentificacion());
        System.out.println("ID Universidad: " + profesor.getIdentificacionUniversidad());
        System.out.println("Email: " + profesor.getEmail());
    }

    public void imprimirInfo(){
        System.out.println("Nombre de la Semana14.Clase: "+nombreMateria);
        System.out.println("Codigo: "+codigoMateria);
        System.out.println("Fecha de inicio: "+fechaInicio);
        System.out.println("Fecha final: "+fechaFin);
        System.out.println("Horario: " + horario);
        System.out.println("Catidad de horas totales: "+horasTotal);
        System.out.println("Horas semanales: "+horasSemana);
    }

    public void imprimirIntegrantes(){
        System.out.println("Semana14.Profesor de la clase: " + getProfesor().getNombre() + " " + getProfesor().getApellidos());
        imprimirListaAlumnos();
    }
}