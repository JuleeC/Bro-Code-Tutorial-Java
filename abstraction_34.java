public class abstraction_34 {
    public static void main(String[] args) {

        // abstract =  	abstract classes cannot be instantiated, but they can have a subclass
        //				abstract methods are declared without an implementation

        //Vehicle vehicle = new Vehicle();
        Car car = new Car();
        //not possible because you cant create an object of it (not able to be instantiated)
        //Vehicle vehicle = new Vehicle();
        car.go();

    }
}


abstract class Vehicle {

    abstract void go();
}

class Car extends Vehicle{

    @Override
    void go() {
        System.out.println("The driver is driving the car");

    }
}

