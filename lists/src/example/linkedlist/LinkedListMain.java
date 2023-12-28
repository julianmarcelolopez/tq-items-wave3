package example.linkedlist;

import example.model.Usuario;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        // Crear una LinkedList de Usuarios
        LinkedList<Usuario> listaUsuarios = new LinkedList<>();

        // Agregar Usuarios
        listaUsuarios.add(new Usuario("Alice", 25));
        listaUsuarios.add(new Usuario("Bob", 30));
        listaUsuarios.add(new Usuario("Charlie", 22));

        // Imprimir la lista
        System.out.println("Lista de Usuarios (LinkedList):");
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }

        // Obtener un Usuario por índice
        Usuario primerUsuario = listaUsuarios.get(0);
        System.out.println("\nPrimer Usuario: " + primerUsuario);

        // Verificar si la lista contiene un Usuario específico
        Usuario usuarioBuscado = new Usuario("Bob", 30);
        System.out.println("\n¿Contiene a Bob? " + listaUsuarios.contains(usuarioBuscado));

        // Eliminar un Usuario por índice
        listaUsuarios.remove(1);
        System.out.println("\nLista después de eliminar el segundo Usuario:");
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }
}
