package tutorialspoint.employee;
import java.io.*;


public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    // This is the constructor of the class tutorialspoint.employee.Employee
    public Employee(String name) {
        this.name = name;
    }

    // Assign the age of the tutorialspoint.employee.Employee  to the variable age.
    public void empAge(int empAge) {
        age = empAge;
    }

    /* Assign the designation to the variable designation.*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* Assign the salary to the variable	salary.*/
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* Print the tutorialspoint.employee.Employee details */
    public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }
}