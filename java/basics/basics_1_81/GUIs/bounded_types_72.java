package java.basics.basics_1_81.GUIs;

import java.util.HashMap;

public class bounded_types_72 {
    public static void main(String[] args) {

        MyGenericClasss<Integer,Integer> myInt = new MyGenericClasss(1,2);
        MyGenericClasss<Double,Double> myDouble = new MyGenericClasss(3.14,3.1);
        //doesnt work because it isnt a subclass from the class Number
      //  MyGenericClasss<Character,Character> myChar = new MyGenericClasss('@','M');
      //  MyGenericClasss<String,String> myString = new MyGenericClasss("Hello","dsa");

        //ArrayList<String> myFriends = new ArrayList<>();
        HashMap<Integer,String> users = new HashMap<>();

        System.out.println(myInt.getValue_x());
        System.out.println(myDouble.getValue_y());


    }
}
//only subclasses from the class Number can be the input. for example (Long,Integer,Float,Double)
class MyGenericClasss <Thing extends Number,Thing2 extends Number > {
    Thing x;
    Thing y;
    MyGenericClasss(Thing x, Thing y) {
        this.x=x;
        this.y = y;
    }
    public Thing getValue_x() {
        return x;
    }
    public Thing getValue_y() {
        return y;
    }
}

