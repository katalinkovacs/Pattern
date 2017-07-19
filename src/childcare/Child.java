package childcare;


public class Child {

    private String name;
    private int ageInMonth;
    private String room;

    public Child(){

    }

    public Child(String name, int ageInMonth, String room){
       this.name = name;
       this.ageInMonth = ageInMonth;
        this.room = room;
    }


    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
