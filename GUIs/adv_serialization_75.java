package GUIs;

public class adv_serialization_75 {
    public static void main(String[] args) {
        //notes: 1.children classes of a parent that implements Serializiable will do as well
        //       2. static fields are not serialized
        //       3. the class definition is not recorded, cast it as the object type
        //       4. Fields declared as transient arent serialized, theyre ignored
        //       5. serialVersionUID is a unique version ID
    }
}
