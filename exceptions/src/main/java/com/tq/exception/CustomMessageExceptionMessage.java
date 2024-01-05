package com.tq.exception;

public class CustomMessageExceptionMessage {
    public static void main(String[] args) {
        try {
            throwCustomException();
        } catch (RuntimeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
           // System.out.println("Caught Exception: " + e.getCause());
//            e.printStackTrace();
        }
    }

    private static void throwCustomException() {
        // Crear una instancia de RuntimeException con un mensaje personalizado
        throw new RuntimeException("Este es un mensaje personalizado.");
    }
}

