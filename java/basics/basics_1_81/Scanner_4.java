package java.basics.basics_1_81;

public class Scanner_4 {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.nextLine();

        System.out.println("What is your age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favourite food");
        String food = scanner.nextLine();


        System.out.println(name);
        System.out.println(age);

//
    }
}
