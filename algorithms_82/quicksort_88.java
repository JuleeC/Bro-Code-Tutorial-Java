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

    }
}
