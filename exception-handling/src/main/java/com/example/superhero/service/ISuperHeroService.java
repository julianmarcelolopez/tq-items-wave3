package com.example.superhero.service;
import com.example.superhero.entity.SuperHero;

import java.util.List;

public interface ISuperHeroService {

  List<SuperHero> findAll() throws Exception;

  void deleteSuperHeroById(Integer id) throws Exception;

  SuperHero findById(Integer id) throws Exception;
}
