package java.basics.basics_1_81;

import java.util.Scanner;
public class Math_Class_7 {
    public static void main(String[]args) {


        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is : " + z);
        System.out.println(Math.max(x,y)+" "+
                Math.min(x,y)+" "+
                Math.abs(y)+" "+
                Math.sqrt(x)+" "+
                Math.round(x)+" "+
                Math.ceil(x)+" "+
                Math.floor(x));
        scanner.close();
        //

    }
}

