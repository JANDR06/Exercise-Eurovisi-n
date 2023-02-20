package model;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Concurso {

    // ATRIBUTOS CONCURSO
    private static final String[][] datos = {
            {"España", "Blanca paloma"},
            {"Alemania", "Sin candidato"},
            {"Francia", "Almas Gemelas"},
            {"Italia", "La mia de mirama"},
            {"Reino Unido", "The block"},
            {"Ucrania", "The sufriment"},
            {"Azerbayan", "The List"},
            {"Croacia", "Parte XII"},
            {"Finlandia", "Caos"},
            {"Irlanda", "Wild tour"},
            {"Israel", "Comedia Star"},
            {"Armenia", "The last one"},
            {"Suiza", "Choclate and milk"},
            {"Belgica", "In one and two"}
    };

   private Set<Pais> paises;

   // CONSTRUCTOR
   public Concurso () {
       paises = new TreeSet<>();
       rellenarPaises();
   }

   // MÉTODO PARA RELLENAR LOS PAÍSES
   private void rellenarPaises () {

       for (String[] dato : datos) {
           paises.add(new Pais(dato[0], dato[1]));
       }

   }

    // MÉTODO PARA RELLENAR LOS PAÍSES
   public void votar () {
       for (Pais p : paises) {
           p.votar(paises);
       }

       for (Pais p : paises) {
           Map<Integer,Pais> votos = p.devolverVotos();
           for (Integer puntuacion : p.devolverVotos().keySet()) {
               Pais pais = votos.get(puntuacion);
               pais.recibirVoto(puntuacion,p);
           }
       }
   }

    // MÉTODO PARA OBTENER EL LISTADO DE PAÍSES POR SU PUNTUACIÓN
   public List<Pais> obtenerListadoPaisesPorPuntuacion () {

   }

    // MÉTODO PARA OBTENER EL LISTADO DE PAÍSES Y LA PUNTUACIÓN QUE HAN EMITIDO
   public Map<Pais, Map<Integer,Pais>> obtenerListadoPaisesYPuntuacionesEmitidas () {

   }

    // MÉTODO PARA OBTENER EL LISTADO DE PAÍSES ALFABETICAMENTE DE LOS CANTANTES
    public List<String> obtenerListadoPaisesAlfabeticoCantantes () {

    }

}
