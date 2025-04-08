package java.basics.basics_1_81.overloaded_constructors_26;

public class Main {
    public static void main(String[] args) {


        Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
}
}
