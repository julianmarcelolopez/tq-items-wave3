import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String valor = "Hola, soy un valor no nulo";

        // Crear un Optional a partir de un valor no nulo
        Optional<String> optionalValor = Optional.of(valor);

        // Verificar si el valor existe y realizar alguna operación
        if (optionalValor.isPresent()) {
            System.out.println("El valor es: " + optionalValor.get());
        } else {
            System.out.println("El valor es nulo.");
        }

        // Otra forma más elegante usando ifPresent
        optionalValor.ifPresent(v -> System.out.println("El valor es: " + v));

        // Crear un Optional a partir de un valor que podría ser nulo
        String posibleValorNulo = null;
        Optional<String> optionalPosibleNulo = Optional.ofNullable(posibleValorNulo);

        // Obtener un valor predeterminado si el valor es nulo
        String valorPredeterminado = optionalPosibleNulo.orElse("Valor predeterminado");
        System.out.println("El valor es: " + valorPredeterminado);
    }
}