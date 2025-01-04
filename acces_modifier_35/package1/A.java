package acces_modifier_35.package1;
import acces_modifier_35.package2.*;
public class A {
    protected String protectedMessage = "This is protected ";
    public static void main(String[] args) {
        C c = new C();
       // System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage);
        B b = new B();
        //not working because its private
       //System.out.println(b.privateMessage);

    }
}
