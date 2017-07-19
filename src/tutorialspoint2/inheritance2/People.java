package tutorialspoint2.inheritance2;


public abstract class People extends Zoo {

    private boolean isEmp;


    public People(String name, boolean isEmp){
        super(name);
        this.isEmp = isEmp;
    }


    public boolean isEmp() {
        return isEmp;
    }

    public void setEmp(boolean emp) {
        isEmp = emp;
    }

    public void simplePerson(){
        System.out.println("just a person");
    }
}
