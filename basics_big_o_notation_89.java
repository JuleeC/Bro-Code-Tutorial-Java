public class basics_big_o_notation_89 {

//    "How code slows as data grow"
//
//    1. Describes the perfomance of an algorithm as the amount of data increases
//    2. Machine independent (# of steps to completion)
//    3. Ignore smaller operations O(n + 1) -> O(n)

//    example:        n = amount of data
//    O(1)        (its a variable like x)
//    O(n)
//    O(log n)
//    O(n*n)

//    O(n) linear time
        int addUp(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
        }
//--------------------------------
//    O(1) constant time
        int addUpp(int n) {
            int sum = n*(n+1) / 2;
            return sum;
        }
}

// Big O notation

//O(1) = constant time
//        random access of an element in an array
//        inserting at the beginning of linkedlist
//
//O(log n) = logarithmic time
//        binary search
//
//O(n) = linear time
//looping through elements in an array
//searching through a linkedlist
//
//O(n log n) = quasilinear time
//quicksort
//        mergesort
//heapsort
//
//O(n*n) = quadratic time
//insertion sort
//selection sort
//bubblesort
//
//O(n!) =factorial time