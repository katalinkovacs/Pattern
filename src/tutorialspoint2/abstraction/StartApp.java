package tutorialspoint2.abstraction;


public class StartApp {

    public static void main(String [] args) {

        Salary s = new Salary("K Kovacs", "Altona M", 56, 3600.00);

        Employee e = new Salary("B Kallay", "Nyiregyhaza", 41, 2400.00);

        //System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        //System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
