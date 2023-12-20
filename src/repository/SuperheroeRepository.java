package repository;


import model.Superheroe;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SuperheroeRepository {
    private final List<Superheroe> superheroes;
    private Long idCounter = 1L;

    public SuperheroeRepository() {
        superheroes = new ArrayList<>();
    }
    public Superheroe guardarSuperheroe(Superheroe superheroe) {
        superheroe.setId(idCounter++);
        superheroes.add(superheroe);
        return superheroe;
    }

    public List<Superheroe> obtenerTodos() {
        return new ArrayList<>(superheroes);
    }

    public Optional<Superheroe> obtenerPorId(Long id) {
        return superheroes.stream()
                .filter(superheroe -> superheroe.getId().equals(id))
                .findFirst();
    }

    public void actualizarSuperheroe(Superheroe superheroeActualizado) {
        for (int i = 0;
             i < superheroes.size();
             i++) {
            if (superheroes.get(i).getId()
                    .equals(superheroeActualizado.getId())) {
                superheroes.set(i, superheroeActualizado);
                break;
            }
        }
    }

    public boolean eliminarSuperheroe(Long id) {
        return superheroes.removeIf(superheroe -> superheroe.getId()
                .equals(id));
    }
}