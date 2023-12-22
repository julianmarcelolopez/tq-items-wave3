import controller.SuperheroeController;
import service.SuperheroeService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear instancia del controlador
        SuperheroeController superheroeController = new SuperheroeController();

        // Registrar superhéroes
        superheroeController.registrarSuperheroe("Superman", "VOLAR");
//        superheroeController.registrarSuperheroe("Spiderman", "Sentido " +
//                "arácnido");
//        superheroeController.registrarSuperheroe("", "super cinturon");
//        superheroeController.registrarSuperheroe("Iron Man", "Tecnología " +
//                "avanzada");

//        // Listar superhéroes
        superheroeController.listarSuperheroes();
//
//        // Actualizar superhéroe (supongamos que el ID 1 corresponde a
//        // Spiderman)
        superheroeController.actualizarSuperheroe(2L, "Spider-Man", "Fuerza y" +
                " telarañas");
//
//        // Listar superhéroes después de la actualización
        superheroeController.listarSuperheroes();
//
//        // Eliminar superhéroe (supongamos que el ID 2 corresponde a Iron Man)
//        superheroeController.eliminarSuperheroe(2L);
//
//        // Listar superhéroes después de la eliminación
//        superheroeController.listarSuperheroes();
    }
}