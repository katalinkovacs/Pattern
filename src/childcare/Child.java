package childcare;


public class Child {

    private String firstName;
    private String lastName;
    private int ageInMonth;
    private String room;

    public Child(){

    }

    public Child(String firstName, String lastName, int ageInMonth, String room){
       //System.out.println("In CONSTRUCTOR with ARGS");
       this.firstName = firstName;
       this.lastName = lastName;
       this.ageInMonth = ageInMonth;
       this.room = room;
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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
