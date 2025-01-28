package GUIs;

public class generics_70 {
    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
        Character[] charArray = {'H','E','L','L','O'};
        String[] stringArray = {"B","Y","E"};
        displayArray(intArray);
        displayArray(charArray);
    }
    public static void displayArray(Integer[] array) {
        for(Integer x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
}
