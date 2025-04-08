package java.basics.basics_1_81.static_keyword_30;

public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }
    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
