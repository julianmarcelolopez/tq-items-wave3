package com.example.superhero.controller;

import com.example.superhero.entity.SuperHero;
import com.example.superhero.service.impl.SuperHeroServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/superhero/")
public class SuperHeroController {
  @Autowired private SuperHeroServiceImpl superHeroService;

  @RequestMapping("/get-all")
  private ResponseEntity<List<SuperHero>> getSuperheroes() throws Exception {
    return new ResponseEntity<>(superHeroService.findAll(), HttpStatus.OK);
  }
}
