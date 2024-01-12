package patterns.factorycar;

public class CarFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "Economy":
                return new Ford();
            case "Standard":
                return new Toyota();
            default:
                System.out.println("The requested car grade was not recognized.");
                return null;
        }
    }
}