package childcare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ChildCare {

    private List<Child> children;

    private String ccName;


    //private HashMap<Child, ChildCare> childrenMap;


 /*

    public ChildCare(){

        ccName = "one tree";
        // children = new ArrayList<>();
    }

 */

    //create a new arraylist ready to add children
    public void initializeChildren(){
         children = new ArrayList<Child>();
    }


    /*
    public void initializeChildrenMap(){
        childrenMap = new HashMap<Child,ChildCare>();
    }
*/


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


    /*
    public HashMap<Child, ChildCare> getChildrenMap() {
        return childrenMap;
    }

    public void setChildrenMap(HashMap<Child, ChildCare> childrenMap) {
        this.childrenMap = childrenMap;
    }

    */

    public void findYourChildByName(String fname, String lname){

        for (Child c : cc.getChildren()) {


            if( (fname.equals(c.getFirstName())) && (lname.equals(c.getLastName()))){
                System.out.println("Your child's name is: " + c.getFirstName() +" " + c.getLastName() + ". Age is: " + c.getAgeInMonth() + " months. Room is: " + c.getRoom());
            }

        }
   }

}
