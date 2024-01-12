package patterns.factory;

// Productos Concretos
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Dibujando un círculo");
  }
}
