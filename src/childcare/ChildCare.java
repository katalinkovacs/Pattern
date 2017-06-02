package childcare;

import java.util.List;


public class ChildCare {

    private List<Child> children;

    private String ccName;


    public ChildCare(){

        ccName = "one tree";
       // children = new ArrayList<>();
    }


    public void initializeChildren(){
        //create a new arralist ready to add children
       // children = new java.util.ArrayList<Child>();
    }


    public String getCcName(){
        return ccName;
    }


    public List<Child> getChildren() {
        return children;
    }





}
