package com.example.superhero.repository;

import org.springframework.stereotype.Repository;

@Repository
public class SuperHeroRepository {

    public String helloRepository() {
        return "Hello Repository!!!";
    }
}
