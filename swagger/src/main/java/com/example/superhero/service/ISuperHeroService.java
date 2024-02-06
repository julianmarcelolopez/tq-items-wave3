package com.example.superhero.service;
import com.example.superhero.entity.SuperHero;

import java.util.List;

public interface ISuperHeroService {

  List<SuperHero> findAll() throws Exception;
}
