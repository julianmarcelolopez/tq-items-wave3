package controller;

import model.Superheroe;
import service.SuperheroeService;

import java.util.List;
import java.util.Optional;

public class SuperheroeController {
    final SuperheroeService superheroeService = new SuperheroeService();

    static final String SUPERHEROE_REGISTRADO_OK_MSG = "Superhéroe registrado: ";
    static final String SUPERHEROE_REGISTRADO_ERROR_MSG = "Superhéroe no pudo ser registrado.";

    public void registrarSuperheroe(String nombre, String poder) {
        // Validaciones de datos de entrada.
        if (nombre.isEmpty() || poder.isEmpty()) {
            System.out.println(SUPERHEROE_REGISTRADO_ERROR_MSG + " - " + "Valores de entrada invalidos.");
        } else {
            Superheroe superheroe = new Superheroe();
            superheroe.setNombre(nombre);
            superheroe.setPoder(poder.trim());

            Superheroe superheroeGuardado = superheroeService.guardarSuperheroe(superheroe);

            if (superheroeGuardado == null)
                System.out.println(SUPERHEROE_REGISTRADO_ERROR_MSG);
            else
                System.out.println(SUPERHEROE_REGISTRADO_OK_MSG + superheroeGuardado);
        }
    }

    public void listarSuperheroes() {
        List<Superheroe> superheroes = superheroeService.obtenerTodos();
        System.out.println("Lista de Superhéroes:");
        for (Superheroe superheroe : superheroes) {
            System.out.println(superheroe);
        }
    }

    public void actualizarSuperheroe(Long id, String nuevoNombre,
                                     String nuevoPoder) {

        // Obtener ese superheroe -> Optional: envoltorio del objeto principal.
        Optional<Superheroe> superheroeOptional =
                superheroeService.obtenerPorId(id);
        if (superheroeOptional.isPresent()) {
            Superheroe superheroe = superheroeOptional.get();
            superheroe.setNombre(nuevoNombre);
            superheroe.setPoder(nuevoPoder);
            superheroeService.actualizarSuperheroe(superheroe);
            System.out.println("Superhéroe actualizado: " + superheroe);
        } else {
            System.out.println("Superhéroe no encontrado con ID: " + id);
        }
    }

    public void eliminarSuperheroe(Long id) {
        if (superheroeService.eliminarSuperheroe(id)) {
            System.out.println("Superhéroe eliminado con éxito. ID: " + id);
        } else {
            System.out.println("Superhéroe no encontrado con ID: " + id);
        }
    }

    public Superheroe obtenerSuperheroe(Long id) {
        return new Superheroe();
    }

    public String status() {
        return "OK";
    }
}