package liskov.nook;

// No aplica LSP
public class AveNoVuela {
  void volar() {
    throw new UnsupportedOperationException("Este ave no puede volar");
  }
}
