package com.tq.exception;

public class BasicSample {

    public static void main(String[] args) {
        try {
            // Código que podría lanzar una excepción
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción ArithmeticException
            System.out.println("Error: División por cero.");
        } finally {
            // Bloque opcional que siempre se ejecutará
            System.out.println("El programa continúa ejecutándose...");
        }
    }

    // Método que podría lanzar una excepción (ArithmeticException)
    private static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}

