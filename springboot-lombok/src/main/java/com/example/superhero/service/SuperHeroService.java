package com.example.superhero.service;

import com.example.superhero.model.SuperHero;

import java.util.List;

public interface SuperHeroService {

    List<SuperHero> getAll();

    SuperHero create(SuperHero superHero);
}
