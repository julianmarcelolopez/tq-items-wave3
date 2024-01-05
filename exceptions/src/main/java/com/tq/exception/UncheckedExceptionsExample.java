package com.tq.exception;

public class UncheckedExceptionsExample {
    public static void main(String[] args) {
        // Llamada a un método que podría lanzar una excepción no verificada
        try {
            imprimirLongitud(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Método que podría lanzar una excepción no verificada (NullPointerException)
    private static void imprimirLongitud(String texto) {
        // Intento de operación que podría causar una excepción no verificada
        int longitud = texto.length();
        System.out.println("Longitud del texto: " + longitud);
    }
}
