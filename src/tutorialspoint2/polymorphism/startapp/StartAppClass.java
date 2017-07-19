package tutorialspoint2.polymorphism.startapp;


import tutorialspoint2.polymorphism.BaseClass;
import tutorialspoint2.polymorphism.DerivedClass;

public class StartAppClass {

    public static void main (String args []) {

        // BaseClass reference and object
        BaseClass a = new BaseClass();

        // BaseClass reference but DerivedClass object
        BaseClass b = new DerivedClass();

        // Calls the method from BaseClass class
        a.methodToOverride();

        System.out.println("----------------------------");

        //Calls the method from DerivedClass class
        b.methodToOverride();

        System.out.println("----------------------------");

        a.method2();

        System.out.println("----------------------------");

        b.method2();
        System.out.println("----------------------------");

        DerivedClass c = new DerivedClass();

        c.methodToOverride();
        System.out.println("----------------------------");
        c.method2();


    }

}
