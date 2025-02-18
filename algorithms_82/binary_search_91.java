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

        if(index == -1 ) {
            System.out.println(target +  " not found");

        }else{
            System.out.println("Element found at: " + index);
        }
    }
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;
        while(low <= high) {
            int middle = low + (high -low) / 2;
            int value = array[middle];
            System.out.println("middle: " + value);

        }
        return -1;
    }
}
