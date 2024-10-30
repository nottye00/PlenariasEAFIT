package Semana14;

public class Persona {
    String nombre;
    String apellido;
    int identidad;
    int nacimiento;

    public Persona(String nombre, String apellido, int identidad, int nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.identidad = identidad;
        this.nacimiento = nacimiento;
    }


    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setApellido(String apellido){
        this.apellido = apellido;
    }

    void setID(int identidad){
        this.identidad = identidad;
    }

    void setAnio(int nacimiento){
        this.nacimiento = nacimiento;
    }


    String getNombre(){
        return this.nombre;
    }

    String getApellido(){
        return this.apellido;
    }

    int getID(){
        return this.identidad;
    }

    int getAnio(){
        return this.nacimiento;
    }

    void imprimir(){
        System.out.print("\nMi nombre es " + getNombre() + " " + getApellido() + ",");
        System.out.print(" con identificacion: " + getID() + ",");
        System.out.print(" nacido en " + getAnio());
    }
}