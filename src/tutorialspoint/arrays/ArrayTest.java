package tutorialspoint.arrays;


public class ArrayTest {

    public static void main(String args[]) {

        double[] myList = {1.9, 2.9, 3.4, 3.5, 0.2};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] );
        }

        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
            System.out.println("Total is in the loop: " + total);
        }
        System.out.println("The final total is: " + total);

        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
            System.out.println("Max is in the loop: " + max);
        }
        System.out.println("Max is " + max);

        // i = 0 OR i = 1  ?????????????????????????????????????????
        double min = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min) min = myList[i];
            System.out.println("Min is in the loop: " + min);
        }
        System.out.println("Min is " + min);
    }
}
