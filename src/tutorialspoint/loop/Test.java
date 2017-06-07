package tutorialspoint.loop;


public class Test {

    public static void main(String args[]) {

        int[] numbers = {10, 20, 30, 40, 50};

        /*
        for(declaration : expression) {
         // Statements
        }
        */
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }

        System.out.print("\n");

        String[] names = {"James", "Larry", "Tom", "Lacy"};

        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }

        System.out.println();

        int[] myNumbers = {0, 1, 2, 3, 4, 5};

        for (int i : myNumbers) {

            System.out.println(i + ", ");
        }

        for (int i = 0; i < myNumbers.length; i++) {

            System.out.print(i);

        }

        System.out.println();

        int i = 0;
        while (i < myNumbers.length ) {

            System.out.print(i);
            i++;

        }


    }
}