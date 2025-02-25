package algorithms_82;

public class mergesort_87 {


    public static void main(String[] args) {
        int[] array = {8,2,3,6,4,5,9,1,7};

        mergeSort(array);

        for(int i : array) {
            System.out.print(i);
        }

    }
    public static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];
        int i = 0; //left array
        int j = 0; //right array

        for(; i< length; i++) {

        }

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] Array) {

    }
}
