package algorithms_82;

import java.util.Arrays;

public class binary_search_91 {
    // binary search = algorithm that finds the position of a target value within a sorted array.
    //                 Half of the array is eliminated during each "step"

    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 42;

        for(int i = 0; i< array.length;i++) {
            array[i] = i;
        }

        int index = Arrays.binarySearch(array,target);

    }
}
