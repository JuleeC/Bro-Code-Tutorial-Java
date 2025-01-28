package GUIs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class generic_classes_71 {
    public static void main(String[] args) {

        MyGenericClass<Integer> myInt = new MyGenericClass(1);
        MyGenericClass<Double> myDouble = new MyGenericClass(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass('@');
        MyGenericClass<String> myString = new MyGenericClass("Hello");

        //ArrayList<String> myFriends = new ArrayList<>();
        HashMap<Integer,String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }
}

class MyGenericClass <Thing > {
    Thing x;
    MyGenericClass(Thing x) {
        this.x=x;
    }
    public Thing getValue() {
        return x;
    }
}
//class myIntegerClass {
//    Integer x;
//
//    myIntegerClass(Integer x) {
//        this.x = x;
//    }
//    public Integer getValue() {
//        return x;
//    }
//}
//
//class myDoubleClass  {
//    Double x;
//
//    myDoubleClass(Double x) {
//        this.x = x;
//    }
//    public Double getValue() {
//        return x;
//    }
//}
//class myCharacterClass {
//    Character x;
//
//    myCharacterClass(Character x) {
//        this.x = x;
//    }
//    public Character getValue() {
//        return x;
//    }
//}
//class myStringClass {
//    String x;
//
//    myStringClass(String x) {
//        this.x = x;
//    }
//    public String getValue() {
//        return x;
//    }
//}
