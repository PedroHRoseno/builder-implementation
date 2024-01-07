import Director.Director;
import builder.CarBuilder;
import model.Car;

public class MainApp {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructHondaCar(carBuilder);

        Car car = carBuilder.build();

        System.out.println("This car is a " + car.getBrand() + " " + car.getModel());

    }
}
