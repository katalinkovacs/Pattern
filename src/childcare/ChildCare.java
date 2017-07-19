package childcare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ChildCare {

    private List<Child> children;
    private String ccName;
    private HashMap<Child, ChildCare> childrenMap;


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






}