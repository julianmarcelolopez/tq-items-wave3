package patterns.builder2;

public class Main {
  public static void main(String[] args) {
    // Construcción de un auto usando un constructor tradicional
    patterns.builder2.Car carWithoutBuilder =
        new patterns.builder2.Car("Toyota", "Camry", 2022, "Azul");
    System.out.println("Auto construido sin Builder:");
    System.out.println(carWithoutBuilder);

    // Construcción de un auto usando un Builder
    patterns.builder2.Car carWithBuilder =
        new Car.CarBuilder()
            .setMake("Honda")
            .setModel("Civic")
            .setYear(2022)
            .setColor("Rojo")
            .build();

    System.out.println("\nAuto construido con Builder:");
    System.out.println(carWithBuilder);

      Car carWithOptionalParams = new Car.CarBuilder()
              .setMake("Honda")
              .setModel("Civic")
              .build();

      System.out.println("\nAuto construido con Builder:");
      System.out.println(carWithOptionalParams);
  }
}
