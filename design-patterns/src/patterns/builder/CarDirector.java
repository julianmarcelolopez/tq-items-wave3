package patterns.builder;

public class CarDirector {
  public Car constructCar(CarBuilder builder, String modelo, String color, int anio) {
    return builder.setModelo(modelo).setColor(color).setAnio(anio).build();
  }

  public Car constructCar(CarBuilder builder, String color, int anio) {
    return builder.setColor(color).setAnio(anio).build();
  }
}
