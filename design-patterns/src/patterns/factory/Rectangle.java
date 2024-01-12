package patterns.factory;

// Productos Concretos
public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Dibujando un rectángulo");
  }
}
