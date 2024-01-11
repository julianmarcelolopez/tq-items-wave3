package patterns.builder;

public interface CarBuilder {
  Car build();

  CarBuilder setModelo(String modelo);

  CarBuilder setColor(String color);

  CarBuilder setAnio(int anio);
}
