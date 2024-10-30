package Semana10;

import java.util.ArrayList;
import java.util.Iterator;

public class Semana10Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Leandro");
        nombres.add("Juan");
        nombres.add("Daniel");

        Iterator<String> iterador = nombres.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
