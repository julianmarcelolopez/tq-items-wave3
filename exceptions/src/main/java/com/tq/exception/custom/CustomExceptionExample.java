package com.tq.exception.custom;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            String cadena = "";
            System.out.println(validarCadena(cadena));

            // Llamada a un método que podría lanzar una excepción personalizada
            // throwCustomException();
        } catch (CadenaVaciaException e) {
            // Manejo de la excepción personalizada
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    private static void throwCustomException() throws CustomException {
        // Lanzar una instancia de la excepción personalizada
        throw new CustomException("Este es un mensaje personalizado desde throwCustomException.");
    }

    private static String validarCadena(String cadena) throws CadenaVaciaException {
        String retorno = "este es el retorno del metodo validarCadena";
        if (cadena.isBlank())
            throw new CadenaVaciaException("CadenaVaciaExceptionMessage");

        return retorno;
    }
}