package Semana14;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Leandro", "Cardona", 10278042, 2007);
        Persona p2 = new Persona("Kevin", "Jimenez", 1089378640, 2004);

        p1.imprimir();
        p2.imprimir();

        System.out.println("");

        ArregloPersonas.adicionar(p1);
        ArregloPersonas.imprimir();
        ArregloPersonas.buscarID(123431);
    }
}