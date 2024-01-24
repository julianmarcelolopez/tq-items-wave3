import java.util.Optional;

public class OptionalExample2 {

    public static void main(String[] args) {
        // Crear un Optional a partir de un valor no nulo
        Optional<String> optionalValor = Optional.of("Hola, soy un valor no nulo");

        // Mapeo: Transformar el valor usando map
        Optional<String> upperCaseValue = optionalValor.map(String::toUpperCase);
        upperCaseValue.ifPresent(v -> System.out.println("Valor en mayúsculas: " + v));

        // Filtrado: Seleccionar un valor que cumple con cierta condición
        Optional<String> filteredValue = optionalValor.filter(v -> v.length() > 10);
        filteredValue.ifPresent(v -> System.out.println("Valor filtrado: " + v));

        // Proveer un valor predeterminado si el valor no está presente
        Optional<String> optionalVacio = Optional.empty();
        String defaultIfEmpty = optionalVacio.orElse("Valor predeterminado");
        System.out.println("Valor predeterminado si está vacío: " + defaultIfEmpty);

        // Lanzar una excepción si el valor es nulo
        try {
            String valueOrThrow = optionalVacio.orElseThrow(() -> new IllegalStateException("Valor nulo"));
        } catch (IllegalStateException e) {
            System.out.println("Excepción lanzada: " + e.getMessage());
        }

        // Realizar acciones condicionales si el valor está presente o ausente
        optionalValor.ifPresentOrElse(
                v -> System.out.println("Valor presente: " + v),
                () -> System.out.println("Valor ausente"));

        // Obtener un valor mediante un cálculo si está presente
        String calculatedValue = optionalValor.or(() -> Optional.of("Valor calculado")).get();
        System.out.println("Valor calculado si está presente: " + calculatedValue);
    }
}