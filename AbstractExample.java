abstract class Vehicle {
//    What every vehicle must do → start()
    public abstract void start();

//    Common behavior → run()
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " Running");
    }
}
class Car extends Vehicle{
    public void start() {
        System.out.println("Push Start");
    }
}
class Bike extends Vehicle {

    public void start() {
        System.out.println("Self Start");
    }
}

class AbstractExample{
    static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        bike.run();

        Vehicle car = new Car();
        car.start();
        car.run();
    }
}