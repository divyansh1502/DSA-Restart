public class abstractClass {
    public static void main(String[] args) {
        Car c1 = new FuelCar();
        c1.start();
        c1.accelerate();
        c1.brake();
        Car c2 = new ElectricCar();
        c2.start();
        c2.accelerate();
        c2.brake();
    }
}
abstract class Car {
        void start() {
            System.out.println("Car starts");
        }
        abstract void accelerate();
        abstract void brake();
}
class FuelCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Fuel Car Accelerate");
    }
    @Override
    void brake() {
        System.out.println("Fuel Car Brake");
    }
}
class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric Car Accelerate");
    }
    @Override
    void brake() {
        System.out.println("Electric Car Brake");
    }
}