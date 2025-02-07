package basics_1_81;

public class swap_2_variables_2 {


        public static void main(String[] args) {

            String x = "water";
            String y = "Kool-Aid";
            String temp;

            temp = x;
            x=y;
            y=temp;

            System.out.println("x: "+x);
            System.out.println("y: "+y);
        }
}
