import model.Car;

import static model.Car.*;
import static model.Car.BodyType.*;

public class Main {
    
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", SEDAN, 2020, 30_000);
        System.out.println(car1.getMake());

        // Uncomment to test invalid input for setMake, setModel, setBodyType, setProductionYear, setPrice
        //car1.setMake("");
        //car1.setModel("");
        //car1.setBodyType(null);
        //car1.setProductionYear(1899);
        //car1.setPrice(-1);
        //car1.setPrice(200001);

        System.out.println(MIN_YEAR); // public static final... interesting. :)
        System.out.println(MAX_PRICE);

        // Uncomment to test invalid input for the constructor
        Car car2 = new Car("BMW", "X5", COUPE, 2024, 45_000);
        System.out.println(car2.getPrice());
    }
}