// Usando Date

import java.util.Date;

public class DateSample3 {
    public static void main(String[] args) {
        Date fecha = new Date();
        // La fecha y hora dependen de la zona horaria del sistema
        System.out.println("Fecha y hora actual: " + fecha);
    }
}