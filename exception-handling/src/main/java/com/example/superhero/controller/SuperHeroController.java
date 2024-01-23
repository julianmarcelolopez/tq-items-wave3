package com.example.superhero.controller;

import com.example.superhero.entity.SuperHero;
import com.example.superhero.exception.CustomException;
import com.example.superhero.exception.ErrorMessage;
import com.example.superhero.exception.NotFoundCustomException;
import com.example.superhero.service.impl.SuperHeroServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/superhero/")
public class SuperHeroController {
    @Autowired
    private SuperHeroServiceImpl superHeroService;

    @RequestMapping("/get-all")
    public ResponseEntity<List<SuperHero>> getSuperheroes() throws Exception {
        return new ResponseEntity<>(superHeroService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) throws Exception {
        return ResponseEntity.ok(superHeroService.findById(id));
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<?> delete(@PathVariable Integer id) throws Exception {
        superHeroService.deleteSuperHeroById(id);
        String mensaje = "Superhéroe con ID " + id + " eliminado correctamente.";
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
//        return ResponseEntity.ok(HttpStatus.OK.value());

    }

}
