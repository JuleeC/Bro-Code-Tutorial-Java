import java.util.Scanner;
public class logical_operators {
    public static void main(String[] args) {
        int temp = 15;

        if(temp>30) {
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }
//EXAMPLE 2
        Scanner scanner = new Scanner(System.in);

        System.out.println("playing game");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("still playing");
        }
        else {
            System.out.println("You quit the game");
        }
        //

    }
}
