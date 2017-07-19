package tutorialspoint2.abstraction;


public class Salary extends Employee {

    private double salary;   // Annual salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);       // ???????????????????????????????
        //this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    // METHODS

    public void mailCheck() {
        System.out.println("SALARY - Mailing check to " + getName() + " with salary " + salary);
    }


    public double computePay() {                           // EMPLOYEE ABSTRACT METHOD MUST BE IMPLEMENTED!!!!!!!!!!
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }





}
