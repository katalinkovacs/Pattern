package tutorialspoint.method;


public class MethodTest {

/*
    modifier returnType nameOfMethod (Parameter List) {
        // method body
    }
*/

    public static void main(String[] args) {

        int a = 11;
        int b = 6;



        int c = minFunction(a, b);
        System.out.println("Minimum Value = " + c);
        System.out.println(minFunction(a, b));
        System.out.println(minFunction(2, 9));
        System.out.println(maxFunction(a, b));
        System.out.println(addNumbers(a, b));


    }

    /**
     * returns the minimum of two numbers
     */
    public static int minFunction(int n1, int n2) {      // STATIC ???????????????
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    public static int maxFunction(int n1, int n2) {
        int max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;

        return max;
    }


    public static int addNumbers(int n1, int n2) {

        int total;
        total =+ n1 + n2;
        return total;
    }


}
