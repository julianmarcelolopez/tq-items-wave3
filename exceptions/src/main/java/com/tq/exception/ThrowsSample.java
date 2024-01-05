package com.tq.exception;

public class ThrowsSample {
    public static void main(String[] args) {
        try {
            // Código que podría lanzar una excepción
            int resultado = dividir(10, 2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción ArithmeticException
            System.out.println("Error: División por cero.");
        } catch (Exception ex) {
            // Manejo de la excepción ArithmeticException
            System.out.println("Error: Generic Exception");
        } finally {
            // Bloque opcional que siempre se ejecutará
            System.out.println("El programa continúa ejecutándose...");
        }
    }

    // Método que podría lanzar una excepción (ArithmeticException)
    private static int dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador > 0) {
            throw new ArithmeticException("Intento de división por cero.");
        }

        return numerador / denominador;
    }

}
