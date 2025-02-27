package algorithms_82;

import java.util.Hashtable;

public class hashtable_89 {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>(10);

        table.put("100","Spongebob");
        table.put("123","sandy");
        table.put("321", "patrick");
        table.put("555", "Squidward");

        //table.remove(777);

        for(String key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "  " + key + "  " + table.get(key));
        }


    }
}
