package com.example.superhero.controller;

import com.example.superhero.model.SuperHero;
import com.example.superhero.service.impl.SuperHeroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/superhero/")
public class SuperHeroController {
  @Autowired private SuperHeroServiceImpl superHeroService;

  @RequestMapping("/get-all")
  public ResponseEntity<List<SuperHero>> getSuperheroes() {
    return new ResponseEntity<>(superHeroService.getAll(), HttpStatus.OK);
  }
}
