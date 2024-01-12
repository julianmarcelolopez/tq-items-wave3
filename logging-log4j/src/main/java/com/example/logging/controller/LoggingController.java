package com.example.logging.controller;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoggingController {

    private static final Logger logger = LogManager.getLogger(LoggingController.class);

    @GetMapping("/logging2")
    public String ejemplo() {
        logger.trace("Este es un mensaje de trace");
        logger.debug("Este es un mensaje de debug");
        logger.info("Este es un mensaje de info");
        logger.warn("Este es un mensaje de warning");
        logger.error("Este es un mensaje de error");

        return "Ejemplo log4j completado";
    }
}