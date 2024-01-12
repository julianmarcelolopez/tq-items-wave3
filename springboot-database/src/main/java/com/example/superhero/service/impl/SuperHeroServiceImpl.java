package com.example.superhero.service.impl;

import com.example.superhero.model.SuperHero;
import com.example.superhero.repository.SuperHeroRepository;
import com.example.superhero.service.SuperHeroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperHeroServiceImpl implements SuperHeroService {

  @Autowired SuperHeroRepository superHeroRepository;

  @Override
  public List<SuperHero> getAll() {
    return superHeroRepository.findAll();
  }

  @Override
  public SuperHero create(SuperHero superHero) {
    return null;
  }
}
