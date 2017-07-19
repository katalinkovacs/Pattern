package tutorialspoint2.collection;


import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {

        // Create the sorted set
        SortedSet set = new TreeSet();

        // Add elements to the set
        set.add("b");
        set.add("c");
        set.add("a");
        set.add("f");
        set.add("z");



        // Iterating over the elements in the set
        Iterator i = set.iterator();                //???????????????????????????????????????????????

        while (i.hasNext()) {
            // Get element
            Object element = i.next();
            System.out.println(element.toString());
        }

        System.out.println("--------------------------------------------");

        SortedSet set2 = new TreeSet();

        set2.add("kati");
        set2.add("Kati");
        set2.add("anya");
        set2.add("joska");
        set2.add("sebi");
        set2.add("Sebi");

        // Iterating over the elements in the set
        Iterator i2 = set2.iterator();

        while (i2.hasNext()) {
            // Get element
            Object element = i2.next();
            System.out.println(element.toString());
        }

        System.out.println("--------------------------------------------");

        SortedSet set3 = new TreeSet();

        set3.add(1);
        set3.add(22);
        set3.add(1248);

        Iterator i3 = set3.iterator();

        while (i3.hasNext()) {
            Object element = i3.next();
            System.out.println(element.toString());
        }



    }
}
