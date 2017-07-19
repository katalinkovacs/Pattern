package childcare;

import java.util.Scanner;


public class StartApp2 {

    public static void main(String[] args) {


        ChildCare cc = new ChildCare();

        cc.setCcName("One Tree Altona Meadows");
        System.out.println(cc.getCcName());

        cc.initializeChildren();
        cc.getChildren().add(new Child("Sebastian Kovacs", 33, "Toddler"));
        cc.getChildren().add(new Child("Rory Smith", 30, "Toddler"));
        cc.getChildren().add(new Child("Kylie Key", 29, "Toddler"));
        cc.getChildren().add(new Child("Nina Phan", 16, "Baby"));
        cc.getChildren().add(new Child("Reka Kallay", 10, "Baby"));
        cc.getChildren().add(new Child("Kornel Nagy", 40, "Kinder"));
        cc.getChildren().add(new Child("Bulcsu Kantor", 42, "Kinder"));


        //Scanner scanner = new Scanner(System.in);
        //System.out.print("What is your child's name? ");
        //String name = scanner.next();

        for (Child c : cc.getChildren()) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("What is your child's name? ");
            String name = scanner.next();

            if(name == "Sebastian Kovacs"){
                System.out.println("Hello Sebi!");
            }

            if (name == c.getName()) {
                //System.out.println("Your child's name is: " + name);
                //System.out.println(c);
                System.out.println("Your child's name is: " + c.getName() + ". Age is: " + c.getAgeInMonth() + " months. Room is: " + c.getRoom());
            }
        }


/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your child's name? ");
        String name = scanner.next();
        System.out.println("Your child's name is: " + name);
*/



        System.out.println("MAIN ENDED.................");
    }

}

