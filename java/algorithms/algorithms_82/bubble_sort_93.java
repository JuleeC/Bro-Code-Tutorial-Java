package java.algorithms.algorithms_82;

public class bubble_sort_93 {
    // bubble sort = pars of adjacent elements are compared , and the elements
    //               swapped if they are not in order.
    //
    //               Quadratic time O(n*n)
    //               small data set = okay-ish
    //               large data set = bad
    public static void main(String[] args) {
        int[] array ={0,1,6,7,4,32,7,8,5,9,2};

        bubbleSort(array);

        for(int i :array) {
            System.out.println(i);
        }

    }
    public static void bubbleSort(int array[] ) {
        for(int i = 0; i< array.length-1; i++) {
            for(int j = 0; j< array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j +1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
