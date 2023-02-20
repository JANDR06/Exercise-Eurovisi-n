package model;

import java.util.*;

public class Pais {

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

    }

    // MÉTODO PARA EMITIR UN VOTO
    public Map<Integer,Pais> emitirVoto () { return puntuacionEmitida; }



}
