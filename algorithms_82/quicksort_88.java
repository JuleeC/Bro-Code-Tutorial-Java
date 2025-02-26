package algorithms_82;

public class quicksort_88 {
    public static void main(String[] args) {
        int[] array = {1,5,7,9,2,4,3,8,6};

        quickSort(array,0,array.length-1);

        for(int i : array) {
            System.out.print(i);
        }

    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return; //base case
        int pivot = partition(array,start,end);
        quickSort(array,start,pivot-1);
        quickSort(array,pivot+1,end);

    }
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i =start -1;

        for(int j = start; j <= end -1 ; j++) {
            if(array[j] < pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        return i;
    }

}
