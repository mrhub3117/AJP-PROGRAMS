14)factory pattern
  
interface Vehicle {
    void drive();
}


class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a bike");
    }
}


class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.drive(); // Driving a car

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.drive(); // Riding a bike
    }
}
