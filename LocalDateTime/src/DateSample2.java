// Usando Date

import java.util.Date;

public class DateSample2 {
    public static void main(String[] args) {
        Date fecha = new Date();
        // Obtener el día del mes
        int dia = fecha.getDate(); // Obsoleto
        System.out.println("Día del mes: " + dia);
    }
}