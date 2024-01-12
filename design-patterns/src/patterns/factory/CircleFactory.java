package patterns.factory;

// Creador Concreto
public class CircleFactory implements ShapeFactory {
  @Override
  public Shape createShape() {
    return new Circle();
  }
}
