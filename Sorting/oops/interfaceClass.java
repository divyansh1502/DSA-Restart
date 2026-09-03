
public class interfaceClass {
    public static void main(String[] args) {
        Car c1 = new FuelCar();
        Car c2 = new ElectricCar();

        c1.start();
        c1.accelerate();
        c1.brake();

        c2.start();
        c2.accelerate();
        c2.brake();
    }
}
interface Car {
    void start();
    void accelerate();
    void brake();
}
class FuelCar implements Car {
    @Override
    public void start() {
        System.out.println("Fuel Car Starting");
    }
    @Override
    public void accelerate() {
        System.out.println("Fuel Car accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Fuel Car braking");
    }
}
class ElectricCar implements Car {
    @Override
    public void start() {
        System.out.println("Electric Car Starting");
    }
    @Override
    public void accelerate() {
        System.out.println("Electric Car accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Electric Car braking");
    }
}