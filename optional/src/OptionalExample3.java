import java.util.Optional;

public class OptionalExample3 {

    public static void main(String[] args) {
        // Crear un Optional a partir de un valor posiblemente nulo
        Optional<String> optionalValue = Optional.ofNullable(getRandomValue());

        // Imprimir el valor actual o un mensaje si está ausente
        optionalValue.ifPresentOrElse(
                v -> System.out.println("Valor actual: " + v),
                () -> System.out.println("El valor está ausente"));

        // Concatenar dos Optionals si ambos están presentes
        Optional<String> additionalValue = Optional.of(" adicional");
        Optional<String> concatenated = optionalValue.flatMap(val -> additionalValue.map(add -> val + add));
        concatenated.ifPresent(v -> System.out.println("Valores concatenados: " + v));

        // Ejemplo de uso de orElseGet para cálculos costosos
        String result = optionalValue.orElseGet(() -> performExpensiveOperation());
        System.out.println("Resultado obtenido: " + result);
    }

    private static String getRandomValue() {
        // Lógica para obtener un valor posiblemente nulo
        return Math.random() < 0.5 ? "Valor Aleatorio" : null;
    }

    private static String performExpensiveOperation() {
        // Lógica para realizar una operación costosa
        System.out.println("Realizando operación costosa...");
        return "Resultado Costoso";
    }
}
