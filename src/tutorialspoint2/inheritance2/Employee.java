package tutorialspoint2.inheritance2;


public class Employee extends People{

    private int employeeId;

    public Employee(){

    }

    public Employee(String name, int employeeId){
        super(name);
        this.employeeId = employeeId;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
