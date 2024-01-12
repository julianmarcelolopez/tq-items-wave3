package liskov.ok;

public class AveVuela implements Ave {
  @Override
  public void volar() {
    System.out.println("Ave volando con su implementacion especifica.");
  }
}
