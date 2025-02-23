package algorithms_82;

public class insertion_sort_95 {

    //insertion sort = after comparing elements to the left
    //                 shift elements to the right ot make room to insert value
    //
    //Quadratic time O(n*n)
    //small data set = decent
    //large data set = BAD

    //Less steps than bubble sort
    //best case is O(n) compared to Selection Sort O(n*n)
    public static void main (String[] args) {
        int array[] = {9,1,2,6,4,8,7,3};

        insertionSort(array);
        for(int i : array) {
            System.out.print(i + " ");
        }

    }
    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length;i++){
            int temp = array[i];
            int j = i-1;

            whil

        }

    }
}
