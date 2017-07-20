package childcare;


import java.util.*;

public class StartApp4 {

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


        Map<String, String> mapBabies = new HashMap<String, String>();
        Map<String, String> mapToddlers = new HashMap<String, String>();
        Map<String, String> mapKinders = new HashMap<String, String>();

        for (Child c : cc.getChildren()) {

            if( (c.getRoom() == "Baby")){
                mapBabies.put(c.getFirstName() +" " +c.getLastName(), cc.getCcName());
            }else if( (c.getRoom() == "Toddler")){
                mapToddlers.put(c.getFirstName() +" " +c.getLastName(), cc.getCcName());
            }else if( (c.getRoom() == "Kinder")){
                mapKinders.put(c.getFirstName() +" " +c.getLastName(), cc.getCcName());
            }else{
                System.out.println("Exception Handling-----------------");
            }
        }

        System.out.println("Babies are: " + mapBabies);
        System.out.println("Toddlers are: " + mapToddlers);
        System.out.println("Kinders are: " + mapKinders);

/*
        // Display content using Iterator
        Set set = mapBabies.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is: " + mentry.getKey() + ". Value is: " +mentry.getValue());
        }
*/
        System.out.println("----------------------------------------");


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
                mapBabies.put(c.getFirstName() +" " +c.getLastName(), cc2.getCcName());
            }else if( (c.getRoom() == "Toddler")){
                mapToddlers.put(c.getFirstName() +" " +c.getLastName(), cc2.getCcName());
            }else if( (c.getRoom() == "Kinder")){
                mapKinders.put(c.getFirstName() +" " +c.getLastName(), cc2.getCcName());
            }else{
                System.out.println("Exception Handling-----------------");
            }
        }

        System.out.println("Babies are: " + mapBabies);
        System.out.println("Toddlers are: " + mapToddlers);
        System.out.println("Kinders are: " + mapKinders);

        System.out.println("----------------------------------------");


        System.out.println("Baby room: ");
        // Display content using Iterator
        Set set = mapBabies.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println(mentry.getKey() +" at "+mentry.getValue());
        }

        System.out.println();

        System.out.println("Toddler room: ");
        // Display content using Iterator
        Set set2 = mapToddlers.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.println(mentry2.getKey() +" at "+mentry2.getValue());
        }


        System.out.println();

        System.out.println("Kinder room: ");
        // Display content using Iterator
        Set set3 = mapKinders.entrySet();
        Iterator iterator3 = set3.iterator();
        while(iterator3.hasNext()) {
            Map.Entry mentry3 = (Map.Entry)iterator3.next();
            System.out.println(mentry3.getKey() +" at "+mentry3.getValue());
        }



    }


}
