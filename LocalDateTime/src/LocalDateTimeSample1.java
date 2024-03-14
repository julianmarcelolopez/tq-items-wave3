import java.time.LocalDateTime;

public class LocalDateTimeSample1 {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        // Intento de modificar la fecha
        // Esto arrojará un error de compilación ya que LocalDateTime es
        // inmutable
        // fecha.plusDays(1); // Error: LocalDateTime is immutable
    }
}