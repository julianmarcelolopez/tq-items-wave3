import java.util.Optional;

public class OrElseVsOrElseGetExample {

    public static void main(String[] args) {
        // Caso 1: Valor presente
        String textPresent = "Valor presente";
        String resultOrElse = Optional.ofNullable(textPresent).orElse(getDefaultText());
        String resultOrElseGet = Optional.ofNullable(textPresent).orElseGet(() -> getDefaultText());

        System.out.println("Caso 1 - Valor presente:");
        System.out.println("Resultado usando orElse: " + resultOrElse);
        System.out.println("Resultado usando orElseGet: " + resultOrElseGet);
        System.out.println();

        // Caso 2: Valor ausente
        String textAbsent = null;
        String resultOrElseAbsent = Optional.ofNullable(textAbsent).orElse(getDefaultText());
        String resultOrElseGetAbsent = Optional.ofNullable(textAbsent).orElseGet(() -> getDefaultText());

        System.out.println("Caso 2 - Valor ausente:");
        System.out.println("Resultado usando orElse: " + resultOrElseAbsent);
        System.out.println("Resultado usando orElseGet: " + resultOrElseGetAbsent);
    }

    private static String getDefaultText() {
        System.out.println("Obteniendo valor predeterminado...");
        return "Valor predeterminado";
    }
}
