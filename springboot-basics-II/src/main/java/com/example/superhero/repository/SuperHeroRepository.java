package com.example.superhero.repository;

import com.example.superhero.model.SuperHero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperHeroRepository {

    List<SuperHero> superHeroList = new ArrayList<>();

    public SuperHeroRepository() {
        SuperHero superHero1 = new SuperHero(1L, "superman",
                "muy fuerte", true);
        SuperHero superHero2 = new SuperHero(2L, "batman",
                "baticinturon", true);

        // adding superHero to List
        this.superHeroList.add(superHero1);
        this.superHeroList.add(superHero2);
    }
    // CRUD: CREATE - READ - UPDATE - DELETE

    public String helloRepository() {
        return "Hello Repository!!!";
    }

    public List<SuperHero> getAll() {
        return this.superHeroList;
    }

    public SuperHero getById(Long id) {
        return this.superHeroList.get(id.intValue()-1);
    }

    public SuperHero create(SuperHero superHero) {
        this.superHeroList.add(superHero);
        return this.getById(Long.valueOf(superHeroList.size()));
    }
}
