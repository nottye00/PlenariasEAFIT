package Semana14;

import java.util.ArrayList;

public class ArregloPersonas {
    static Persona[] arreglo = new Persona[10];

    static void adicionar(Persona p1){
        int n = arreglo.length;

        boolean sePudo = false;
        for(int i = 0; i<n; i++){
            if(arreglo[i] == null){
                arreglo[i] = p1;
                sePudo = true;
                break;
            }
        }

        if(!sePudo){
            System.out.println("No hay espacio suficiente en el arreglo");
        }
    }

    static Persona buscarID(int id){
        int n = arreglo.length;

        boolean encontro = false;
        for(int i = 0; i<n; i++){
            if(arreglo[i] != null){
                if(arreglo[i].getID() == id){
                    encontro = true;
                    return arreglo[i];
                }
            }
        }

        if(!encontro){
            System.out.println("No se encontro la persona con el id " + id);
        }
        return null;
    }

    static ArrayList<Persona> buscarAnio(int nacimiento){
        int n = arreglo.length;

        ArrayList<Persona> anio = new ArrayList<>();
        boolean encontro = false;
        for(int i = 0; i<n; i++){
            if(arreglo[i] != null){
                if(arreglo[i].getAnio() == nacimiento){
                    encontro = true;
                    anio.add(arreglo[i]);
                }
            }
        }

        if(encontro){
            return anio;
        }

        return null;
    }

    static void imprimir(){
        int n = arreglo.length;

        boolean existen = false;

        for(int i = 0; i<n;i++){
            if(arreglo[i] != null){
                arreglo[i].imprimir();
                existen = true;
            }
        }
        System.out.println("");

        if(!existen){
            System.out.println("No se encontraron personas en la lista");
        }
    }
}