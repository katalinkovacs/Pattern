package tutorialspoint.operators;


public class Operator {

    public static void main(String args[]) {

        String name = "James";

        // following will return true since name is type of String
        // ( Object reference variable ) instanceof  (class/interface type)
        boolean result = name instanceof String;
        System.out.println(result);

        boolean result2 = name == "Joe";
        System.out.println(result2);


        int a;
        int b = 5;
        a = 10;

        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);


        // variable x = (expression) ? value if true : value if false
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        a = 40;
        System.out.println("Value of a is : " + a);

        //value of 'b' is assigned to 'a'
        a = b;
        System.out.println("Value of a is : " + a);

        //addNumbers(2, 3);     //??????????????????????????????????

        System.out.println(addNumbers(2, 3));
        System.out.println(addNumbers(a, b));

        System.out.println(sum(a, b));
        System.out.println(sum(12, 24));

    }


        // ADDNUMBERS METHOD
        public static int addNumbers(int num1, int num2){
            int result = 0;
            result =  num1 + num2;
            return result;
        }

        public static int sum(int n1, int n2) {

            int sum;
            sum =+ n1 + n2;
            return sum;
        }



    }

