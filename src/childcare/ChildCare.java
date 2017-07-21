package childcare;

import java.util.*;


public class ChildCare {

    private List<Child> children;

    private String ccName;


    // GETTERS AND SETTERS

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public String getCcName(){
        return ccName;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }


    // METHODS

    //create a new arraylist ready to add children
    public void initializeChildren(){

        children = new ArrayList<Child>();
    }

    public void findYourChildByName(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your child's Firstname? ");
        String fname = scanner.next();
        System.out.print("What is your child's Lastname? ");
        String lname = scanner.next();

        for (Child c : getChildren()) {

            if( (fname.equals(c.getFirstName())) && (lname.equals(c.getLastName()))){
                System.out.println("Your child's name is: " + c.getFirstName() +" " + c.getLastName() + ". Age is: " + c.getAgeInMonth() + " months. Room is: " + c.getRoom());
            }
        }
   }

   public void listChildren(){

       System.out.println("Listing children at "+getCcName());
       for (Child c : getChildren()) {
           //System.out.println(c);
           System.out.println("FirstName is: " + c.getFirstName() +". LastName is: " + c.getLastName() + ". Age is: " + c.getAgeInMonth() + " months. Room is: " + c.getRoom());

       }
   }



}
