package tutorialspoint2.datastructure.vectorandstack;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String args[]) {

        // initial size is 3, increment is 2
        Vector v = new Vector(3, 2);

        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("--------------------------");

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));

        System.out.println("Initial size after addig 4: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("--------------------------");


        v.addElement(new Double(5.45));
        System.out.println("Initial size adding 1 more: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("--------------------------");


        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Initial size adding 2 more: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("--------------------------");


        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Initial size adding 2 more: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("--------------------------");


        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element: " + (Integer)v.firstElement());
        System.out.println("Last element: " + (Integer)v.lastElement());

        //System.out.println("First element: " + (Double)v.firstElement());           ?????????????????????????????
        //System.out.println("Last element: " + (Double)v.lastElement());

        if(v.contains(new Integer(3)))
            System.out.println("vectorandstack contains 3");

        if(v.contains(new Float(9.4)))
            System.out.println("vectorandstack contains 9.4");

        // enumerate the elements in the vectorandstack.         // ?????????????????????
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vectorandstack:");

        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }

}
