package repository;


import model.Superheroe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class SuperheroeRepository {
    private final List<Superheroe> superheroeList;
    private Long idCounter = 1L;

    public SuperheroeRepository() {
        superheroeList = new LinkedList<>();
    }
    public Superheroe guardarSuperheroe(Superheroe superheroe) {
        superheroe.setId(idCounter++);
        superheroeList.add(superheroe);
        return superheroe;
    }

    public List<Superheroe> obtenerTodos() {
        return new ArrayList<>(superheroeList);
    }

    public Optional<Superheroe> obtenerPorId(Long id) {
        return superheroeList.stream()
                .filter(superheroe -> superheroe.getId().equals(id))
                .findFirst();
    }

    public void actualizarSuperheroe(Superheroe superheroeActualizado) {
        for (int i = 0;
             i < superheroeList.size();
             i++) {
            if (superheroeList.get(i).getId()
                    .equals(superheroeActualizado.getId())) {
                superheroeList.set(i, superheroeActualizado);
                break;
            }
        }
    }

    public boolean eliminarSuperheroe(Long id) {
        return superheroeList.removeIf(superheroe -> superheroe.getId()
                .equals(id));
    }
}