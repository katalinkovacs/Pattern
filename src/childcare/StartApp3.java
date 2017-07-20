package childcare;


import java.util.ArrayList;

public class StartApp3 {

    public static void main(String[] args) {


        ChildCare cc = new ChildCare();

        cc.setCcName("One Tree Altona Meadows");

        cc.initializeChildren();
        cc.getChildren().add(new Child("Sebastian", "Kovacs", 33, "Toddler"));
        cc.getChildren().add(new Child("Rory", "Smith", 30, "Toddler"));
        cc.getChildren().add(new Child("Kylie", "Key", 29, "Toddler"));
        cc.getChildren().add(new Child("Nina", "Phan", 16, "Baby"));
        cc.getChildren().add(new Child("Reka", "Kallay", 10, "Baby"));
        cc.getChildren().add(new Child("Kornel", "Nagy", 40, "Kinder"));
        cc.getChildren().add(new Child("Bulcsu", "Kantor", 42, "Kinder"));

        System.out.println("-----------------------------------------------------------");


        ArrayList<String> babies = new ArrayList<String>();

        for (Child c : cc.getChildren()) {

            if( (c.getRoom() == "Baby")){
                //System.out.println(c.getFirstName() + " " +c.getLastName());
                babies.add(c.getFirstName() +" " +c.getLastName());
            }
        }

        System.out.println("There are: " + babies.size() +" babies in the Baby room."  );

        for ( int i = 0; i < babies.size(); i++ ){
            //System.out.println("Element " +i + ": " + babies.get(i) );
            System.out.println(babies.get(i) );
        }



        ChildCare cc2 = new ChildCare();
        cc2.setCcName("One Tree Altona");
        //System.out.println(cc2.getCcName());

        cc2.initializeChildren();
        cc2.getChildren().add(new Child("Maria", "Gerber", 33, "Toddler"));
        cc2.getChildren().add(new Child("Andrea", "Kerekes", 30, "Toddler"));
        cc2.getChildren().add(new Child("Ilona", "Nagy", 29, "Toddler"));
        cc2.getChildren().add(new Child("Istvan", "Kovacs", 16, "Baby"));
        cc2.getChildren().add(new Child("Csanad", "Kallay", 10, "Baby"));
        cc2.getChildren().add(new Child("Krisztina", "Kovacs", 40, "Kinder"));
        cc2.getChildren().add(new Child("Rita", "Hatala", 42, "Kinder"));


        for (Child c : cc2.getChildren()) {

            if( (c.getRoom() == "Baby")){
                //System.out.println(c.getFirstName() + " " +c.getLastName());
                babies.add(c.getFirstName() +" " +c.getLastName());
            }
        }

        //System.out.println("Size of babies array is: " + babies.size() );
        System.out.println("There are: " + babies.size() +" babies in the Baby room."  );


        for ( int i = 0; i < babies.size(); i++ ){
            //System.out.println("Element " +i + ": " + babies.get(i) );
            System.out.println(babies.get(i) );
        }


    }

}




