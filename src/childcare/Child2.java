package childcare;


public class Child2 {

    private String firstName;
    private String lastName;
    private int ageInMonth;
    //private String room;

    public Child2(){

    }

    public Child2(String firstName, String lastName, int ageInMonth){
        //System.out.println("In CONSTRUCTOR with ARGS");
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageInMonth = ageInMonth;
    }


    // GETTERS AND SETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAgeInMonth() {
        return ageInMonth;
    }

    public void setAgeInMonth(int ageInMonth) {
        this.ageInMonth = ageInMonth;
    }



}



