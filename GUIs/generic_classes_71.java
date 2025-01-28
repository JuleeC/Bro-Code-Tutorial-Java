package GUIs;

public class generic_classes_71 {
    public static void main(String[] args) {

        myIntegerClass myInt = new myIntegerClass(1);
        myDoubleClass myDouble = new myDoubleClass(3.14);
        myCharacterClass myChar = new myCharacterClass('@');
        myStringClass myString = new myStringClass("Hello");


    }
}
class myIntegerClass {
    Integer x;

    myIntegerClass(Integer x) {
        this.x = x;
    }
    public Integer getValue() {
        return x;
    }
}

class myDoubleClass  {
    Double x;

    myDoubleClass(Double x) {
        this.x = x;
    }
    public Double getValue() {
        return x;
    }
}
class myCharacterClass {
    Character x;

    myCharacterClass(Character x) {
        this.x = x;
    }
    public Character getValue() {
        return x;
    }
}
class myStringClass {
    String x;

    myStringClass(String x) {
        this.x = x;
    }
    public String getValue() {
        return x;
    }
}
