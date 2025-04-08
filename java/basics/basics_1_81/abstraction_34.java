package java.basics.basics_1_81;

public class abstraction_34 {
    public static void main(String[] args) {

        // abstract =  	abstract classes cannot be instantiated, but they can have a subclass
        //				abstract methods are declared without an implementation

        //java.basics.basics_1_81.Vehicle vehicle = new java.basics.basics_1_81.Vehicle();
        Car car = new Car();
        //not possible because you cant create an object of it (not able to be instantiated)
        //java.basics.basics_1_81.Vehicle vehicle = new java.basics.basics_1_81.Vehicle();
        car.go();

    }
}


abstract class Vehicle {

    abstract void go();
}
abstract class Vehicle1 {

    abstract void go();
}
//you cant inherit from 2 classes, so if you need to than use an interface (number 38)
//class java.basics.basics_1_81.Car extends java.basics.basics_1_81.Vehicle,java.basics.basics_1_81.Vehicle1

class Car extends Vehicle{

    @Override
    void go() {
        System.out.println("The driver is driving the car");

    }
}

