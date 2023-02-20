package model;

import java.util.*;

public class Pais implements Comparable {

    // ATRIBUTOS PAIS
    private static final int[] PUNTOS = {1,2,3,4,5,6,7,8,9,10,12};
    private String nombre;
    private String cantante;

    Map<Pais,Integer> puntuacionRecibida;
    Map<Integer,Pais> puntuacionEmitida;

    // CONSTRUCTOR
    public Pais (String nombre, String cantante) {
        this.nombre = nombre;
        this.cantante = cantante;
        puntuacionRecibida = new HashMap<>();
        puntuacionEmitida = new TreeMap<>();
    }

    // MÉTODO PARA RECIBIR VOTO
    public void recibirVoto (Integer puntuacion, Pais pais) {
        puntuacionRecibida.put(pais,puntuacion);
    }

    // MÉTODO PARA VOTAR
    public void votar (Set<Pais> paises) {
        List<Pais> paisList = new ArrayList<>(paises);
        Collections.shuffle(paisList);

        for (int punto : PUNTOS) {
           puntuacionEmitida.put(punto,paisList.remove(0));
        }
    }

    // MÉTODO PARA OBTENER LA PUNTUACIÓN RECIBIDA
    public int obtenerPuntuacion () {
        int suma = 0;

        for (Integer punto : puntuacionRecibida.values()) {
            suma += punto;
        }

        return suma;
    }

    // MÉTODO PARA EMITIR UN VOTO
    public Map<Integer,Pais> emitirVoto () { return puntuacionEmitida; }

    // MÉTODO COMPARABLE
    @Override
    public int compareTo (Pais o) {
        return nombre.compareToIgnoreCase(o.nombre);
    }

    // TO STRING
    @Override
    public String toString () {
        return
    }
}
