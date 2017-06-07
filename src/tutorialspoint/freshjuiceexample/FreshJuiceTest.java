package tutorialspoint.freshjuiceexample;


public class FreshJuiceTest {

    public static void main(String args[]) {

        FreshJuice juice1 = new FreshJuice();
        juice1.size = FreshJuice.FreshJuiceSize.MEDIUM ;
        System.out.println("Size: " + juice1.size);

        FreshJuice juice2 = new FreshJuice();
        juice2.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println("Size: " + juice2.size);

        // FreshJuice juice3 = new FreshJuice(SMALL);  !!!!!!!!


    }
}
