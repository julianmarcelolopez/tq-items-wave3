package example.map;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

    public static void main(String[] args) {
        // Crear un diccionario (HashMap) que asocie nombres con edades
        Map<String, Integer> diccionarioEdades = new HashMap<>();

        // Agregar elementos al diccionario
        diccionarioEdades.put("Juan", 25);
        diccionarioEdades.put("María", 30);
        diccionarioEdades.put("Pedro", 22);

        // Acceder a un valor a través de la clave
        int edadMaria = diccionarioEdades.get("María");
        System.out.println("Edad de María: " + edadMaria);

        // Verificar si una clave está presente
        if (diccionarioEdades.containsKey("Juan")) {
            System.out.println("Juan está en el diccionario.");
        }

        // Iterar a través de las claves o valores
        for (String nombre : diccionarioEdades.keySet()) {
            System.out.println("Nombre: " + nombre + ", Edad: " + diccionarioEdades.get(nombre));
        }

        // Eliminar un elemento del diccionario
        diccionarioEdades.remove("Pedro");

        // Tamaño del diccionario
        int tamano = diccionarioEdades.size();
        System.out.println("Tamaño del diccionario después de eliminar a Pedro: " + tamano);
    }
}
