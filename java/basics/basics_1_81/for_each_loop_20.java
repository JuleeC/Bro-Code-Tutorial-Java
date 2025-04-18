package java.basics.basics_1_81;

import java.util.ArrayList;
public class for_each_loop_20 {
    public static void main(String[] args) {

        // for-each = 	traversing technique to iterate through the elements in an array/collection
        //				less steps, more readable
        //				less flexible

        //String[] animals = {"cat","dog","rat","bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        //column represents the word in
        for (String i : animals) {
            System.out.println(i);
        }
    }
}