package GUIs;

public class serialization_73 {
    // a process that converts an objects into a byte stream
    //STEPS:
    //1. object should implement serializable interface
    //2. add import
    //3. do an instance of the Fileoutputstream class
    //4. do an instance of the Objectoutputstream class
    //5. out.writeObject(objectname)
    //6. out.close(); fileOut.close();



    public static void main(String[] args) {

        User user = new User();
        user.name = "Bro";
        user.password = "Pizza";

        user.sayHello();

    }

}

class User {
    String name;
    String password;

    public void sayHello() {
        System.out.println("Hello");
    }
}