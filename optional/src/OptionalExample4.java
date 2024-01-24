import java.util.Optional;

public class OptionalExample4 {

    public static void main(String[] args) {
        // Crear un Optional a partir de un valor posiblemente nulo
        Optional<String> optionalValue = Optional.ofNullable(getRandomValue());

        // Verificar si el Optional está vacío usando isEmpty
        if (optionalValue.isEmpty()) {
            System.out.println("El Optional está vacío.");
        } else {
            System.out.println("El Optional no está vacío.");
        }

        // Imprimir el valor actual o un mensaje si está ausente usando orElse
        String valueOrMessage = optionalValue.orElse("El valor está ausente.");
        System.out.println("Valor actual o mensaje: " + valueOrMessage);

        // Ejemplo de uso de filter para validar el valor
        Optional<String> filteredValue = optionalValue.filter(val -> val.startsWith("V"));
        filteredValue.ifPresent(v -> System.out.println("Valor que comienza con 'V': " + v));
    }

    private static String getRandomValue() {
        // Lógica para obtener un valor posiblemente nulo
        return Math.random() < 0.5 ? "Valor Aleatorio" : null;
    }
}
