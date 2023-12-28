package com.example.superhero.controller;

import com.example.superhero.service.impl.SuperHeroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperHeroController {
    @Autowired
    private SuperHeroServiceImpl superHeroService;

    @Value("${server.port}")
    private String valor;

    // GET URL: localhost:8081/hello
    @RequestMapping("/hello")
    public String helloController() {
        return "Hello Controller!";
    }

    // GET URL: localhost:8081/service-service
    @RequestMapping("/hello-service")
    public String helloService() {
        return superHeroService.helloService();
    }

    // GET URL: localhost:8081/service-repo
    @RequestMapping("/hello-repo")
    public String helloRepository() {
        return superHeroService.helloRepository();
    }

    // GET URL: localhost:8081/port
    @RequestMapping("/port")
    public String port() {
        return valor;
    }
}