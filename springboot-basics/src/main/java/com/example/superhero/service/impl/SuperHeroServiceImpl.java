package com.example.superhero.service.impl;

import com.example.superhero.repository.SuperHeroRepository;
import com.example.superhero.service.SuperHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperHeroServiceImpl implements SuperHeroService {

    @Autowired
    SuperHeroRepository superHeroRepository;

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

}
