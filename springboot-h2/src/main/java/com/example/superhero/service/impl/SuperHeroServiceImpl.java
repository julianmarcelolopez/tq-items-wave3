package com.example.superhero.service.impl;

import java.util.List;

import com.example.superhero.repository.ISuperHeroRepository;
import com.example.superhero.service.ISuperHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.superhero.entity.SuperHero;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SuperHeroServiceImpl implements ISuperHeroService {

  @Autowired private ISuperHeroRepository superHeroRepository;

  public void setSuperHeroRepository(ISuperHeroRepository superHeroRepository) {
    this.superHeroRepository = superHeroRepository;
  }

  @Override
  public List<SuperHero> findAll() throws Exception {
    log.info("Find All SuperHeros...");
    List<SuperHero> superHeroList = superHeroRepository.findAllByActive(true);
    if (superHeroList.isEmpty()) throw new Exception("");

    return superHeroList;
  }
}
