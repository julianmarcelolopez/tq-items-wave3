package example.model.lists.src.example.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        // Declaración e inicialización de un array de cadenas
        String[] nombres = {"Alice", "Bob", "Charlie"};

        // Declaración e inicialización de un array de tipo Object (puede contener cualquier tipo)
        Object[] miscelaneo = {1, "Hola", 3.14, true};
        ///////////////////////////////////////////////////
        // Acceso a un elemento específico
        int primerNumero = numeros[0];

        // Modificación de un elemento
        numeros[1] = 42;
        ///////////////////////////////////////////////////
        // Iteración con un bucle for
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        // Iteración con un bucle for-each
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        //////////////////////////////////////////////////
        int longitud = numeros.length;
        System.out.println("La longitud del array es: " + longitud);
        //////////////////////////////////////////////////
        int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
        //////////////////////////////////////////////////
        // Búsqueda lineal
        int indice = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 42) {
                indice = i;
                break;
            }
        }
        System.out.println("El número 42 se encuentra en el índice: " + indice);
        ///////////////////////////////////////////////////
        // Ordenación ascendente
        Arrays.sort(numeros);

        // Ordenación descendente (requiere Java 8+)
        Arrays.sort(numeros);
    }
}
