package java.basics.basics_1_81.to_String_27;

public class Main {

    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        //    that returns a string that "textually represents" an object.
        //    can be used both implicitly and explicitly

        Car car = new Car();


        System.out.println(car.toString());

        // or

        System.out.println(car);


    }
}

