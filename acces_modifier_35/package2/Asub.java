package acces_modifier_35.package2;
import acces_modifier_35.package1.*;

public class Asub extends A{
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);

    }

}
