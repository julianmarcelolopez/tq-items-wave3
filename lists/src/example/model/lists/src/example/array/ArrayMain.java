package example.model.lists.src.example.array;

import example.model.lists.src.example.model.Usuario;

public class ArrayMain {

    public static void main(String[] args) {
        // Crear un array de Superheroes
        Usuario[] usuarios = new Usuario[3];

        // Inicializar el array con objetos Superheroe
        usuarios[0] = new Usuario("Juan", 30);
        usuarios[1] = new Usuario("Pedro", 35);
        usuarios[2] = new Usuario("Maria", 28);

        // Imprimir detalles de cada superhéroe en el array
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        // Realizar algunas operaciones básicas
        usuarios[0].saltar();
        usuarios[1].saltar();
        usuarios[2].saltar();

        // Cambiar el nombre del tercer superhéroe
        usuarios[2].setNombre("Diana");

        // Imprimir detalles actualizados de cada superhéroe en el array
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
