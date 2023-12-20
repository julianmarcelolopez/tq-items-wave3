package service;

import model.Superheroe;
import repository.SuperheroeRepository;

import java.util.List;
import java.util.Optional;

public class SuperheroeService {
    private final SuperheroeRepository superheroeRepository =
            new SuperheroeRepository();

    public Superheroe guardarSuperheroe(Superheroe superheroe) {
        // Validan las REGLAS NEGOCIO:
        // Los poderes tienen que ser poderes validados en el Registro de Poderes:
        // - volar
        // - fuerza

        if (!superheroe.getPoder().equalsIgnoreCase("VOLAR") && !superheroe.getPoder().equals("fuerza")) {
            System.out.println("Poder no valido.");
        } else
            return superheroeRepository.guardarSuperheroe(superheroe);
        return null;
    }

    public List<Superheroe> obtenerTodos() {
        return superheroeRepository.obtenerTodos();
    }

    public Optional<Superheroe> obtenerPorId(Long id) {
        return superheroeRepository.obtenerPorId(id);
    }

    public void actualizarSuperheroe(Superheroe superheroe) {
        superheroeRepository.actualizarSuperheroe(superheroe);
    }

    public boolean eliminarSuperheroe(Long id) {
        return superheroeRepository.eliminarSuperheroe(id);
    }
}