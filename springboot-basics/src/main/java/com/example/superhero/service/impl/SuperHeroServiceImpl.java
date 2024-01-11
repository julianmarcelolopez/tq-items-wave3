package com.example.superhero.service.impl;

import com.example.superhero.model.SuperHero;
import com.example.superhero.repository.SuperHeroRepository;
import com.example.superhero.service.SuperHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperHeroServiceImpl implements SuperHeroService {

    @Autowired
    SuperHeroRepository superHeroRepository;

    @Override
    public List<SuperHero> getAll() {
        return null;
    }

    public String helloService() {
        return "Hello Service!!!";
    }

    @Override
    public String helloMyNameIs(String name) {
        return "Hello! My name is " + name;
    }

    @Override
    public String helloRepository() {
        return this.superHeroRepository.helloRepository();
    }

    @Override
    public SuperHero getById(Long id) {
        return null;
    }

    @Override
    public SuperHero create(SuperHero superHero) {
        return null;
    }

}
