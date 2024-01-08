package com.tq.exception.custom;

public class CustomException extends Exception {
    public CustomException(String message) {
        // Llama al constructor de la clase base (Exception) con el mensaje
//        super("CustomException" + message, new RuntimeException());
        super("CustomException - " + message);
    }
}