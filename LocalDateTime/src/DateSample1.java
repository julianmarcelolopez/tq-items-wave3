import java.util.Date;

public class DateSample1 {
    public static void main(String[] args) {
        Date fecha = new Date();
        // Modificar la fecha añadiendo un día
        fecha.setDate(fecha.getDate() + 1);
        // La fecha se ha modificado, lo que podría conducir a problemas de
        // sincronización en entornos multi-hilo
    }
}