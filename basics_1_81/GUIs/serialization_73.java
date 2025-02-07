package basics_1_81.GUIs;

import java.io.*;

public class serialization_73 {
    // a process that converts an objects into a byte stream
    //STEPS:
    //1. object should implement serializable interface
    //2. add import
    //3. do an instance of the Fileoutputstream class
    //4. do an instance of the Objectoutputstream class
    //5. out.writeObject(objectname)
    //6. out.close(); fileOut.close();



    public static void main(String[] args) throws IOException {

        User user = new User();
        user.name = "Bro";
        user.password = "Pizza";

        FileOutputStream fileOut = new FileOutputStream("Java_learn//basics_1_81.acces_modifier_35.GUIs//UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved :)");

    }

}

class User implements Serializable {
    String name;
    String password;

    public void sayHello() {
        System.out.println("Hello");
    }
}