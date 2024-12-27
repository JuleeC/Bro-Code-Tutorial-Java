package static_keyword;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("aa");
        Friend friend2 = new Friend("dd");
        Friend friend3 = new Friend("cc");
        System.out.println(Friend.numberOfFriends);
    }
}
