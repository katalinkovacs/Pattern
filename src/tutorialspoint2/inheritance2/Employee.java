package tutorialspoint2.inheritance2;


public class Employee extends People{

    private int employeeId;


    public Employee(String name, Boolean isEmp, int employeeId){
        super(name, isEmp);
        this.employeeId = employeeId;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void working(){
        System.out.println("working");
    }
}
