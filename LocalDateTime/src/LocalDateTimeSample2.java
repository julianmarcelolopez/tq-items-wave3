import java.time.LocalDateTime;

public class LocalDateTimeSample2 {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        // Obtener el día del mes
        int dia = fecha.getDayOfMonth();
        System.out.println("Día del mes: " + dia);
    }
}