package tutorialspoint2.collection;

import java.util.*;


public class CollectionsDemo {

    public static void main(String[] args) {


        // ArrayList 1
        List a1 = new ArrayList();
        a1.add("Sebi");
        a1.add("Oli");
        a1.add("Reka");
        System.out.println("First ArrayList Elements are: " + a1);


        // ArrayList 2
        List<Number> a2 = new ArrayList<Number>();
        a2.add(2);
        a2.add(156.8);
        a2.add(7890);
        System.out.println("Second ArrayList Elements are: " + a2);
        //System.out.print("\t" + a);


        // LinkedList 1
        List l1 = new LinkedList();
        l1.add("Zoli");
        l1.add("Lali");
        l1.add("Andi");
        System.out.println("First LinkedList Elements are: " + l1);

        // LinkedList 2
        List<Number> l2 = new LinkedList<Number>();
        l2.add(12);
        l2.add(22);
        l2.add(32);
        System.out.println("Second LinkedList Elements are: " + l2);

        System.out.println("for loop will start....");
        for(Number counter: l2){
            System.out.println("in for loop." + counter);
        }

        System.out.println("----------------------------------------");

        // HashSet 1
        Set hs1 = new HashSet();
        hs1.add("Bobe");
        hs1.add("Bibe");
        hs1.add("Bubu");
        System.out.println("First Set Elements are: " + hs1);

        // HashSet 2
        HashSet<Number> hs2 = new HashSet<Number>();
        hs2.add(33);
        hs2.add(43);
        hs2.add(53);
        System.out.println("Second Set Elements are: " + hs2);



        // HashMap 1
        Map hm1 = new HashMap();
        hm1.put("Kati", "42");
        hm1.put("Sebi", "2.5");
        hm1.put("Zoli", "41");
        hm1.put("Andi", "47");
        System.out.println("First Map Elements are: " + hm1);

        System.out.println("Display content using Iterator: ");

        // Display content using Iterator
        Set set = hm1.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        System.out.println("----------------------------------------");

        // Get values based on key
        Object var2 = hm1.get("Kati");                                   //????????????????/  NUMBER --> OBJECT
        System.out.println("Value at index-(key) 'Kati' is: " + var2);

        // HashMap 2
        HashMap<Number, String> hm2 = new HashMap<Number, String>();
        hm2.put(42, "Kati");
        hm2.put(2.7, "Sebi");
        hm2.put(41, "Zoli");
        hm2.put(47.0777, "Andi");
        System.out.println("Second Map Elements are: " + hm2);


        // Get values based on key
        String var = hm2.get(42);
        System.out.println("Value at index-(key) '42' is: " + var);
    }
}


