package childcare;



public class App {

    public static void main(String args[]) {

        ChildCare cc = new ChildCare();
        cc.getChildren().add(new Child("sebi"));
        cc.getChildren().add(new Child("mari"));


        for (Child c : cc.getChildren()){

            System.out.println(c.getName());
        }




    }
}
