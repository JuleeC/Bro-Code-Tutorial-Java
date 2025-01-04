package Constructors_24;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Rick",56,85.3);
        Human human2 = new Human("Morty",16,50);

        System.out.println(human.age);
        System.out.println(human2.weight);

        human2.eat();
        human.drink();
    }
}
