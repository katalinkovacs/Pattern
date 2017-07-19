package tutorialspoint2.datastructure.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;


public class HashtableExample {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        // Creating a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        System.out.println("Hashtable created.");

        // Adding Key and Value pairs to Hashtable
        hashtable.put("Key1","Sebi");
        hashtable.put("Key2","Oli");
        hashtable.put("Key3","Kornel");
        hashtable.put("Key4","Bulcsu");
        hashtable.put("Key5","Reka");


        names = hashtable.keys();
        while(names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +
                    hashtable.get(key));
        }
    }
}
