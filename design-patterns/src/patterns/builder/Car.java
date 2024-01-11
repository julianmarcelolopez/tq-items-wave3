package patterns.builder;

public class Car {
  private String modelo;
  private String color;
  private int anio;

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  @Override
  public String toString() {
    return "Car{"
        + "modelo='"
        + modelo
        + '\''
        + ", color='"
        + color
        + '\''
        + ", anio="
        + anio
        + '}';
  }
}
