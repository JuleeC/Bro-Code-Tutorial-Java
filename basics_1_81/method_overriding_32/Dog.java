package basics_1_81.method_overriding_32;

public class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("The dog goes *bark*");
}
}
