package com.tq.exception.custom;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Llamada a un método que podría lanzar una excepción personalizada
            throwCustomException();
        } catch (CustomException e) {
            // Manejo de la excepción personalizada
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    private static void throwCustomException() throws CustomException {
        // Lanzar una instancia de la excepción personalizada
        throw new CustomException("Este es un mensaje personalizado desde throwCustomException.");
    }
}