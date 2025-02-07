package basics_1_81.package1;
import basics_1_81.acces_modifier_35.package2.*;
import basics_1_81.package2.C;

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
