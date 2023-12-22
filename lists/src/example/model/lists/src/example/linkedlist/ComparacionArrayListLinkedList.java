package example.model.lists.src.example.linkedlist;

import example.model.lists.src.example.model.Usuario;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ComparacionArrayListLinkedList {
    private static final int NUM_ELEMENTOS = 1000000;

    public static void main(String[] args) {
        System.out.println("Comparación entre ArrayList y LinkedList:\n");

        // Comparación con ArrayList
        System.out.println("ArrayList:");
        ArrayList<Usuario> arrayList = new ArrayList<>();

        // Medir tiempo para la inserción al principio
        long startTime = System.currentTimeMillis();
        for (int i = 0;
             i < NUM_ELEMENTOS;
             i++) {
            arrayList.add(0, new Usuario("Usuario" + i, i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo para inserción al principio: " + (endTime - startTime) + " ms");

        // Medir tiempo para la iteración hacia atrás
        startTime = System.currentTimeMillis();
        ListIterator<Usuario> listIterator =
                arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            Usuario usuario = listIterator.previous();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Tiempo para iteración hacia atrás: " + (endTime - startTime) + " ms\n");

        // Comparación con LinkedList
        System.out.println("LinkedList:");
        LinkedList<Usuario> linkedList = new LinkedList<>();

        // Medir tiempo para la inserción al principio
        startTime = System.currentTimeMillis();
        for (int i = 0;
             i < NUM_ELEMENTOS;
             i++) {
            linkedList.addFirst(new Usuario("Usuario" + i, i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Tiempo para inserción al principio: " + (endTime - startTime) + " ms");

        // Medir tiempo para la iteración hacia atrás
        startTime = System.currentTimeMillis();
        ListIterator<Usuario> listIteratorLinkedList =
                linkedList.listIterator(linkedList.size());
        while (listIteratorLinkedList.hasPrevious()) {
            Usuario usuario = listIteratorLinkedList.previous();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Tiempo para iteración hacia atrás: " + (endTime - startTime) + " ms");
    }
}
