package java.basics.basics_1_81;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling_41 {





        public static void main(String[] args) {

            // exception = 	an event that occurs during the execution of a program that,
            //				disrupts the normal flow of instructions

            Scanner scanner = new Scanner(System.in);

            try {

                System.out.println("Enter a whole number to divide: ");
                int x = scanner.nextInt();

                System.out.println("Enter a whole number to divide by: ");
                int y = scanner.nextInt();

                int z = x / y;

                System.out.println("result: " + z);
            } catch (ArithmeticException e) {
                System.out.println("You can't divide by zero! IDIOT!");
            } catch (InputMismatchException e) {
                System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
            } catch (Exception e) {
                System.out.println("Something went wrong");
            } finally {
                scanner.close();
            }


    }
}
