package Semana14;

public class PersonaJuridica extends Persona {
    private String nit;

    public PersonaJuridica(String nombre, String apellido, int identidad, int nacimiento, String nit) {
        super(nombre, apellido, identidad, nacimiento);
        this.nit = nit;
    }
}