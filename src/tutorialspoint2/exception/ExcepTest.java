package tutorialspoint2.exception;


public class ExcepTest {

    public static void main(String args[]) {
        try {
            //int [] a = new int[2];
            int [] a = {0, 1, 2};
            //a[0] = 10;
            //a[1] = 20;
            //a[2] = 30;

            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}
