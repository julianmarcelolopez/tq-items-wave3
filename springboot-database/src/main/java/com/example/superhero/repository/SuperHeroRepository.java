package com.example.superhero.repository;

import com.example.superhero.model.SuperHero;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperHeroRepository extends JpaRepository<SuperHero, Long> {

  List<SuperHero> findByName(String name);
}
