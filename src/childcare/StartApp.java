package childcare;


public class StartApp {

    public static void main(String args[]) {

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

        for (Child c : cc.getChildren()) {
            //System.out.println(c);
            System.out.println("FirstName is: " + c.getFirstName() +". LastName is: " + c.getLastName() + ". Age is: " + c.getAgeInMonth() + " months. Room is: " + c.getRoom());

        }
            System.out.println("-------------------------------------------------------------");


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
            //System.out.println(c);
            System.out.println("FirstName is: " + c.getFirstName() +". LastName is: " + c.getLastName() + ". Age is: " + c.getAgeInMonth() + " months. Room is: " + c.getRoom());

        }


        }
    }

