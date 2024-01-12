package dependencyinversion.nook;

public class Coche {
  private Motor motor;

  Coche() {
    this.motor = new Motor();
  }
}
