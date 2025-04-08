package java.basics.basics_1_81;

public class copy_objects_37 {
    public static void main(String[] args) {


        Car__ car1 = new Car__("Chevrolet","Camaro",2021);
        //java.basics.basics_1_81.Car car2 = new java.basics.basics_1_81.Car("Ford","Mustang",2022);
        //car2.copy(car1);
        Car__ car2 = new Car__(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}
//*********************************************
class Car__ {


    private String make;
    private String model;
    private int year;

    Car__(String make,String model,int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    //overloaded constructors
    Car__(Car__ x){
        this.copy(x);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car__ x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

}


