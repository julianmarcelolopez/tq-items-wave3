package liskov.ok;

public class AveNoVuela {
    void volar() {
        throw new UnsupportedOperationException("Este ave no puede volar");
    }
}
