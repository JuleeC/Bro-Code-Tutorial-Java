package algorithms_82;




public class dynamic_arrays_87 {
    public static void main(String[] args ) {


    }
}

class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array  = new Object[capacity];
    }
}