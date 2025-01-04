import java.util.Random;

public class random_numbers_if_statements_7_8 {
    public static void main(String[] args) {
        Random rnd = new Random();

        //int x = rnd.nextInt(6)+1;
        //double x = rnd.nextDouble();
        boolean x = rnd.nextBoolean();
        System.out.println(x);
        if (x) {
            System.out.print("nid");
//
        }
    }
}
