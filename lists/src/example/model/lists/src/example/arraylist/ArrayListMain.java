package example.model.lists.src.example.arraylist;

import example.model.lists.src.example.model.Usuario;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        // Crear un ArrayList de Usuarios
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        // Agregar Usuarios
        listaUsuarios.add(new Usuario("Alice", 25));
        listaUsuarios.add(new Usuario("Bob", 30));
        listaUsuarios.add(new Usuario("Charlie", 22));

        // Imprimir la lista
        System.out.println("Lista de Usuarios:");
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
