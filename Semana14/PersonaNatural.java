package Semana14;

public class PersonaNatural extends Persona {
    private String id;

    public PersonaNatural(String nombre, String apellido, int identidad, int nacimiento, String id) {
        super(nombre, apellido, identidad, nacimiento);
        this.id = id;
    }

}