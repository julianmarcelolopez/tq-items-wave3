import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto User
        User user = new User("John Doe", 30);

        // Guardar el objeto en un archivo
        String filename = "user.ser";
        try {
            UserRepository.save(user, filename);
            System.out.println("Objeto User guardado en " + filename);
        } catch (IOException e) {
            System.err.println("Error al guardar el objeto: " + e.getMessage());
        }

        // Cargar el objeto desde el archivo
        try {
            User userCargado = (User) UserRepository.get(filename);
            System.out.println("Objeto User cargado: " + userCargado);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar el objeto: " + e.getMessage());
        }
    }
}