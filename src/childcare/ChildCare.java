package childcare;

import java.util.List;


public class ChildCare {

    private List<Child> children;


    public ChildCare(){

       // children = new ArrayList<>();
    }


    public void initializeChildren(){
        //create a new arralist ready to add children
        children = new java.util.ArrayList<Child>();
    }


    public List<Child> getChildren() {
        return children;
    }





}
