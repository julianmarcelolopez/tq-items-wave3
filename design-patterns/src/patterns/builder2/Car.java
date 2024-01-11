package patterns.builder2;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    // Constructor privado para ser utilizado solo por el Builder
    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Métodos getters para los atributos...

    // Clase Builder estática interna
    public static class CarBuilder {
        private String make;
        private String model;
        private int year;
        private String color;

        // Métodos setter para los atributos del auto
        public CarBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // Método build para construir la instancia de Car
        public Car build() {
            // Puedes realizar validaciones u operaciones adicionales aquí si es necesario
            return new Car(make, model, year, color);
        }
    }

    // Resto de la implementación de la clase Car...

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Construcción de un auto usando un constructor tradicional
        Car carWithoutBuilder = new Car("Toyota", "Camry", 2022, "Azul");
        System.out.println("Auto construido sin Builder:");
        System.out.println(carWithoutBuilder);

        // Construcción de un auto usando un Builder
        Car carWithBuilder = new Car.CarBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2022)
                .setColor("Rojo")
                .build();

        System.out.println("\nAuto construido con Builder:");
        System.out.println(carWithBuilder);

        Car carWithParams = new Car.CarBuilder()
                .setMake("Honda")
                .setYear(2024)
                .build();

        System.out.println("\nAuto construido con Builder with Specific Params:");
        System.out.println(carWithParams);
    }
}