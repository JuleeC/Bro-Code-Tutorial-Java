package basics_1_81.GUIs;

import java.io.*;

public class adv_serialization_75 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //notes: 1.children classes of a parent that implements Serializiable will do as well
        //       2. static fields are not serialized
        //       3. the class definition is not recorded, cast it as the object type
        //       4. Fields declared as transient arent serialized, theyre ignored
        //       5. serialVersionUID is a unique version ID

        Userr user = null;
        FileInputStream filein = new FileInputStream("C://Users//jules//Documents//GitHub//Java_learn//basics_1_81.acces_modifier_35.GUIs//UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(filein);
        user = (Userr) in.readObject();
        in.close();
        filein.close();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}

class Userr implements Serializable{
    transient String name;
    transient String password;

    private static final long serialVersionUID = 1;


    public void sayHello() {
        System.out.println("Hello" + name );
    }
}