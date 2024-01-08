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
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Método que podría lanzar una excepción (ArithmeticException)
    private static int dividir(int numerador, int denominador) throws Exception {
        throw new Exception("Code: 100 - Servicio momentaneamente no disponible.");
        //return numerador / denominador;
    }
}

