import java.util.Optional;

public class OptionalWildcardExample {

    public static void main(String[] args) {
        Optional<?> optionalString = Optional.of("Hola, soy un String");
        Optional<?> optionalInteger = Optional.of(42);
        Optional<?> optionalNull = Optional.ofNullable(null);

        // Puedes realizar operaciones con estos Optionals, aunque no sepas el tipo exacto.
        optionalString.ifPresent(value -> System.out.println("Valor String: " + value));
        optionalInteger.ifPresent(value -> System.out.println("Valor Integer: " + value));
        optionalNull.ifPresent(value -> System.out.println("Valor nulo: " + value));
    }
}
