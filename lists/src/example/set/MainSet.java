package example.set;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        withoutOrder();
        withoutDuplicatedElements();
    }

    public static void withoutDuplicatedElements() {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("manzana");
        conjunto.add("banana");
        conjunto.add("manzana");  // Ignorado, ya que "manzana" ya está en el
        // conjunto
    }

    public static void withoutOrder() {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(8);

        System.out.println(numeros);
    }

    public static void basicOperations() {
        Set<String> colores = new HashSet<>();
        colores.add("rojo");
        colores.add("verde");
        colores.remove("rojo");
    }

    public static void OnlyOneNullInstance() {
        Set<String> nombres = new HashSet<>();
        nombres.add("Juan");
        nombres.add(null);
    }

    public static void showElements() {
        Set<Character> letras = new HashSet<>();
        letras.add('A');
        letras.add('B');
        letras.add('C');

        for (char letra : letras) {
            System.out.println(letra);
        }
    }

    public static void getSize() {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);

        int tamano = numeros.size();  // tamano será 2
    }

}
