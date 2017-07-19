package tutorialspoint2.polymorphism;


public class DerivedClass extends BaseClass {

    public void methodToOverride() //Derived Class method
    {
        System.out.println ("DerivedClass method");
    }

    public void method2()     //Base class method
    {
        super.method2();
        System.out.println ("DerivedClass method2");
    }
}
