package childcare;

import java.util.ArrayList;
import java.util.Scanner;


public class StartApp2 {

    public static void main(String[] args) {

        System.out.println("MAIN STARTED.................");


        ChildCare cc = new ChildCare();

        cc.setCcName("One Tree Altona Meadows");
        System.out.println(cc.getCcName());

        cc.initializeChildren();
        cc.getChildren().add(new Child("Sebastian", "Kovacs", 33, "Toddler"));
        cc.getChildren().add(new Child("Rory", "Smith", 30, "Toddler"));
        cc.getChildren().add(new Child("Kylie", "Key", 29, "Toddler"));
        cc.getChildren().add(new Child("Nina", "Phan", 16, "Baby"));
        cc.getChildren().add(new Child("Reka", "Kallay", 10, "Baby"));
        cc.getChildren().add(new Child("Kornel", "Nagy", 40, "Kinder"));
        cc.getChildren().add(new Child("Bulcsu", "Kantor", 42, "Kinder"));

/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your child's Firstname? ");
        String fname = scanner.next();
        System.out.print("What is your child's Lastname? ");
        String lname = scanner.next();

*/


/*
        if(fname.equals("Sebastian")){
            System.out.println("Hello Sebi!");
        }

        if(lname.equals("Kovacs")){
            System.out.println("Hello Kovi!");
        }

*/

        //System.out.println("findYourChildByName METHOD WILL BE CALLED");
        //cc.findYourChildByName();
        //System.out.println();
        //cc.listChildren();
        cc.listBabies();

/*

        for (Child c : cc.getChildren()) {

            //System.out.println("In the for loop.........................");

            //System.out.print("Your child's firstname is: " +fname +" Your child's lastname is: " +lname);
            //System.out.print("Your child's lastname is: " +lname);
            //System.out.println();


            if( (fname.equals(c.getFirstName())) && (lname.equals(c.getLastName()))){
                System.out.println("Your child's name is: " + c.getFirstName() +" " + c.getLastName() + ". Age is: " + c.getAgeInMonth() + " months. Room is: " + c.getRoom());
            }

            if (name == c.getName()) {
                //System.out.println("Your child's name is: " + name);
                //System.out.println(c);
                System.out.println("Your child's name is: " + c.getName() + ". Age is: " + c.getAgeInMonth() + " months. Room is: " + c.getRoom());
            }


        }
*/


        System.out.println("-----------------------------------------------------------");

        ArrayList<String> babies = new ArrayList<String>();

        for (Child c : cc.getChildren()) {

            if( (c.getRoom() == "Baby")){
                System.out.println(c.getFirstName() + " " +c.getLastName());
                babies.add(c.getFirstName() +" " +c.getLastName());
            }
        }



        System.out.println("Size of babies array is: " + babies.size() );


        // Access and print out the Objects
        for ( int i = 0; i < babies.size(); i++ ){
            System.out.println("Element " +i + ": " + babies.get(i) );
    }



        ChildCare cc2 = new ChildCare();
        cc2.setCcName("One Tree Altona");
        System.out.println(cc2.getCcName());

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
                System.out.println(c.getFirstName() + " " +c.getLastName());
                babies.add(c.getFirstName() +" " +c.getLastName());
            }
        }



        System.out.println("Size of babies array is: " + babies.size() );


        // Access and print out the Objects
        for ( int i = 0; i < babies.size(); i++ ){
            System.out.println("Element " +i + ": " + babies.get(i) );
        }



        System.out.println();
        System.out.println("MAIN ENDED.................");
    }

}

