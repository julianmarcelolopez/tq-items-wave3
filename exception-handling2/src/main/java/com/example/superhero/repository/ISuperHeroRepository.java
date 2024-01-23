package com.example.superhero.repository;

import com.example.superhero.entity.SuperHero;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISuperHeroRepository extends JpaRepository<SuperHero, Integer> {

  List<SuperHero> findAllByActive(boolean active);

  Optional<SuperHero> findById(Integer id);

  Optional<SuperHero> findByIdAndActive(Integer id, boolean active);

  List<SuperHero> findByNameContainingIgnoreCase(String name);

  List<SuperHero> findByNameContainingIgnoreCaseAndActive(String name, boolean active);

  Optional<SuperHero> findByName(String name);

  Optional<SuperHero> findByNameAndActive(String name, boolean active);
}
