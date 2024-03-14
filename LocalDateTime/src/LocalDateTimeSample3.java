import java.time.LocalDateTime;

public class LocalDateTimeSample3 {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        // No hay información sobre la zona horaria
        System.out.println("Fecha y hora actual: " + fecha);
    }
}