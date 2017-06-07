package tutorialspoint2.inheritance2;


public class Visitor extends People {

    private int visitorNumber;


    public Visitor (String name, boolean isEmp, int visitorNumber){
        super(name, isEmp);
        this.visitorNumber = visitorNumber;
    }


    public int getVisitorNumber() {
        return visitorNumber;
    }

    public void setVisitorNumber(int visitorNumber) {
        this.visitorNumber = visitorNumber;
    }
}
