package java.basics.basics_1_81;

class polymorphism {
    public static void main(String[] args) {

        // java.basics.basics_1_81.polymorphism = 	greek word for poly-"many", morph-"form"
        //					The ability of an object to identify as more than one type

        Car___ car = new Car___();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle_[] racers = {car,bicycle,boat};

        for(Vehicle_ x : racers) {
            x.go();
        }

    }
}
//**************************************
abstract class Vehicle_ {

    abstract public void go();

}
//**************************************
class Car___ extends Vehicle_{


    @Override
    public void go() {
        System.out.println("*The car begins moving*");
    }
}
//**************************************
class Bicycle extends Vehicle_{


    @Override
    public void go() {
        System.out.println("*The bicycle begins moving*");
    }
}
//**************************************
class Boat extends Vehicle_{


    @Override
    public void go() {
        System.out.println("*The boat begins moving*");
    }
}
//**************************************

