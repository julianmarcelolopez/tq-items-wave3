package patterns.builder;

public class CarBuilderImpl implements CarBuilder {
  private Car car;

  public CarBuilderImpl() {
    this.car = new Car();
  }

  @Override
  public Car build() {
    return this.car;
  }

  @Override
  public CarBuilder setModelo(String modelo) {
    this.car.setModelo(modelo);
    return this;
  }

  @Override
  public CarBuilder setColor(String color) {
    this.car.setColor(color);
    return this;
  }

  @Override
  public CarBuilder setAnio(int anio) {
    this.car.setAnio(anio);
    return this;
  }
}
