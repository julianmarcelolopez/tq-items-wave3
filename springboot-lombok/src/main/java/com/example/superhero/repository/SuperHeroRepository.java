package com.example.superhero.repository;

import com.example.superhero.model.SuperHero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperHeroRepository {

    private List<SuperHero> superHeroList;

    public SuperHeroRepository() {
        superHeroList = new ArrayList<>();
        precarga();
    }

    private void precarga() {
        SuperHero s1 = new SuperHero(1L, "SpiderMan", "Sentido arácnido", false);
        SuperHero s2 = new SuperHero(2L, "Superman", "fuerza", false);

        this.superHeroList.add(s1);
        this.superHeroList.add(s2);
    }

    public List<SuperHero> getAll() {
        return this.superHeroList;
    }
}
