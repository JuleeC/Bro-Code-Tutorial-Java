package algorithms_82;

import java.util.Hashtable;

public class hashtable_89 {
    //Hashtable = a data structure that stores unique keys to values ex. <Integer,String>
    //            each key/value pair is known as an entry
    //            Fast insertion, look up, deletion of key/value pairs

    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>(21);

        table.put("100","Spongebob");
        table.put("123","sandy");
        table.put("321", "patrick");
        table.put("555", "Squidward");

        //table.remove(777);

        for(String key : table.keySet()) {
            System.out.println(key.hashCode() % 21 + "  " + key + "  " + table.get(key));
        }


    }
}
