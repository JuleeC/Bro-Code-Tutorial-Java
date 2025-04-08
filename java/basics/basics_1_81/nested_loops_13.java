package java.basics.basics_1_81;

import java.util.Scanner;
public class nested_loops_13 {
    public static void main(String[] args) {
        boolean x = true;
        // nested loops = a loop inside of a loop
        while (x) {
            Scanner scanner = new Scanner(System.in);
            int rows;
            int columns;
            String symbol = "";

            System.out.println("Enter # of rows: ");
            rows = scanner.nextInt();
            System.out.println("Enter # of columns: ");
            columns = scanner.nextInt();
            System.out.println("Enter symbol to use: ");
            symbol = scanner.next();

            for (int i = 1; i <= rows; i++) {
                System.out.println();
                for (int j = 1; j <= columns; j++) {
                    System.out.print(symbol);
                }

            }
            System.out.println("Wanna play again");
            int yes_no = scanner.nextInt();

            if (yes_no == 2) {
                x = false;
            }
        }
    }
}
