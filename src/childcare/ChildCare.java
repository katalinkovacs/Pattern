package childcare;

import java.util.ArrayList;
import java.util.List;


public class ChildCare {

    private List<Child> children;


    public ChildCare(){

        children = new ArrayList<>();
    }


    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }




}
