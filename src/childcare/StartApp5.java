package childcare;


public class StartApp5 {

    public static void main(String[] args) {

        ChildCare2 cc = new ChildCare2();

        cc.setCcName("One Tree Altona Meadows");


        cc.initializeChildren();

        Child2 c1 = new Child2("Sebastian", "Kovacs", 35);

        Child2 c2 = new Child2("Rory", "Smith", 30);

       /* cc.getChildren().add();
        cc.getChildren().add(new Child2("Bulcsu", "Kantor", 42));
        cc.getChildren().add(new Child2("Nina", "Phan", 16));
        cc.getChildren().add(new Child2("Reka", "Kallay", 10));
        cc.getChildren().add(new Child2("Kornel", "Nagy", 40));
        cc.getChildren().add(new Child2("Kylie", "Key", 29));
        cc.getChildren().add(new Child2("Dorka", "Molnar", 36));
        cc.getChildren().add(new Child2("Max", "Olah", 25));*/


        System.out.println("-----------------------------------------------------------");


        cc.enrollChild(c1);
        cc.enrollChild(c2);



       /* for (Child2 c : cc.getChildren()) {

            if ((c.getAgeInMonth() <= 25)) {
                System.out.println("Baby under 0 - 25m " + c.getFirstName());
                //babyRoomList.put(c.getFirstName() +" " +c.getLastName(), cc.getCcName());
            } else if ((c.getAgeInMonth() > 25 && c.getAgeInMonth() <= 35)) {
                System.out.println("Toddler 25m - 35m " + c.getFirstName());
                //mapToddlers.put(c.getFirstName() +" " +c.getLastName(), cc.getCcName());
            } else if ((c.getAgeInMonth() > 35)) {
                System.out.println("Kinder 35m + " + c.getFirstName());
                //mapKinders.put(c.getFirstName() +" " +c.getLastName(), cc.getCcName());
            } else {
                System.out.println("Some message-----------------");
            }


        }*/

    }
}