package childcare;

import java.util.ArrayList;
import java.util.List;


public class ChildCare {

    private List<Child> children;

    private String ccName;


    public ChildCare(){

        ccName = "one tree";
        // children = new ArrayList<>();
    }


    public void initializeChildren(){
        //create a new arraylist ready to add children
         children = new ArrayList<Child>();
    }


    public String getCcName(){
        return ccName;
    }


    public List<Child> getChildren() {
        return children;
    }





}