import model.Car;
import model.Car.BodyType;
import model.CarDealership;
//import static model.Car.*; not used
import static model.Car.BodyType.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);
        Car car2 = new Car("Honda", "Civic", SEDAN, 2021, 25000);


        CarDealership dealership = new CarDealership();
        
        // Test the addCar method
        dealership.addCar(car1);
        dealership.addCar(car2);


        // Test the getCar method
        Car retrievedCar = dealership.getCar(0);
        System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());


        // Test the setCar method
        Car newCar = new Car("Ford", "Mustang", BodyType.COUPE, 2022, 45000);
        dealership.setCar(newCar, 0);

        // Verify that the car was updated
        retrievedCar = dealership.getCar(0);
        System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());        
    }
}