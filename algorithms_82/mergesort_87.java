package algorithms_82;

public class mergesort_87 {
    // merge sort = recursively divide array in 2, sort, re-combine
    // run-time complexity = O(n Log n)
    // space complexity = O(n)

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
            if(i < middle) {
                leftArray[i] = array[i];
            }else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] Array) {
        int leftSize = Array.length/2;
        int rightSize = Array.length-leftSize;
        int i =0; int l=0; int r = 0; //indices

        while(l <  leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                Array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                Array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize) {
            Array[i] = leftArray[l];
            i++;
            l++;

        }
        while(r < rightSize) {
            Array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
