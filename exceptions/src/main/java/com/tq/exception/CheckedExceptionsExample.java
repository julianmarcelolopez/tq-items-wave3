package com.tq.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsExample {
    public static void main(String[] args) {
        try {
            // Llamada a un método que podría lanzar una excepción verificada
            leerArchivo("archivo.txt");
        } catch (FileNotFoundException e) {
            // Manejo de la excepción FileNotFoundException
            System.out.println("Error: Archivo no encontrado.");
        } finally {
            // Bloque opcional que siempre se ejecutará
            System.out.println("El programa continúa ejecutándose...");
        }
    }

    // Método que indica que podría lanzar una excepción verificada (FileNotFoundException)
    private static void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        FileReader lector = new FileReader(archivo);
        // Código para leerpublic static void main(String[] args) {
        try {
            // Llamada a un método que podría lanzar una excepción verificada
            leerArchivo("archivo.txt");
        } catch (FileNotFoundException e) {
            // Manejo de la excepción FileNotFoundException
            System.out.println("Error: Archivo no encontrado.");
        } finally {
            // Bloque opcional que siempre se ejecutará
            System.out.println("El programa continúa ejecutándose...");
        }
    }
}
