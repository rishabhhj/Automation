package AbstractionPolymorphism;

interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped.");
    }
}

interface Engine {
    void engineType();

    default void fuelType() {
        System.out.println("Fuel type: Petrol");
    }
}

class Car implements Vehicle, Engine {
    public void start() {
        System.out.println("Car started.");
    }

    public void engineType() {
        System.out.println("Car engine type: V8");
    }
}
class Mainn {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();
        myCar.engineType();
        myCar.stop();
        myCar.fuelType();
    }
}