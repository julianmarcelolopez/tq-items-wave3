package com.example.superhero.controller;

import com.example.superhero.model.SuperHero;
import com.example.superhero.service.impl.SuperHeroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// SERVER:PORT/NOMBRE-API/SERVICE1
// SERVER:PORT/NOMBRE-API/SERVICE2
@RestController()
@RequestMapping("/superhero")
public class SuperHeroController {
    @Autowired
    private com.example.superhero.service.impl.SuperHeroServiceImpl superHeroService;

    @Value("${server.port}")
    private String valor;

    // GET URL: localhost:8081/service-repo
    @RequestMapping("/hello-repo")
    public String helloRepository() {
        return superHeroService.helloRepository();
    }

    // GET
    @RequestMapping("/get-all")
    public ResponseEntity<List<SuperHero>> getAll() {
        return null;
//        return new ResponseEntity<>(superHeroService.getAll(), HttpStatus.OK);
    }

    @RequestMapping("/get-by-id/{id}")
    public ResponseEntity<SuperHero> getById(@PathVariable("id") int id) {
        return new ResponseEntity<>(superHeroService.getById(Long.valueOf(id)), HttpStatus.OK);
    }

    // CREATE
    @PostMapping("/create")
    public ResponseEntity<SuperHero> create(@RequestBody SuperHero superHero) {
        return new ResponseEntity<>(superHeroService.create(superHero), HttpStatus.CREATED);
    }
//TODO:
    // UPDATE
//    @PutMapping
//
//    // DELETE
//    @DeleteMapping
//
}