package algorithms_82;

public class linear_search_90 {
    //linear search = iterate through a collection one element at a time

    // runtime complexity: O(n)

    //Disadvantages:
    //Slow for large data sets

    //Advantages:
    //Fast for searches of small to medium data sets
    //Does not need to sorted
    //Useful for data structures that do not have random access (Linked List)
    public static void main(String[] args) {
        int[] array = {9,1,8,2,7,3,6,4,5};

        int index = linearSearch(array,1);

    }
    private static int linearSearch(int[] array, int value) {
        return 0;
    }

}
