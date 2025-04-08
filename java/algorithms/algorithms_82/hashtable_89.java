package java.algorithms.algorithms_82;

import java.util.Hashtable;

public class hashtable_89 {
    //Hashtable = a data structure that stores unique keys to values ex. <Integer,String>
    //            each key/value pair is known as an entry
    //            Fast insertion, look up, deletion of key/value pairs
    //            Not ideal for small data sets, great with large data sets

    //            hashing = takes a key and computes an integer (formula will vary based on key & data type)
    //                      In a Hashtable, we use the hash % capacity to calculate an index number

    //                      key.HashCode() % capacity = index
    //
    //            bucket = an indexed storage location for one or more Entries
    //                     can store multiple Entries in case of a collision (linked similarly a LinkedList)

    //            collision = hash function generates the same index for more than one key
    //                        less collision = more efficiency

    //            Run-time complexity : Best Case O(1)
    //                                  Worst Case O(n)

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
