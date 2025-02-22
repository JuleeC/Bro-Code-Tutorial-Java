package algorithms_82;

public class selection_sort_94 {
    //selection sort = search through an array and keep track of the minimum value during
    //                 each iteration. At the end of each iteration, we swap variables

    //Qudratic time O(n*n)
    //small data set = okay
    //large data set = BAD
    public static void main(String[] args) {
        int array[] = {8,7,9,2,3,5,1,6,4};

        selectionSort(array);

        for(int i : array) {
            System.out.println(array);
        }


    }
    public static void selectionSort(int[] array) {
        for(int i = 0; i< array.length-1; i++) {
            int min = i;
            for(int j = 0; j< array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];

        }

    }
}
