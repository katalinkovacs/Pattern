package tutorialspoint2.abstraction;


public abstract class Employee {

    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }


    // SETTER GETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    //METHODS


    public void mailCheck() {
        System.out.println("EMPLOYEE - Mailing a check to " + this.name + " " + this.address);
    }

    public abstract double computePay() ;   // ABSTRACT METHOD CANT HAVE BODY!!!


}
