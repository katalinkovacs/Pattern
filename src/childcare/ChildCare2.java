package childcare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ChildCare2 {

    private List<Child2> children;

    private String ccName;

    private List<Child2> babyRoomList;
    private List<Child2> toddlerRoomList;
    private List<Child2> kinderRoomList;



    // GETTERS AND SETTERS

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public String getCcName(){
        return ccName;
    }

    public List<Child2> getChildren() {
        return children;
    }

    public void setChildren(List<Child2> children) {
        this.children = children;
    }

    public List<Child2> getBabyRoomList() {
        return babyRoomList;
    }

    public void setBabyRoomList(List<Child2> babyRoomList) {
        this.babyRoomList = babyRoomList;
    }

    public List<Child2> getToddlerRoomList() {
        return toddlerRoomList;
    }

    public void setToddlerRoomList(List<Child2> toddlerRoomList) {
        this.toddlerRoomList = toddlerRoomList;
    }

    public List<Child2> getKinderRoomList() {
        return kinderRoomList;
    }

    public void setKinderRoomList(List<Child2> kinderRoomList) {
        this.kinderRoomList = kinderRoomList;
    }


    // METHODS

    //create a new arraylist ready to add children
    public void initializeChildren(){

        children = new ArrayList<Child2>();
    }

    public void findYourChildByName(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your child's Firstname? ");
        String fname = scanner.next();
        System.out.print("What is your child's Lastname? ");
        String lname = scanner.next();

        for (Child2 c : getChildren()) {

            if( (fname.equals(c.getFirstName())) && (lname.equals(c.getLastName()))){
                System.out.println("Your child's name is: " + c.getFirstName() +" " + c.getLastName() + ". Age is: " + c.getAgeInMonth() + " months.");
            }
        }
    }

    public void listChildren(){

        System.out.println("Listing children at "+getCcName());
        for (Child2 c : getChildren()) {
            //System.out.println(c);
            System.out.println("FirstName is: " + c.getFirstName() +". LastName is: " + c.getLastName() + ". Age is: " + c.getAgeInMonth() + " months.");

        }
    }



}
