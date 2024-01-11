package patterns.builder;

public class Main {
  public static void main(String[] args) {
    CarBuilder builder = new CarBuilderImpl();
    CarDirector director = new CarDirector();

    Car car1 = director.constructCar(builder, "Sedán", "Rojo", 2022);
    System.out.println(car1.toString());

    Car car2 = director.constructCar(builder, "Azul", 2024);
    System.out.println(car2.toString());

    // Ahora 'car' está construido con configuraciones específicas
  }
}
