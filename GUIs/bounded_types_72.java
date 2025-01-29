package GUIs;

import java.util.HashMap;

public class bounded_types_72 {
    public static void main(String[] args) {

        MyGenericClasss<Integer,Integer> myInt = new MyGenericClasss(1,2);
        MyGenericClasss<Double,Double> myDouble = new MyGenericClasss(3.14,3.1);
      //  MyGenericClasss<Character,Character> myChar = new MyGenericClasss('@','M');
      //  MyGenericClasss<String,String> myString = new MyGenericClasss("Hello","dsa");

        //ArrayList<String> myFriends = new ArrayList<>();
        HashMap<Integer,String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());


    }
}

class MyGenericClasss <Thing extends Number,Thing2 extends Number > {
    Thing x;
    Thing y;
    MyGenericClasss(Thing x, Thing y) {
        this.x=x;
        this.y = y;
    }
    public Thing getValue() {
        return x;
    }
}

