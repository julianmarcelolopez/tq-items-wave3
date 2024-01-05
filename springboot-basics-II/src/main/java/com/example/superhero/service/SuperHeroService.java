package main.java.com.example.superhero.service;

import com.example.superhero.model.SuperHero;

import java.util.List;

public interface SuperHeroService {

    List<SuperHero> getAll();
    String helloService();

    String helloMyNameIs(String name);

    String helloRepository();

    SuperHero getById(Long id);

    SuperHero create(SuperHero superHero);
}
