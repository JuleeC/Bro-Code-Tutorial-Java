package java.basics.basics_1_81;

public class methods_21 {
    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon

        int x = 3;
        int y = 4;

        int z = add(x, y);

        System.out.println(z);
    }

    static int add(int x, int y) {

        int z = x + y;
        return z;
    }
}