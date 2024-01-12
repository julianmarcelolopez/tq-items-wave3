package com.example.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/logging")
    public String ejemplo() {
        logger.trace("Este es un mensaje de trace");
        logger.debug("Este es un mensaje de debug");
        logger.info("Este es un mensaje de info");
        logger.warn("Este es un mensaje de warning");
        logger.error("Este es un mensaje de error");

        return "Ejemplo completado";
    }
}