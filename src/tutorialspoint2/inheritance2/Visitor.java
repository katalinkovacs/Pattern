package tutorialspoint2.inheritance2;


public class Visitor extends People {

    private int visitorNumber;

    public Visitor(){

    }

    public Visitor(String name, int visitorNumber){
        super(name);
        this.visitorNumber = visitorNumber;

    }


    public int getVisitorNumber() {
        return visitorNumber;
    }

    public void setVisitorNumber(int visitorNumber) {
        this.visitorNumber = visitorNumber;
    }
}
